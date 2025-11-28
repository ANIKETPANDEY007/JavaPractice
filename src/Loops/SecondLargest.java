package Loops;

import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        System.out.println("Enter the array : ");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int max = 0 ;
        for(int i=0;i<n;i++){
            if(arr[i]>max) max=arr[i];
        }
        System.out.println("The large value of the array is " + max);
        int maxx = 0 ;
        for(int i = 0;i<n;i++){
            if(arr[i]>maxx && arr[i] != max ){
                maxx = arr[i] ;
            }
        }
        System.out.println("The second lagest value of array is "+ maxx);
    }
}
