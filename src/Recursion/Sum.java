package Recursion;

import java.util.Scanner;

public class Sum {
    public static int sum(int x ,int n){
        int s = n ;
       if(n>x){
           s += sum(x ,n-1) ;
       }
       return s;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the value of n :-");
        int n = sc.nextInt() ;
        System.out.println(sum(1,n));
    }
}
