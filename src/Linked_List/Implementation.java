package Linked_List;
class Node{
    int val ;
    Node next ;
    Node(int val){
        this.val = val ;
    }
}
class SLL{ // User defined data structure.
    private Node head ;
    private Node tail ;
    private int size ;
    void display(){
        Node temp = head ;
        while(temp != null) {
            System.out.print(temp.val+" ");
            temp = temp.next ;
        }

        System.out.println();
    }

    void insertAtEnd(int val){
        Node temp = new Node(val) ;
        if(head == null) head = tail = temp ;
        else{
            tail.next = temp ;
            tail= temp ;
        }
        size++ ;
    }

    void insertAtPos(int idx , int val){
        if(idx==0) {
            insertAtBeginning(val);
            return ;
        }else if(idx==size){
            insertAtEnd(val);
            return ;
        }else if(idx>size || idx<0){
            System.out.println("Invalid Index !!");
            return ;
        }
        Node temp = new Node(val) ;
        Node x = head ;
        for (int i = 0; i < idx-1; i++) {
            x = x.next ;
        }
        temp.next = x.next ;
        x.next = temp ;
        size++ ;
    }
    void insertAtBeginning(int val){
        Node temp = new Node(val) ;
        if(head == null) head = tail = temp ;
        else{
            temp.next = head ;
            head = temp ;
        }
        size++ ;
    }

    int get(int idx){
        if(idx==size-1) return tail.val;
        if(idx >= size || idx<0){
            System.out.println("Invalid Index !!");
            return -1;
        }
        Node temp = head ;
        for (int i = 1; i <= idx-1; i++) {
            temp = temp.next ;
        }
        return temp.val ;
    }

    void set(int idx,int val){
        if(idx==size-1) tail.val = val;
        if(idx >= size || idx<0){
            System.out.println("Invalid Index !!") ;
        }
        Node temp = head ;
        for (int i = 1; i <= idx-1; i++) {
            temp = temp.next ;
        }
        temp.val = val ;
    }

    void deleteAtHead() throws Error{
        if(head==null) throw new Error("List is empty") ;
        head = head.next ;
        size -- ;
    }

    void deleteAtPos(int idx) throws Error{
        if(idx==0){
            deleteAtHead();
            return;
        }
        if(idx<0 || idx>size) throw new Error("Invalid index") ;
        Node temp = head ;
        for (int i = 1; i < idx-1; i++) {
            temp = temp.next ;
        }
        if(temp.next==tail){
            tail = temp;
        }
        temp.next =  temp.next.next;
        size -- ;
    }

    void size() {
        System.out.println("Length of the list is :-"+size);
        System.out.println("Head of the list is :-"+head.val);
        System.out.println("Tail of the list is :-"+tail.val);

    }
}
public class Implementation {
    public static void main(String[] args) {
        SLL list = new SLL() ;
        list.insertAtEnd(10) ;
//        list.size();
        list.insertAtEnd(20) ;
        list.insertAtEnd(30) ;
        list.insertAtEnd(40) ;
        list.insertAtEnd(70) ;
//        list.insertAtBeginning(5);
        list.display();
        list.insertAtPos(2,15);
        list.size();
        list.display();
//        System.out.println(list.get(3));
//        list.set(4,25);
//        list.deleteAtHead();
//        list.display();
//        list.size();
//        list.deleteAtPos(5);
//        list.display();
//        list.size();


    }
}
