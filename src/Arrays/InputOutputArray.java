package Arrays;

import java.util.Scanner;

public class InputOutputArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the size of the array:-");
        int n = sc.nextInt() ;
        System.out.println("Enter the array:-");
        int[] arr = new int[n] ;
        for (int i = 0;i<n;i++){
            arr[i] = sc.nextInt() ;
        }
        System.out.print("The array is :-");
        for (int i = 0;i<n;i++){
            System.out.print(arr[i] + " ") ;
        }
    }
}
