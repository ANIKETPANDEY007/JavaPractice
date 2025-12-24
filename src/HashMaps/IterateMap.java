package HashMaps;

import java.util.HashMap;

public class IterateMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>() ;
        map.put("Aniket",7) ;
        map.put("Snehal",8) ;
        map.put("Abhay",13) ;
        for(String key: map.keySet()){
            System.out.print(key+" -> "); // Isse key aa rha hai
            System.out.print(map.get(key)+" | "); // Isse values aa rha hai.
        }
        System.out.println();
        for(Object pair: map.entrySet()){
            System.out.println(pair);
        }
    }
}
