//Program to find LCM via GCD
import java.util.Scanner;
public class Problem12_M2 {
    static int GCD (int num1, int num2){
        int HCF=1;
        for(int i=1;i<Math.min(num1, num2);i++){
            if(num1%i==0&& num2%i==0){
                 HCF = i;
                }
            }
            return HCF;
        }
     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         System.out.println("Enter two numbers");
         int n1 ,n2;
         n1 = in.nextInt();
         n2 = in.nextInt();
         int LCM = (n1*n2)/GCD(n1, n2);
         System.out.println("The LCM is: "+LCM);
     }   
}
