//Program to Merge arrays.
import java.util.Scanner;
public class Problem65{
    public static void main(String[]args){
        Scanner in = new Scanner(System.in);
        int n;
        System.out.println("Enter the number of elements in first array");
        n = in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the first array");
        for(int i = 0 ;i<n;i++)
            arr[i]=in.nextInt();
        int n2;
        System.out.println("Enter the number of elements in second array");
        n2 = in.nextInt();
        int arr2[] = new int[n2];
        System.out.println("Enter the first array");
        for(int i = 0 ;i<n2;i++)
            arr2[i]=in.nextInt();
        int marr[]= new int[n+n2];
        //Merging the two arrays.
        for(int i=0;i<n+n2;i++){
            if(i<n)
                marr[i]=arr[i];
            else
                marr[i]=arr2[i-n];
        }
        //Printing merged array.
        System.out.println("Printing merged array.");
        for(int i = 0;i<n+n2;i++)
            System.out.print(marr[i]+"  ");

       
    }
}