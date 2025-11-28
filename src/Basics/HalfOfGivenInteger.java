package Basics;

import java.util.Scanner;

public class HalfOfGivenInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the value of Integer:");
        int x = sc.nextInt();
        double y = (double) x ;
        System.out.print(y/2);

    }
}
