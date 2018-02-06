package Feb2018.BigNumbers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class BigDecimalArray {
    public static void main(String []args){
    //Input
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    String []s=new String[n+2];
    Double []d = new Double[s.length];
    for(int i=0;i<n;i++){
        s[i]=sc.next();
    }
    sc.close();
BigDecimal [] b = new BigDecimal[s.length];
        for(int i=0;i<n;i++){
            b[i] = new BigDecimal(s[i]);
        }
Arrays.sort(b);
        System.out.println(String.valueOf(b));





//    Output
        for(int i=0;i<n;i++)
    {
        System.out.println(s[i]);
    }
}
}