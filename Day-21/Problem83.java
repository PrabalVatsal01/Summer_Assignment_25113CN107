// Program to Count vowels and consonants.
import java.util.*;
public class Problem83 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a alphabetical string");
        String str = in.nextLine();
        int vowel=0,consounant=0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c=='a'||c=='b'||c=='c'||c=='d'||c=='e'||c=='A'||c=='B'||c=='C'||c=='D'||c=='E')
                vowel++;
            else
                consounant++;
        }
        System.out.println("The number of vowels are:"+vowel);
        System.out.println("The number of consounants are:"+consounant);
    }
}
