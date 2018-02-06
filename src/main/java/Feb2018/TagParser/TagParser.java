package Feb2018.TagParser;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TagParser {
    public static void main(String[] args){

        int testCases = 1;
        String line = "<h>dupa</h>";

//        Scanner in = new Scanner(System.in);
//        int testCases = Integer.parseInt(in.nextLine());
        while(testCases>0){
//            String line = in.nextLine();
            String validTing = "<(.+)>([^<]+)</\\1>";
            Pattern p = Pattern.compile(validTing);
            Matcher m = p.matcher(line);
            if(m.find()){
                System.out.println(m.group(2));
            }else{
                System.out.println("None");
            }

            
            //Write your code here

            testCases--;
        }
    }
}
