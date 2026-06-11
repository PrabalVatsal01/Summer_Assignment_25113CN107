//Program to Write function to check prime.
public class Problem43 {
    static boolean checkPrime(int n){
        if(n==0||n==1)
            return false;
        for(int i =2;i*i<=n;i++){
           if(n%i==0)
            return false;
        }
        return true;
    }    
}
