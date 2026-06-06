//Program to find nth term of fibonacci series
import java.util.*;
public class Problem14 {
    static int print_nthTerm(int n){
        int a=0,b=1;
        if(n==1)
            return a;
        for(int i=2;i<=n;i++){
        a+= b;
        b=a;
    }
        return a;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the term to be printed");
        int num = in.nextInt();
        System.err.println(print_nthTerm(num));
    }
}
