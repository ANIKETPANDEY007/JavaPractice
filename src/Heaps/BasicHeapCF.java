package Heaps;

import java.util.Collections;
import java.util.PriorityQueue;

public class BasicHeapCF {
    public static void main(String[] args) {
        // Min Heap
//        PriorityQueue<Integer> pq = new PriorityQueue<>() ;
//        pq.add(2) ;
//        System.out.println(pq);
//        pq.add(10) ;
//        System.out.println(pq);
//        pq.add(1) ;
//        System.out.println(pq);
//        pq.remove() ;
//        System.out.println(pq);
//        pq.add(0) ;
//        System.out.println(pq);
//        pq.add(20) ;
//        System.out.println(pq);
        // Max Heap
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()) ;
        pq.add(2) ;
        System.out.println(pq);
        pq.add(10) ;
        System.out.println(pq);
        pq.add(1) ;
        System.out.println(pq);
        pq.remove() ;
        System.out.println(pq);
        pq.add(0) ;
        System.out.println(pq);
        pq.add(20) ;
        System.out.println(pq);
    }
}
