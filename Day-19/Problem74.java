//Program to Subtract matrices.
import java.util.*;
public class Problem74{
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
        System.out.print("Enter the number of rows in array:");
        int rows = in.nextInt();
        System.out.print("Enter the number of columns in array:");
        int columns = in.nextInt();
        int arr1[][]= new int [rows][columns];
        System.out.println("Enter the first array:");
        for(int i = 0;i<rows;i++){
                for(int j=0; j< columns;j++){
                    arr1[i][j]=in.nextInt();
                }

            }
             int arr2[][]= new int [rows][columns];
        System.out.println("Enter the second array:");
        for(int i = 0;i<rows;i++){
                for(int j=0; j< columns;j++){
                    arr2[i][j]=in.nextInt();
                }
            }
            int subtract[][]= new int[rows][columns];
            for(int i = 0;i<rows;i++){
                for(int j=0; j< columns;j++){
                    subtract[i][j] = arr1[i][j]-arr2[i][j];
                }
            }
            //Printing addition array.
            System.out.println("Printing differnce of array:");
            for(int i = 0;i<rows;i++){
                for(int j=0; j< columns;j++){
                    System.out.print(subtract[i][j]+"  ");
                }
                System.out.println("");
            }
        }
    }    


