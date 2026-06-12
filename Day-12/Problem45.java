//Program to write function for palindrome.

public class Problem45 {
    static boolean  palindrome(int num){
        int reverse = 0;
        int n = num;
        while(num>0){
            reverse = reverse*10 + num%10;
            num = num/10;
        }
        return reverse == n ;
    }
     public static void main(String[] args) {
         System.out.print(palindrome(121));
     }
}
