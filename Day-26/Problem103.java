//Creating ATM simulation.
import java.util.*;
public class Problem103 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double balance = 10000;  // starting balance
        int choice;

        do {
            System.out.println("\n=== ATM MENU ===");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = in.nextInt();

            switch(choice) {
                case 1:
                    System.out.println("Your balance: ₹" + balance);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double deposit = in.nextDouble();
                    balance += deposit;
                    System.out.println("Deposited ₹" + deposit);
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw = in.nextDouble();
                    if(withdraw <= balance) {
                        balance -= withdraw;
                        System.out.println("Withdrawn ₹" + withdraw);
                    } else {
                        System.out.println("Insufficient balance!");
                    }
                    break;

                case 4:
                    System.out.println("Thank you for using ATM. Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while(choice != 4);

        in.close();
 
    }
}
