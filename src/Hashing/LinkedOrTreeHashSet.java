package Hashing;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class LinkedOrTreeHashSet {
    public static void main(String[] args) {
        LinkedHashSet<String > cities = new LinkedHashSet<>();
        cities.add("delhi");
        cities.add("indore");
        cities.add("bhopal");
        cities.add("mumbai");
        System.out.println(cities);// order maintained

        TreeSet<String> ts = new TreeSet<>();
        ts.add("delhi");
        ts.add("aba");
        ts.add("jbl");
        ts.add("ind");
        ts.add("bpl");
        System.out.println(ts);// sorted order

    }
}
