package Loops;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the size of the array:") ;
        int n = sc.nextInt() ;
        System.out.println("Enter the array : ");
        int[] arr = new int[n] ;
        for(int i=0;i<n;i++){
            arr[i]= sc.nextInt() ;
    }
        System.out.println("Enter the value we want to search :");
        int x = sc.nextInt() ;
        boolean flag = false ;
        for(int i=0;i<n;i++){
            if (arr[i]==x){
                  flag = true ;
                  break ;
            }
        }
        if(flag==false) System.out.println("Element NOT Found");
        else System.out.println("Element Found");
    }

}
