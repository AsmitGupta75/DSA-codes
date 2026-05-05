package Queues;

import java.util.*;

public class DequeInterface {
    public static void main(String[] args) {
        Deque<Integer> d = new LinkedList<>();
        d.addFirst(2);
        d.addFirst(1);
        d.addLast(3);
        d.addLast(4);
        System.out.println(d);
        d.removeLast();
        System.out.println(d);
        System.out.println(d.getFirst());
        System.out.println(d.getLast());
    }
}
