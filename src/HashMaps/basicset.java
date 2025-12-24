package HashMaps;

import java.util.HashSet;

public class basicset {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>() ;
        set.add(20) ;
        set.add(100) ;
        set.add(10) ;
        set.add(-2) ;
        System.out.println(set);
        // Search : O(1) -> True / False
        System.out.println(set.contains(10));
        System.out.println("Size is : "+set.size());
        set.remove(10) ;
        System.out.println(set);
        System.out.println("Size is : "+set.size());
        Object[] arr = set.toArray();
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
