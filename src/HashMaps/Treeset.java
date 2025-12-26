package HashMaps;
import java.util.TreeSet ;
public class Treeset {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>() ;
        set.add(20) ;
        set.add(100) ;
        set.add(10) ;
        set.add(-2) ;
        for(int ele: set){
            System.out.print(ele+" ");
        }
    }
}
