//Write a program to Check perfect number
import java.util.*;
public class Problem17 {
    static boolean checkPerfect(int num){
        int sum =0;
        for(int i=1;i<num;i++){
            if(num%i ==0)
                sum+=i;
        }
        return num == sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = in.nextInt();
        if(checkPerfect(n))
            System.out.println(n+" is a Perfect number");
        else
            System.out.println(n+" is not a Perfect number");
    }
    
}
