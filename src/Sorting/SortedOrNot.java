package Sorting;

import java.util.Scanner;

public class SortedOrNot {
    public static void main(String[] args) {
        System.out.println("Enter the size of array: ");
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int[] arr = new int[n] ;
        System.out.println("Enter the array");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean flag = true ;
        for (int i = 0; i < n-1; i++) {
           if (arr[i]>arr[i+1]) {
               flag =false ;
               break ;
           }
        }
        if(flag == true){
            System.out.println("It is a Sorted array");
        }else{
            System.out.println("Not a sorted array");
        }
    }
}
