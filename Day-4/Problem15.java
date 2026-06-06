// Program to check whether a number is an armstrong number or not
import java.util.*;
public class Problem15 {
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
        System.out.println("Enter a number");
        int n = in.nextInt();
        if(checkArmstrong(n))
            System.out.println(n+" is an armstrong number");
        else
            System.out.println(n+" is not an armstrong number");
    }
}
