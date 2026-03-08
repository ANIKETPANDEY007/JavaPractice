package Stacks;

import java.util.Stack;
public class Monotonic_Stack {
    public static void display(Stack<Integer>st){
        if(st.size()==0) return ;
        int top = st.pop() ;
        System.out.println(top);
        display(st) ;
        st.push(top) ;
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>() ;
        int[] arr = {5,3,4,2,1} ;
        int n = arr.length ;
        Stack<Integer> temp = new Stack<>() ;
        // Creating a min stack
        for(int i=0;i<n;i++){
            if(st.size()==0 || st.peek()>arr[i]){
                st.push(arr[i]) ;
            }else{
                while(st.peek()<=arr[i]){
                    temp.push(st.pop()) ;
                }
                st.push(arr[i]) ;
                while(temp.size()>0){
                    st.push(temp.pop()) ;
                }
            }
        }
        display(st) ;
    }
}
