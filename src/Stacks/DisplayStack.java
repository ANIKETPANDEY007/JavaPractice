package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class DisplayStack {
    public static void displayReverseRec(Stack<Integer> s){
        if(s.size()==0) return ;
        int top = s.pop() ;
        System.out.print(top+" ");
        displayReverseRec(s) ;
        s.push(top) ;
    }
    public static void displayRec(Stack<Integer> s){
        if(s.size()==0) return ;
        int top = s.pop() ;
        displayRec(s) ;
        System.out.print(top+" ");
        s.push(top) ;

    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>() ;
        Scanner sc = new Scanner(System.in) ;
        System.out.print("Enter the no of elements :- ");
        int n = sc.nextInt() ;
        System.out.print("Enter the elements :-  ");
        for (int i = 1; i <=n ; i++) {
            int x = sc.nextInt() ;
            st.push(x) ;
        }
        System.out.println(st);
        displayReverseRec(st) ;
        System.out.println();
        displayRec(st) ;
    }
}
