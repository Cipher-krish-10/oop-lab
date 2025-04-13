import java.util.Scanner;

public class studentexception {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        int rollNumber;
        while (true) {
            try {
                System.out.print("Enter student's roll number: ");
                rollNumber = scanner.nextInt();
                scanner.nextLine(); // Consume newline left-over
                break;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid roll number.");
                scanner.nextLine(); // Consume invalid input
            }
        }

        double subject1Marks, subject2Marks, subject3Marks;
        while (true) {
            try {
                System.out.print("Enter marks in Subject 1 (out of 100): ");
                subject1Marks = scanner.nextDouble();
                if (subject1Marks < 0 || subject1Marks > 100) {
                    System.out.println("Invalid input. Please enter marks between 0 and 100.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Consume invalid input
            }
        }

        while (true) {
            try {
                System.out.print("Enter marks in Subject 2 (out of 100): ");
                subject2Marks = scanner.nextDouble();
                if (subject2Marks < 0 || subject2Marks > 100) {
                    System.out.println("Invalid input. Please enter marks between 0 and 100.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Consume invalid input
            }
        }

        while (true) {
            try {
                System.out.print("Enter marks in Subject 3 (out of 100): ");
                subject3Marks = scanner.nextDouble();
                if (subject3Marks < 0 || subject3Marks > 100) {
                    System.out.println("Invalid input. Please enter marks between 0 and 100.");
                } else {
                    break;
                }
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.nextLine(); // Consume invalid input
            }
        }

        double totalMarks = subject1Marks + subject2Marks + subject3Marks;
        double percentage = (totalMarks / 300) * 100;

        String grade;
        if (percentage >= 90) {
            grade = "A";
        } else if (percentage >= 80) {
            grade = "B";
        } else if (percentage >= 70) {
            grade = "C";
        } else if (percentage >= 60) {
            grade = "D";
        } else {
            grade = "F";
        }

        System.out.println("\nStudent's Details:");
        System.out.println("Name: " + name);
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Subject 1 Marks: " + subject1Marks);
        System.out.println("Subject 2 Marks: " + subject2Marks);
        System.out.println("Subject 3 Marks: " + subject3Marks);
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}