//Program to Write function to find factorial.
public class Problem44 {
    static int factorial(int n){
       int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        } 
        return factorial;
    }
}
    
