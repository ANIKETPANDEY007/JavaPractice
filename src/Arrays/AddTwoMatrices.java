package Arrays;

import java.util.Scanner;

public class AddTwoMatrices {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the value of rows :");
        int m = sc.nextInt();
        System.out.print("Enter the number of coloumn :");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        int[][] brr = new int[m][n];
        int[][] res = new int[m][n];
        System.out.println("Enter the first array : ");
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter the second array : ");
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                brr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                res[i][j]=arr[i][j]+brr[i][j];
            }
        }
        System.out.println("The resultant array is : ");
        for (int i = 0; i < m ; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}
