import java.util.*;
public class Problem27 {
      static int sumOfDigits(int n){
        if(n==0)
            return 0;
        return n+sumOfDigits(n-1);
      }
      public static void main(String[] args) {
          Scanner in = new Scanner(System.in);
          System.out.println("Enter the number.");
          int n = in.nextInt();   
          System.out.println(sumOfDigits(n));
      }
}
