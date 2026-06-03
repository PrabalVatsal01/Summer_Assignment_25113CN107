//Program to reverse a number
import java.util.Scanner;
public class Problem06 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        int reverse = 0;
        while(num>0){
            reverse = reverse*10 + num%10 ;
            num/=10;
        }
        System.err.println("The reverse of the number is :"+reverse);
    }
    
}
