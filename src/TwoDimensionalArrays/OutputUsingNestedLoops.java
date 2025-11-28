package TwoDimensionalArrays;

import java.util.Scanner;

public class OutputUsingNestedLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int[][] arr = new int[4][3] ;
        System.out.println("Enter the array : ");
        for (int i=0;i<4;i++){
            for(int j=0;j<3;j++){
                arr[i][j] = sc.nextInt() ;
            }
        }
        for (int i=0;i<4;i++){
            for(int j=0;j<3;j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

    }

}
