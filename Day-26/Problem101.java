//Creating a number guessing game.
import java.util.Scanner;
public class Problem101 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = (int)(Math.random()*100);
        int i=0;
        while(true){
            i++;
            System.out.print("Guess the number : ");
            int guess = in.nextInt();
            if(guess<num)
                System.out.println("TOO LOW !!");
            else if(guess>num)
                System.out.println("TOO HIGH !!");
            else{
                System.out.println("You took "+i+" chances to guess the number");
                return;
            }
        }
    }
}
