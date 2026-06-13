//Program to Input and display array
import java.util.*;
public class Problem49 {
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
    //Print array
    System.out.println("The input array is: ");
    for(int i=0;i<n;i++){
        System.out.print(arr[i]+"  ");
    }

    }
}
