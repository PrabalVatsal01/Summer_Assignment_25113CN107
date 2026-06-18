//Program to Union of arrays.
import java.util.Scanner;
public class Problem66_M2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n;
        //Input first array
        System.out.println("Enter the number of elements in first array");
        n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the first array");
        for(int i = 0 ;i<n;i++)
            arr[i]=in.nextInt();
        int n2;
        //Input second array.
        System.out.println("Enter the number of elements in second array");
        n2 = in.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter the second array");
        for(int i = 0 ;i<n2;i++)
            arr2[i]=in.nextInt();
        int union_arr[] = new int [n+n2];
        int k=0;
        //Merging the two arrays.
     int marr[]= new int[n+n2];
        for(int i=0;i<n+n2;i++){
            if(i<n)
                marr[i]=arr[i];
            else
                marr[i]=arr2[i-n];
        }
        for(int i=0;i<marr.length;i++){
            boolean found = false;
            for(int j=0;j<k;j++){
                if(union_arr[j]==marr[i]){
                    found = true;
                    break;
                }
            }
            if(!found)
                union_arr[k++]=marr[i];
        }
        //Printing union array.
        System.out.println("Printing union array:");
        for(int i=0;i<k;i++)
            System.out.println(union_arr[i]);
    }
    
}
