package Conditionals;

import java.util.Scanner;

public class DivBy5OrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the value of Integer");
        int n = sc.nextInt() ;
        if(n%5==0){
            System.out.print("The given integer is divisible by 5 .");
        } else{
            System.out.print("The given integer is not divisible by 5 .");
        }
    }

}
