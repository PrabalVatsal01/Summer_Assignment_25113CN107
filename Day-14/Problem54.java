//Program to Frequency of an element
import java.util.*;
public class Problem54 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);    
            System.out.println("Enter the number of terms in array:");
            int n = in.nextInt();
            int []arr = new int[n];
            System.out.println("Enter the array:");
            //Input array
            for(int i=0;i<arr.length;i++){
                arr[i] = in.nextInt();
            }
            System.out.println("Enter element to be searched");
            int a = in.nextInt();
            int frequency=0;
            for(int i=0;i<arr.length;i++){
                if(arr[i]==a)
                    frequency++;
            }
            System.out.println("The frequecy of "+a+" is "+frequency);
        }
    }
