//Program to Transpose matrix.
import java.util.*;
public class Problem75{
    public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
        System.out.print("Enter the order of array:");
        int order = in.nextInt();
        int arr1[][]= new int [order][order];
        System.out.println("Enter a square array:");
        for(int i = 0;i<order;i++){
                for(int j=0; j<order;j++){
                    arr1[i][j]=in.nextInt();
                }
            }
        //Formig transpose array.
        for(int i = 0;i<order;i++){
            for(int j=0; j<order;j++){
                    if(i<j){
                        int temp = arr1[j][i];
                        arr1[j][i]=arr1[i][j];
                        arr1[i][j]=temp;
                    }               
                }                            
            }
            //Printing transposed array.
            System.out.println("Printing transposed array");
            for(int i = 0;i<order;i++){
                for(int j=0; j<order;j++){
                    System.out.print(arr1[i][j]+"  ");
                }
                System.out.println("");
            }

    }
    
}
