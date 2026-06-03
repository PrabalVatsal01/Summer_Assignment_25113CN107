// Program to find the sum of digits of a given number.
import java.util.Scanner;
public class Problem05 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        System.out.println("The sum of the digits of the given number is: " + sum);
    }

    
    
}
