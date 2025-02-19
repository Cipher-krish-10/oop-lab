import java.util.Scanner;

public class ArrayOverflowExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5]; // Array of size 5
        System.out.print("Enter the array");
        for (int i = 0; i < 5; i++) { 
                numbers[i] = sc.nextInt(); }

                try{
                    System.out.println("enter the pos of array element you want to print");
                    int x=sc.nextInt();
                    System.out.println(numbers[x]);
                }
            catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: You have exceeded the array size. Please enter a number within the range.");
                
            }
        }
        }

        
