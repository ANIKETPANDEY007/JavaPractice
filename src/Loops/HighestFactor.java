package Loops;

import java.util.Scanner;

public class HighestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the value of n :");
        int factor = 1 ;
        int n = sc.nextInt() ;
        for (int i=1;i<n;i++){
            if (n%i==0){
                factor = i ;
            }
        }
        System.out.println(factor);
    }
}
