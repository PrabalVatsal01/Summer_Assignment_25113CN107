public class Problem40 {
    public static void main(String[] args) {
        for(int i='A';i<='E';i++){
            for(int j=1;j<='E'-i;j++){
                System.out.print(" ");
            }
            for(int k='A';k<=i;k++){
                System.out.print((char)k);
            }
            for(int l=i-1;l>='A';l--){
                System.out.print((char)l);
            }
            System.out.println("");    
        }
    }
}
