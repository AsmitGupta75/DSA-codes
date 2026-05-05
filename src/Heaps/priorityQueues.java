package Heaps;


import java.util.Comparator;
import java.util.PriorityQueue;

public class priorityQueues {
    static class Student implements Comparable<Student>{
        String Name;
        int rank;

        public Student(String Name, int rank){
            this.Name = Name;
            this.rank = rank;
        }

        @Override
        public int compareTo(Student S2){
            return this.rank - S2.rank;
        }
    }
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A",3)); // O(logn)
        pq.add(new Student("B",5));
        pq.add(new Student("C", 1));
        pq.add(new Student("D",9));

        while (!pq.isEmpty()){
            System.out.println(pq.peek().Name+" --> "+ pq.peek().rank);  //O(1)
            pq.remove(); // O(logn)
        }
    }
}
