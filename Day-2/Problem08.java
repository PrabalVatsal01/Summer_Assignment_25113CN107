//Program to check whether a number is palindrome or not.
import java.util.Scanner;
public class Problem08 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = in.nextInt();
        int n = num;
        int reverse = 0;
        while(num>0){
            reverse = reverse*10 + num%10;
            num = num/10;
        }
        if(reverse==n)
            System.out.println(n+" is a palindrome number");
        else
            System.out.println(n+" is not a palindrome number");
        
    }
    
}
