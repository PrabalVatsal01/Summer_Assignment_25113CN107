//Program to find largest prime factor.
import java.util.*;
public class Problem20 {
     static boolean isPrime(int n){
        boolean isprime = true;
        if(n==0 ||n==1)
            return false;
        for(int i=2;i<=n/2;i++){
            if(n%i ==0){
              isprime = false;
              break;
        }
    }    
    return isprime ;
}
    static int findLargestPrimeFactor(int num){
        for(int i=num;i>=1;i--){
            if(num%i==0&&isPrime(i))
                return i;
            }
            return 0;
        }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        System.out.println(findLargestPrimeFactor(n));
    }
    
}

