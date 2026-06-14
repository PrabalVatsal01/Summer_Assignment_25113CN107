//Program to Linear search.
import java.util.*;
public class Problem53 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);    
        System.out.println("Enter the number of terms in array:");
        int n = in.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the array:");
        //Input array
        for(int i=0;i<arr.length;i++)
            arr[i] = in.nextInt();

        //Linear Search
        System.out.println("Enter element to be searched");
        int a = in.nextInt();
        for(int i=0;i<arr.length;i++){
            if(arr[i]==a){
                System.out.println("Element present at index "+i);
                return ;
            }
        }
        System.out.println("Element not present");
    }
    
}
