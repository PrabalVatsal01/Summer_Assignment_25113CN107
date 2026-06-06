//Program to convert decimal to binary.
import java.util.*;
public class Problem21 {
    static String deciToBinary(int num){
        String binary = "";
        while(num>0){
            binary = num%2 + binary;
            num/=2;
        }
        return binary;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter decimal number");
        int n = in.nextInt();
        System.out.println("The binary number is:"+deciToBinary(n));
    }
}
    

