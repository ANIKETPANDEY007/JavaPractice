package Loops;

import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        System.out.print("Enter the value of n :");
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        for(int i=1;i<n;i++){
            System.out.println("Hello World");
        }
    }
}
