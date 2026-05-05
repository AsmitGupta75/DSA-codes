package Hashing;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.TreeMap;

public class LinkedHashMapp {
    public static void main(String[] args) {
        LinkedHashMap<String,Integer> h = new LinkedHashMap<>();
        h.put("India", 55);
        h.put("Usa" , 43);
        h.put("hello",88);
        System.out.println(h);

        TreeMap<String,Integer> hm = new TreeMap<>();
        hm.put("India", 55);
        hm.put("Usa" , 43);
        hm.put("Hello",88);
        System.out.println(hm);

    }
}
