import java.util.*;





public class Stringreverse {

    public static String sort(String str){
        char[] array= str.toCharArray();
        Arrays.sort(array);
        return new String(array);
    }

    public static String reversestring(String str){
        StringBuilder s = new StringBuilder(str);
        s.reverse();
        return s.toString();

    }
    public static String ispalindrome(String str){
        int i=0;
        int j=str.length()-1;

        while(j>i){
            if(str.charAt(i)!=str.charAt(j))
            return "Not a palindrome";
        i++; j--;
        }
        return "palindrome";            }
    public static void main(String[] args) {
        
    
    Scanner sc= new Scanner(System.in);
    while(true){
    System.out.println("Enter string");
    String str= sc.nextLine();
    System.out.println("1. Reverse a string\n 2. check if it is palindrome \n 3. sort the string");
    int choice= sc.nextInt();
    sc.nextLine(); // Consume the newline character
    
    switch(choice){
    case 1: 
    System.out.println(reversestring(str));
    break;
    
    case 2:
    System.out.println(ispalindrome(str));
    
    if(choice==5) break;
    case 3: 
    System.out.println(sort(str));
}}}
}

