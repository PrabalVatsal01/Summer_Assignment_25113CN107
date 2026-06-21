//Program to find string length without strlen();
import java.util.Scanner;
public class Problem81 {
    public static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string value");
        String str = in.next();
        int i=0;
        str.trim();
        str = str +" ";
        while(str.charAt(i)!=' '){
            i++;
        }
        System.out.println("The length of string is: "+(i));
    }
}