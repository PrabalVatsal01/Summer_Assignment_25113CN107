//Program to find GCD of two numbers. 
import java.util.*;
public class Problem11 {
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int num1, num2, GCD=0;
        System.out.println("Enter two numbers");
        num1 = in.nextInt();
        num2 = in.nextInt();
        for(int i=1;i<Math.min(num1, num2);i++){
            if(num1%i==0&&num2%i==0)
                GCD = i;
            }
            System.out.println("The GCD is :"+GCD);

    }

}
