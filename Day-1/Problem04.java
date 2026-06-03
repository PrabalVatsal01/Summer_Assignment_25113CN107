// This program counts the number of digits in a given number.
import java.util.Scanner;
public class Problem04 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int count = 0;
        while (n > 0) {
            count ++;
            n /= 10;
        }
        System.out.println("The number of digits in the given number is: " + count);
    }
}    