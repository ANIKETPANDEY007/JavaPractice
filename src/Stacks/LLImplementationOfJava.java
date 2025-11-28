package Stacks;

public class LLImplementationOfJava {
    public static class Node{ // User define data type.
        int val ;
        Node next ;
        Node(int val){
            this.val = val ;
        }
    }
    public static class LLStack{ // User define data Structure.
        Node head = null ;
        int size = 0 ;
        void push(int x){
            Node temp = new Node(x) ;
            temp.next = head ;
            head = temp ;
            size++ ;
        }
        int pop(){
            if(head==null){ // That means my size of linked list is zero .
                System.out.println("Stack is Empty !");
                return -1 ;
            }
           int x = head.val ;
           head = head.next ;
           return x ;
        }
        int peek(){
            if(head==null){ // That means my size of linked list is zero .
                System.out.println("Stack is Empty !");
                return -1 ;
            }
            return head.val ;
        }
        void displayReverse(){ // Reverse Printing .
            Node temp = head ;
            while(temp !=null){
                System.out.print(temp.val+" ");
                temp = temp.next ;
            }
            System.out.println();
        }
        void displayRec(Node h){
            if(h==null) return ;
            displayRec(h.next) ;
            System.out.print(h.val+" ");
        }
        void display(){
            displayRec(head);
        }
        int size(){ // Getter .
            return size ;
        }
        boolean isEmpty(){
            if(size==0) return true ;
            else return false ;
        }
    }
    public static void main(String[] args) {

    }
}
