//Program to Write function for Armstrong.
public class Problem46 {
    static boolean checkArmstrong(int num){
        int armStrong=0;
        int n = num;
        int digits=0;
        while(num>0){
            digits++;
            num/=10;
        } 
        num=n;
        while(num>0){
            armStrong += (int)Math.pow(num%10, digits);
            num/=10;
        }
        return armStrong == n;

    }
}
