import java.util.Scanner;

public class String2 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    int k = scan.nextInt();
    scan.close();
    String firstInAlphabet = "z";
    String lastInAlphabet = "A";

    for (int i = 0; i < s.length()-k; i++){
        if(s.substring(i, i+k).compareTo(firstInAlphabet) < 0){
            firstInAlphabet = s.substring(i, i+k);
        }
        if(s.substring(i, i+k).compareTo(lastInAlphabet)>0){
            lastInAlphabet = s.substring(i, i+k);
        }
    }
    System.out.println(firstInAlphabet);
    System.out.println(lastInAlphabet);

}

}