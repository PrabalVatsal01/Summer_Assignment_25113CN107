
import java.util.Scanner;

public class Problem19 {
    static void printFactors(int num){
        for(int i=1; i<= num; i++){
            if(num%i==0)
                System.out.println(i);
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        printFactors(n);
    }
}
