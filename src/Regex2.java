import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int testCases = Integer.parseInt(in.nextLine());

        while(testCases>0){

            testCases = testCases -1;

            String pattern = in.nextLine();

            try{

                Pattern p = Pattern.compile(pattern);
                System.out.println("Valid");

            }catch(Exception e){

                System.out.println("Invalid");

            }      }
    }
}