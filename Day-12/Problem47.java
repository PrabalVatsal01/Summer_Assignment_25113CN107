// Program to Write function for Fibonacci.
public class Problem47 {
    static void printFibonnaci(int n){
        int c;
        int a=0,b=1;
        System.out.print(a);
        while(true){
        c = a+b;
        a = b;
        b = c;
        if(c>n)
            break;
        System.out.print("\t"+c);    

        }
    }
}
