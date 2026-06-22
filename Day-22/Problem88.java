// Q88 Write a program to Remove spaces from string.
import java.util.Scanner;
public class Problem88 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        str.trim();
        //Removing spaces from in-between.
        String s = str.replace(" ", "");
        //Printing string without spaces.
        System.out.println("The changed string is :"+s);
    }
}
