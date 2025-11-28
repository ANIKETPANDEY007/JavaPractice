package Conditionals;

import java.util.Scanner;

public class LeapYearOrNot {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the year :");
        int n = sc.nextInt();
        if( n%4==0 && n%100!=0){
            System.out.println("It is a Leap year.");
        }else if (n%400==0){
            System.out.println("It is a Leap year.");
        }else{
            System.out.println("This year is not a leap year.");
        }
    }

}
