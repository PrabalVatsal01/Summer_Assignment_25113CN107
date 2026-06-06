
import java.util.Scanner;

public class Problem22_M2 {
    static int binToDecimal(String bin){
            int decimal=0;
            for(int i=0;i<=bin.length()-1;i++){
                int bit = bin.charAt(i)-'0';
                decimal += bit*Math.pow(2, i);
            }
            return decimal;
        }
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter the Binary number");
            String num = in.next();
            System.out.println("The decimal conversion is :"+binToDecimal(num));
        }
        
    }

