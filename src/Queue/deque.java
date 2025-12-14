package Queue;
import java.util.LinkedList;
import java.util.Deque ;

public class deque {
    public static void main(String[] args) {
//        Deque<Integer> dq = new LinkedList<>() ;
//        dq.addLast(1);
//        dq.addLast(2);
//        dq.addLast(3);
//        dq.addLast(4);
//        System.out.println(dq);
//        dq.addFirst(5);
//        System.out.println(dq);
//        dq.removeLast();
//        System.out.println(dq);
//        dq.removeFirst() ;
//        System.out.println(dq);
//        System.out.println(dq.getFirst());
//        System.out.println(dq.getLast());


        Deque<Integer> dq = new LinkedList<>() ;
        dq.addLast(1);
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addFirst(5);
        System.out.println(dq);
        dq.add(6); // add to last
        dq.remove(); // remove from first
    }
}
