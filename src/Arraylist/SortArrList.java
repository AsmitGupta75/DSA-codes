package Arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrList {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(4);
        list.add(5);
        list.add(2);
        list.add(3);
        System.out.println(list);

        // assending order
        Collections.sort(list);
        System.out.println(list);

        // desending order
        Collections.sort(list,Collections.reverseOrder());  // use comparater
        System.out.println(list);
    }
}
