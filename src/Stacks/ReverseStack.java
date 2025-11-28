package Stacks;

import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {
    public static void pushAtBottom(int x , Stack<Integer> st){
        if(st.size()==0){
            st.push(x) ;
            return;
        }
        int top = st.pop() ;
        pushAtBottom(x,st);
        st.push(top) ;
    }
    public static void reverse(Stack<Integer> st){
        if(st.size() == 1) return ;
        int top = st.pop() ;
        reverse(st) ;
        pushAtBottom(top,st) ;
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
        reverse(st) ;
        System.out.println(st);
    }
}
