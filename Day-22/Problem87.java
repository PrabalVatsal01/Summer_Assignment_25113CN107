//Program to find Character frequency.
import java.util.Scanner;
public class Problem87 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string");
        String str = input.nextLine();
        System.out.print("Enter the character :");
        char c = input.next().charAt(0);
        int freq=0;
        for(int i=0 ; i<str.length();i++){
            if(str.charAt(i)==c)
                freq++;
        }
        System.out.println("The frequency of character is :"+freq);
    }
}
