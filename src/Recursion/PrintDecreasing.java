package Recursion;
import java.util.Scanner;
public class PrintDecreasing {
    public static void print(int n ){
        System.out.println(n); // work
        if(n==1) return ; // base case

        print(n-1); // call
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the value of n :-");
        int n = sc.nextInt() ;
        print(n);
    }
}
