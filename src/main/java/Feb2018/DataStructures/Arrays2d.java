package Feb2018.DataStructures;

import java.util.Scanner;

public class Arrays2d {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        int sum = Integer.MIN_VALUE;
        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){
                int newSum = arr[i][j] + arr[i+1][j] + arr[i+2][j] + arr[i+1][j+1] + arr[i][j+2] + arr[i+1][j+2] + arr[i+2][j+2];
                if(newSum > sum){
                    sum = newSum;
                }
            }
        }
        System.out.println(sum);
    }

}

