import java.util.Arrays;
import java.util.Scanner;

import static com.sun.xml.internal.fastinfoset.alphabet.BuiltInRestrictedAlphabets.table;

public class Palindrome {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();

        boolean palindrome = true;

        System.out.println(A.length());

        String[] slowo = new String[A.length()];
        for(int i = 0; i<= A.length()-1; i++){
            slowo[i] = A.substring(i,i+1);
            System.out.println(Arrays.deepToString(slowo));

        }

        for(int i = 0; i<=A.length()-1; i++){
            System.out.println(slowo[i]);
            System.out.println(slowo[A.length()-i-1]);
            if(slowo[i].equals(slowo[A.length()-i-1])){

            }else{
                palindrome = false;
            }
        }
        System.out.println(palindrome);
    }
}
