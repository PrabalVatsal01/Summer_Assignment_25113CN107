//Program to Count words in a sentence.
import java.util.Scanner;
public class Problem86 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String str = input.nextLine();
        str = str.trim();
        int count=1;
        for(int i=0 ;i<str.length();i++){
            if(str.charAt(i)==' ')
                count++;
        }
        System.out.println("The number of words are: "+count);
    }
}
