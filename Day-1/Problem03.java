// This program calculates the factorial of a given number.
import java.util.Scanner;
public class Problem03 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("The result is: " + factorial);
    }
}

