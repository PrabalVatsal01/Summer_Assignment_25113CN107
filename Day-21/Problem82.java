//Program to reverse string.
import java.util.*;
public class Problem82 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string value");
        String str = in.nextLine();
        int i = str.length()-1;
        String revString ="";
        while(i>=0){
            revString += str.charAt(i);
            i--;
        }
        System.out.println("The reverse string: "+revString);
    }
}
