package Hashing;

import java.util.HashMap;
import java.util.Set;

public class HashingOperation {
    public static void main(String[] args) { // O(1)
        HashMap<String , Integer> hm = new HashMap<>();
        hm.put("India",33);
        hm.put("USA",55);
        hm.put("NZ",88);
        System.out.println(hm);

        int population = hm.get("India");
        System.out.println(population);
        System.out.println(hm.get("hello"));

        System.out.println(hm.remove("India"));
        System.out.println(hm.remove("hello"));

        System.out.println(hm.containsKey("USA"));

        System.out.println(hm.size());
        hm.clear();
        System.out.println(hm.isEmpty());


        // Iteration on Hashmap
        HashMap<String, Integer> h = new HashMap<>();
        h.put("India",5);
        h.put("UK",6);
        h.put("USA",4);
        h.put("China",0);
        h.put("Russia",7);

        Set<String> Keys = h.keySet();
        System.out.println(Keys);

        for(String k : Keys){
            System.out.println("key="+k+", Value="+h.get(k));
        }


    }
}
