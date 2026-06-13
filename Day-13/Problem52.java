//Program to Count even and odd elements.
import java.util.*;
public class Problem52 {
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
        int even_ele=0;
        int odd_ele =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0)
                even_ele ++;
            else
            odd_ele++;
        }
        System.out.println("the number of odd elements is :"+odd_ele);
        System.out.println("the number of even elements is :"+even_ele);
    }
}
