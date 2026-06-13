//Program to find smallest and largest element in an array.
import java.util.*;
public class Problem51 {
    

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
        int smallest_ele = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<smallest_ele)
                smallest_ele = arr[i];
            if(arr[i]>largest_ele)
                largest_ele = arr[i];
        }
        System.out.println("The smallest element is:"+smallest_ele);
        System.out.println("The largest element is:"+largest_ele);
    }
}
