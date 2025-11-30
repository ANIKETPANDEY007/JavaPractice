package Pattern_Printing;

import java.util.Scanner;

public class SolidRectangleWithNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the no. of rows : ");
        int n = sc.nextInt() ;
        System.out.print("Enter the no of columns : ");
        int m = sc.nextInt() ;
        for (int i = 0; i < n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
