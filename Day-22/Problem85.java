//Program to Check palindrome string
import java.util.Scanner;
public class Problem85 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        String revString="";
        for(int i=0 ; i< str.length();i++){
            revString = str.charAt(i)+revString;
        }
        //checking if string is palindrome.
        if(str.equals(revString))
            System.out.println("Entered string is a Palindrome string");
        else
            System.out.println("Not a Palindrome string");
    }   
}
