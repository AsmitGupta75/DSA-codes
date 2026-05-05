package Hashing;

import java.util.HashMap;
import java.util.*;

public class FrequencySort {
    public static String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: Count frequency
        for(char c : s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: Max Heap based on frequency
        PriorityQueue<Character> pq = new PriorityQueue<>(
                (a,b) -> map.get(b) - map.get(a)
        );

        pq.addAll(map.keySet());

        // Step 3: Build result string
        StringBuilder result = new StringBuilder();

        while(!pq.isEmpty()){
            char ch = pq.poll();
            int freq = map.get(ch);

            for(int i=0; i<freq; i++){
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }
}