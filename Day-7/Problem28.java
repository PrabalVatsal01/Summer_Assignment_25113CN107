import java.util.Scanner;
public class Problem28 {
    static int count(int num){
        int c=0;
        while(num>0){
            c++;
            num/=10;
        }
        return c;
    }
    static int reverse (int n){
        if(n<=9)
            return n;
    return ((n%10)*(int)Math.pow(10,count(n)-1)+reverse(n/10));
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = in.nextInt();
        System.out.println("The reverse of number is: "+reverse(n));
    }
    
}
