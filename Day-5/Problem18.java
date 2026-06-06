// Program to check strong number.
import java.util.*;
public class Problem18 {
    static int factorial(int num){
        int fact =1;
        for (int i = 1; i <= num;i++) {
            fact*=i;
        }
        return fact;
    }
    static boolean checkStrong (int num){
        int sum =0;
        int n = num;
        while(num>0){
            sum+= factorial(num%10);
            num/=10;
        }
        return sum==n ;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        if(checkStrong(n))
            System.out.println(n+" is a Strong number");
        else
            System.out.println(n+" is not a Strong number");
    }

}
