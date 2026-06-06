//Program to convert binary to decimal
import java.util.*;
public class Problem22_M1 {
    static int binToDecimal(String num){
        int decimal = Integer.parseInt(num,2);
        return decimal;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the Binary number");
        String num = in.next();
        System.out.println(binToDecimal(num));
    }

    
}
