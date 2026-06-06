import java.util.Scanner;

public class Problem_24 {
    static int power(int x,int n){
        int p=1;
        for(int i=1;i<=n;i++){
            p*=x ;
        }
        return p;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int x = in.nextInt();
        System.out.println("Enter the power: ");
        int n = in.nextInt();
        System.out.println(x+" raised to the power "+n+" is: "+power(x, n) );
    }
}
