package OldExercises;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Stringi {

public static void main(String[] args) {

//        Scanner sc = new Scanner(System.in);
//        String A = sc.next();
//        String B = sc.next();
String A = "Anna";
String B = "Dupek";
        int sumLength = A.length() + B.length();
        System.out.println(sumLength);

        List <String> slownik = new ArrayList();
        slownik.add(A);
        slownik.add(B);
        Collections.sort(slownik, String.CASE_INSENSITIVE_ORDER);

        System.out.println(slownik.get(0));
        System.out.println(A.substring(0,1).toUpperCase() + A.substring(1, A.length()) +" "+ B.substring(0,1).toUpperCase() + B.substring(1, B.length()));

    System.out.println( A.compareTo(B) > 0 ? "yes":"no");

        }
        }
