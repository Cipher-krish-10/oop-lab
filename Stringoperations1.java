import java.util.Arrays;
import java.util.Scanner; // Correct import statement

public class Stringoperations1 {
    
    public static boolean isPalindrome(String str) {
        int i = 0;  
        int j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j)) {
                return false; // Not a palindrome
            }
            i++;  
            j--;
        }
        return true; // It is a palindrome
    }

    public static String sortString(String str) {
        char[] charArray = str.toCharArray(); // Convert string to character array
        Arrays.sort(charArray); // Sort the character array
        return new String(charArray); // Create a new string from the sorted array
    }

    public static String reverseString(String str) {
        StringBuilder sb = new StringBuilder(str); // Use the correct variable name
        return sb.reverse().toString(); // Reverse and convert to String
    }

    public static String concatenateStrings(String s1, String s2) {
        return s1 + s2; // Concatenate the two strings
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Check if the string is a palindrome");
            System.out.println("2. Write the string in alphabetical order");
            System.out.println("3. Reverse the string");
            System.out.println("4. Concatenate the original string and the reversed string");
            System.out.println("5. Exit");

            int choice = scanner.nextInt(); // Read user choice
            scanner.nextLine(); // Consume newline character

            if (choice == 5) {
                System.out.println("Exiting the program.");
                break;
            }

            System.out.print("Enter a string: ");
            String originalString = scanner.nextLine(); // Read the original string

            switch (choice) {
                case 1:
                    if (isPalindrome(originalString)) {
                        System.out.println(  " is a palindrome.");
                    } else {
                        System.out.println( " is not a palindrome.");
                    }
                    break;
                case 2:
                     
                    System.out.println(sortString(originalString));
                    break;
                case 3:
                    
                    System.out.println(reverseString(originalString));
                    break;
                case 4:
                    String reversedString = reverseString(originalString);
                    System.out.println(concatenateStrings(originalString, reversedString));
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
        
    }
}