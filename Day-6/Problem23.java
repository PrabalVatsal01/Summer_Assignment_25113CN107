import java.util.Scanner;

public class Problem23 {
    static int countSetBits(int num){
        int count=0;
        while(num>0){
            count+=num&1;
            num>>=1;
        }
        return count;            
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Decimal number");
        int n = in.nextInt();
        System.out.println("The number of set bits in "+n+" is "+countSetBits(n));
    }
    
}
