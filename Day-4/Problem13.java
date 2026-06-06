// Program to find fibonnaci series 
import java.util.Scanner;
public class Problem13 {
    static void printFibonnaci(int n){
        int c;
        int a=0,b=1;
        System.out.print(a);
        while(true){
        c = a+b;
        a = b;
        b = c;
        if(c>n)
            break;
        System.out.print("\t"+c);    

        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number upto which fibonacci series to be printed");
        int num = in.nextInt();
        printFibonnaci(num);

    }
    
}
