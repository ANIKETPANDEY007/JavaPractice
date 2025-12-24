package HashMaps;

import java.util.HashMap;

public class BasicMap {
    public static void main(String[] args) {
        HashMap<String,Integer> map = new HashMap<>() ;
        map.put("Aniket",7) ;
        map.put("Snehal",8) ;
        map.put("Abhay",13) ;
        System.out.println(map+" -> "+map.size());
        map.remove("Aniket") ;
        System.out.println(map+" -> "+map.size());
    }
}
