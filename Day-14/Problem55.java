// Program to find Second largest element.
import java.util.*;
public class Problem55 {
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
             int largest_ele = arr[0];
        for( int i=0;i<arr.length;i++){
            if(arr[i]>largest_ele)
                largest_ele = arr[i];
        }
        int seclargest_ele = arr[0];
        for( int i=0;i<arr.length;i++){
            if(arr[i]>seclargest_ele&& arr[i]<largest_ele)
                seclargest_ele = arr[i];
        }
        System.out.println("The second largest element is :"+seclargest_ele);
        
    }
}