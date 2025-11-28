package TwoDimensionalArrays;

import java.util.Scanner;

public class AddTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the size of the rows: ");
        int m = sc.nextInt();
        System.out.println("Enter the size of the colomns : ");
        int n = sc.nextInt();
        int[][] a = new int[m][n] ;
        System.out.println("The array is : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        int[][] b = new int[m][n] ;
        System.out.println("The array is : ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }
        }
        int[][] res = new int[m][n] ;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
               res[i][j] = a[i][j] + b[i][j] ;
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
