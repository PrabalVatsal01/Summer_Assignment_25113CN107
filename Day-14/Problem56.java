//Program to Find duplicates in array
import java.util.*;
public class Problem56 {
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
        System.out.println("Duplicate elements are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                }
            }
        }
    }
}