package Feb2018.DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ExerciseInArrayLists {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int numberOfInputs = sc.nextInt();

    ArrayList<List<String>> row = new ArrayList<List<String>>();

    for(int i = 0; i < numberOfInputs; i++){
        String currentLine = sc.nextLine();
        row.add(Arrays.asList(currentLine.split(" ")));
        sc.next();
    }
        System.out.println(row.toString());

//        System.out.println(rows.toString());
//    int numberOfQuerries = sc.nextInt();
//    int [] querry = new int[2];
//    for(int i = 0; i<numberOfQuerries; i++){
//        querry[0] = sc.nextInt();
//        querry[1] = sc.nextInt();
//        try{
//            System.out.println(rows[querry[0], querry[1]]);
//        }
//        catch(){
//            System.out.println("ERROR!");
//        }
//    }

        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
}
}