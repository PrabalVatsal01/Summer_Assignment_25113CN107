// Recursive fibonacci
import java.util.Scanner;
public class Problem26 {
    static int fib(int n){
        if(n==0)
             return 0;
        if(n==1)
            return 1;
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of terms to be printed");
        int n = in.nextInt();
        for(int i=0;i<=n;i++)
        System.out.print(fib(i)+" ");
    }
}
