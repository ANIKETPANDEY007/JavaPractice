package Arrays;

import java.util.Scanner;

public class Maxarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array :-");
        int n = sc.nextInt() ;
        System.out.print("Enter the array :-");
        int[] arr = new int[n] ;
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt() ;
        }
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        int max = arr[0];
        for(int i=0;i<n;i++){
            if(arr[i]>max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
