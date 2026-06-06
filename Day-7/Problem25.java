//Recursive factorial
import java.util.*;
public class Problem25 {
    static int factorial(int x){
        if(x<=1)
            return x;
        return x*factorial(x-1);
        }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println("The factorial is: "+factorial(n));
    }
    
}
