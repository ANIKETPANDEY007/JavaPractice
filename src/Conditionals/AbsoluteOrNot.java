package Conditionals;

import java.util.Scanner;

public class AbsoluteOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the value of Integer: ");
        int n = sc.nextInt();
        if (n>=0){
            System.out.println(n);
        }else{
            System.out.println(-n);
        }
    }
}
