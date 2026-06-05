//Program to find LCM of two numbers.
import java.util.Scanner;
public class Problem12_M1 {
    static int LCM(int n1 , int n2){
        int max = (n1>n2)?n1:n2 ;
        while(true){
            if(max%n1==0 && max%n2==0){
                return max;
            }
            max++;
        }

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1,num2;
        System.out.println("Enter two numbers");
        num1 =in.nextInt();
        num2 =in.nextInt(); 
        System.out.println("The LCM is: "+LCM(num1,num2));

    }
    
}

