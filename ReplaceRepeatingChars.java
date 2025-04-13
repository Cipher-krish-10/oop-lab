import java.util.*;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Get the input word
        System.out.println("Enter a word:");
        String word = sc.nextLine();

        String result= RemoveRepeatingChar(word);

        System.out.println(result);
    }

    public static String RemoveRepeatingChar(String str){
        if(str.isEmpty())
        return str;

        String result = str.substring(0, 1);

        for(int i=1; i<str.length(); i++){
        String check= str.substring(i, i+1);

        if(!result.endsWith(check)){
         result= result + check;
        }
        }
        return result;
    }
}
    