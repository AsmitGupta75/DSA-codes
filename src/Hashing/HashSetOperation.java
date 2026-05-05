package Hashing;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetOperation {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(5);
        set.add(4);
        set.add(7);
        set.add(9);

        System.out.println(set);
        System.out.println(set.remove(9));
        System.out.println(set);
        System.out.println(set.contains(9));

        System.out.println(set.size());
        set.clear();
        System.out.println(set.isEmpty());

        // iteration on hashSet
        HashSet<String> cities = new HashSet<>();
        cities.add("delhi");
        cities.add("mumbai");
        cities.add("hello");

        // using iterator
        Iterator it = cities.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        // using loop
        for(String city : cities){
            System.out.println(city);
        }

    }
}
