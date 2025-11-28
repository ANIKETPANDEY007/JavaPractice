package PracticeLL;
class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}
class SLL{
    Node head ;
    Node tail ;
    int size ;

    void display(){
        Node temp = head;
        while(temp !=null){
            System.out.print(temp.val+"->");
            temp = temp.next ;
        }
        System.out.println("null");
    }
    void insertAtTail(int val){
        Node temp = new Node(val) ;
        if(head == null) head = tail = temp ;
        else{
            tail.next = temp ;
            tail = temp ;
        }
        size++ ;
    }
    void insertAtHead(int val){
        Node temp = new Node(val) ;
        if(head == null) head = tail = temp ;
        else{
            temp.next = head ;
            head = temp ;
        }
        size++ ;
    }
    void insertAtPos(int val,int idx){
        if(idx<0 || idx>size){
            System.out.println("Enter an valid an index ");
            return ;
        }
        Node x = head ;
        Node temp = new Node(val) ;
        if(head == null) head = tail = temp ;
        else if(idx==0) {
            insertAtHead(val);
            return ;
        }
        else if(idx==size) {
            insertAtTail(val);
            return ;
        }
        for (int i = 0; i < idx-1; i++) {
            x = x.next ;
        }
        temp.next = x.next ;
        x.next = temp ;
        size++ ;
    }

}


public class Prac1 {
    public static void main(String[] args) {
        SLL list = new SLL() ;
        list.insertAtTail(10);
        list.display() ;
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.display() ;
        list.insertAtHead(1);
        list.insertAtHead(2);
        list.insertAtHead(3);
        list.display() ;
        list.insertAtPos(5,4);
        list.display();
    }
}
