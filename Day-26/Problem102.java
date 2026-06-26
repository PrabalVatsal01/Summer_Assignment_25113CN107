//Creating voting eligibility system
import java.util.*;
public class Problem102 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the age of the voter :");
        int age = in.nextInt();
        if(age>=18)
            System.out.println("The person is allowed to vote");
        else if(age<18)
            System.out.println("The person is not allowed to vote");
        else
            System.out.println("Invalid Input");
    }
}
