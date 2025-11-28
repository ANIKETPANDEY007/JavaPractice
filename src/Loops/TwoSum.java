package Loops;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the size of the array:");
         int n = sc.nextInt();
         int[] arr = new int[n] ;
        System.out.println("Enter the array :");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt() ;
        }
        System.out.println("Enter the value of x :");
        int x = sc.nextInt();
        for (int i=0;i<n;i++){
            for(int j=i+1;j<=n-1;j++){
                if(arr[i] + arr[j] == x){
                    System.out.println( "("+ i +","+ j +")");
                }
            }
        }
    }
}
