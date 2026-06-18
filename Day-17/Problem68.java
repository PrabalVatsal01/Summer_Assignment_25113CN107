//Program to Find common elements.
import java.util.Scanner;
public class Problem68 {
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
        int intersection_arr[]= new int[(Math.min(n,n2))];
        int k=0;
        for(int i=0;i<n;i++){
            boolean found;
            for(int j=0;j<n2;j++){
                if(arr[i]==arr2[j]){
                        found = false;
                    for(int m=0;m<k;m++){
                        if(intersection_arr[m]==arr[i]){
                            found = true;
                            break;
                        }
                    }
                    if(!found)
                        intersection_arr[k++]=arr[i];
                    
                }
                    
            }
        }
        //Printing common elements.
        System.out.println("Printing common elements:");
        for(int i =0;i<k;i++)
            System.out.print(intersection_arr[i]+" ");
        
    }
    
}
