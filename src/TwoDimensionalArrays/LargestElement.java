package TwoDimensionalArrays;

import java.util.Scanner;

public class LargestElement {
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
        int mx = Integer.MIN_VALUE ;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                mx = Math.max(mx,arr[i][j]);
            }
        }
        System.out.println("The maximum element of the array is " +mx);
    }
}
