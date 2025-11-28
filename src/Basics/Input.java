package Basics;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the number : ");
        int n = sc.nextInt() ;
        System.out.print(n*n) ;
    }
}
