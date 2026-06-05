import java.util.Scanner;
public class Problem10 {
    boolean isPrime(int n){
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

    
             
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number upto which prime numbers to be printed");
        int num = in.nextInt();
        Problem10 p = new Problem10();
        System.out.println("The prime numbers are:");
        for (int i = 0; i <= num; i++) {
            if(p.isPrime(i)){
            System.out.println(i);
            }
            
        }
        
    }
}
