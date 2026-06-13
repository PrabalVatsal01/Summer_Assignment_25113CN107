//Program to find sum and average of elements in an array
import java.util.*;
public class Problem50{
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
        //Sum of elements
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+= arr[i];
        }
        System.out.println("The sum of elements is:"+sum);
        //Average of array elements
        System.out.println("The average is:"+sum/arr.length);
    }
}