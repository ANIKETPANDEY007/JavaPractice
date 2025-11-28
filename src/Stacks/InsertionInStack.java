package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class InsertionInStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>() ;
        Scanner sc = new Scanner(System.in) ;
        System.out.println("Enter the no of elements :- ");
        int n = sc.nextInt() ;
        System.out.print("Enter the elements :-  ");
        for (int i = 1; i <=n ; i++) {
            int x = sc.nextInt() ;
            st.push(x) ;
        }
        System.out.println(st);
        int idx = 2 ;
        int x = 7 ;
        Stack<Integer>temp = new Stack<>() ;
        while(st.size()>idx){
            temp.push(st.pop()) ;
        }
        temp.push(x) ;
        while(temp.size()>0){
            st.push(temp.pop()) ;
        }
        System.out.println(st);
    }
}
