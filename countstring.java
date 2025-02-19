import java.util.*;
public class countstring {
    public static void main(String[] args) {
        
     Scanner sc = new Scanner(System.in);
    System.out.println("Enter a string ");
    String str = sc.nextLine();
    int strvowel=0;
    for(int i =0; i<str.length(); i++){
        char ch=str.charAt(i);
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            strvowel++;
        }
    }
    String[] lines = str.split("\n");
        int lineCount = lines.length;
        
        System.out.println("The number of lines is: " + lineCount);
    String[] words = str.split("\\s+");
    System.out.println("The string has " + words.length + " words.");
    System.out.println("Vowels:"+strvowel);
    System.out.println("Characters:"+str.length());
    System.out.println(words[0]);
    
    }   
}
