package Stacks;
public class ArrayImplementation {
    public static class Stack{
        private int[] arr = new int[5] ;
        private int idx = 0 ;
        void push(int x) {
            if(idx== arr.length){
                System.out.println("Stack Overflow");
                return ;
            }
            arr[idx] = x ;
            idx++ ;
        }
        int peek(){
            if(idx==0) {
                System.out.println(" Stack is Empty ");
                return -1 ;
            }
            return arr[idx-1] ;
        }
        int pop(){
            if(idx==0){
                System.out.println(" Stack Underflow ");
                return -1 ;
            }
            int top = arr[idx-1] ;
            arr[idx-1] = 0 ;
            idx-- ;
            return top ;
        }
        void display(){
            if(idx==0) {
                System.out.println(" Stack is Empty ");
                return ;
            }
            for(int o = 0 ;o<idx;o++){
                System.out.print(arr[o]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx ;
        }
        boolean isEmpty(){
            if(size()==0) return true ;
            else{
                return false ;
            }
        }
        boolean isFull(){
            if(idx==arr.length) return true ;
            return false ;
        }
        int capacity(){
            return arr.length ;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack() ;
        st.push(4) ;
        st.push(5) ;
        st.push(9) ;
        st.display() ; // 4 5 9
        System.out.println(st.size()); // 3
        System.out.println(st.pop()); // 9
        st.display() ; // 4 5

    }
}
