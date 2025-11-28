package Arrays;

import java.util.Scanner;

public class Swap {
    public static void swap(int[] a , int[] b ){
        int temp = a[0] ;
        a[0] = b[0] ;
        b[0] = temp ;
    }

    public static void main(String[] args) {
        int[] a = {0};
        int[] b = {1};
        System.out.println(a[0]+" "+b[0]);
        swap(a,b) ;
        System.out.println(a[0]+" "+b[0]);
    }
}
