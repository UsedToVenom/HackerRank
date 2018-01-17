import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex1 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
int counter = 0;


        String[] sArray = s.split("[^a-zA-Z]+");
        for (String k: sArray
             ) {            if(!k.equals("")){
                 counter = counter+1;
        }


        }
        System.out.println(counter);

        for ( String k: sArray
             )
            if(!k.equals("")){
            System.out.println(k);
        }else{
            System.out.print("");
        }
        System.out.println(Arrays.toString(sArray));

    }
}
