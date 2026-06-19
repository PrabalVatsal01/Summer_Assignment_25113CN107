//Program to Find diagonal sum
import  java.util.Scanner;
public class Problem76 {
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
            int sum =0;
        //Finding sum of diagonal elements.
        for(int i = 0;i<order;i++){
            for(int j=0; j<order;j++){
                    if(i==j){
                        
                        sum+=arr1[i][j];
                    }               
                }                            
            }
            //Printing sum
            System.err.println("The sum of diagonal elements is: "+sum);

    }
    
}
