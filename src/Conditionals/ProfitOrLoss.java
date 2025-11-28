package Conditionals;

import java.util.Scanner;

public class ProfitOrLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the Cost Price");
        int CP = sc.nextInt();
        System.out.println("Enter the Selling Price");
        int SP = sc.nextInt();
        if(SP>CP){
            System.out.println("The seller has mad a Profit of :"+(SP-CP));
        }else{
            System.out.println("The seller has mad a Loss of :"+(CP-SP));
        }
    }
}
