import java.util.*;
public class Palindrome2 {
    static boolean isAnagram(String a, String b) {
        a = a.toLowerCase();
    b = b.toLowerCase();

    char [] aArray = new char[a.length()];

    aArray = a.toCharArray();
        Arrays.sort(aArray);

    char [] bArray = new char [b.length()];

    bArray = b.toCharArray();
        Arrays.sort(bArray);

        return Arrays.toString(bArray).equals(Arrays.toString(aArray));

}

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

