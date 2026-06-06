//Program to print armstrong numbers in a range
import java.util.*;
public class Problem16 {
    static int count(int num){
        int c=0;
        while(num>0){
            c++;
            num/=10;
        }
        return c;
    }
    static boolean checkArmstrong(int num){
        int armStrong=0;
        int n = num;
        int digits = count(num);
        while(num>0){
            armStrong += (int)Math.pow(num%10, digits);
            num/=10;
        }
        return armStrong == n;

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number upto which armstrong number to be printed");
        int n = in.nextInt();
        System.out.println("The armstrong numbers are:");
        for(int i=0;i<=n;i++){
            if(checkArmstrong(i))
                System.out.println(i);
            }
    }
    
}
