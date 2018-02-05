package OldExercises;

import java.util.Scanner;

public class GeometricShape {
    public static Integer B = null;
    public static Integer H = null;
    public static boolean flag = false;
    static {
    Scanner scanner = new Scanner(System.in);

    int breadth =scanner.nextInt();
    int  height =scanner.nextInt();

    if(breadth >0 && height >0){
         B = breadth;

         H = height;
         flag = true;
           }
    else{
        throw new ArithmeticException("java.lang.Exception: Breadth and height must be positive");
    }

}

    public static void main(String[] args) {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }

    }

}
