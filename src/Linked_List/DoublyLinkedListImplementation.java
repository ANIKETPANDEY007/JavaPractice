package Linked_List;
class dNode{
    int val ;
    dNode next ;
    dNode prev ;
    dNode(int val){
        this.val = val ;
    }

}
class DLL{
    dNode head ;
    dNode tail ;
    int size ;
    void display(){
        dNode temp = head ;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next ;
        }
        System.out.println();
     }
    void insertAtTail(int val){
        dNode temp = new dNode(val) ;
        if(size==0) head = tail = temp ;
        else{
            tail.next = temp ;
            temp.prev = tail ;
            tail = temp ;
        }
        size++ ;
    }
    void insertAtHead(int val){
        dNode temp = new dNode(val) ;
        if(size==0) head = tail = temp ;
        else{
            temp.next = head ;
            head.prev = temp ;
            head = temp ;
        }
        size++ ;
    }
    void insertAtIndex(int idx ,int val){
        if(idx==0) insertAtHead(val) ;
        else if(idx==size-1) insertAtTail(val) ;
        else if(idx>=size || idx<0){
            System.out.println("Invalid Index ");
        }
        dNode temp = new dNode(val) ;
        dNode x = head ;
        for (int i = 0; i < idx-1; i++) {
            x = x.next ;
        }
        temp.next = x.next ;
        x.next.prev = temp ;
        temp.prev = x ;
        x.next = temp ;
        size++ ;
    }

}

public class DoublyLinkedListImplementation {
//    public static void print(dNode head){
//        dNode temp = head ;
//        while(temp != null){
//            System.out.print(temp.val+" ");
//            temp = temp.next ;
//        }
//        System.out.println();
//    }
//    public static void printReverse(dNode tail){
//        dNode temp = tail ;
//        while(temp != null){
//            System.out.print(temp.val+" ");
//            temp = temp.prev ;
//        }
//        System.out.println();
//    }
//    public static void display(dNode temp){
//        while(temp.prev != null){
//            temp = temp.prev ;
//        }
//        // now temp will be at head .
//        print(temp) ;
//    }

    public static void main(String[] args) {
//        dNode a = new dNode(10) ;
//        dNode b = new dNode(20) ;
//        dNode c = new dNode(30) ;
//        dNode d = new dNode(40) ;
//        a.next = b ; b.prev = a ;
//        b.next = c ; c.prev = b ;
//        c.next = d ; d.prev = c ;
//        print(a);
//        printReverse(d);
//        display(c) ;
        DLL list = new DLL() ;
        list.display();
        list.insertAtTail(10);
        list.display();
        list.insertAtTail(20);
        list.insertAtTail(30);
        list.display();
        list.insertAtTail(40);
        list.display();
        list.insertAtHead(5);
        list.display();
        list.insertAtIndex(1,8);
        list.display();

    }
}
