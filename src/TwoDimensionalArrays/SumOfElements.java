package TwoDimensionalArrays;

import java.util.Scanner;

public class SumOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the size of the rows: ");
        int m = sc.nextInt();
        System.out.println("Enter the size of the colomns : ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n] ;
        System.out.println("The array is : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int sum = 0 ;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               sum += arr[i][j];
            }
        }
        System.out.println("The sum of the array is " +sum);
    }
}
