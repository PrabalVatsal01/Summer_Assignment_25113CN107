
import java.util.*;
public class Problem07 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        int product = 1;
        while(n>0){
            product*= n%10 ;
            n = n/10;
        }
        System.out.println("The product of digits is:"+product);
    }
}
