package HashMaps;

import java.util.TreeMap;
import java.util.TreeSet;

public class Treemap {
    public static void main(String[] args) {
        TreeMap<String,Integer> map = new TreeMap<>() ;
        map.put("Aniket",7) ;
        map.put("Snehal",8) ;
        map.put("Abhay",13) ;
        for(String key: map.keySet()){
            System.out.print(key+" -> "); // Isse key aa rha hai
            System.out.print(map.get(key)+" | "); // Isse values aa rha hai.
        }
    }
}
