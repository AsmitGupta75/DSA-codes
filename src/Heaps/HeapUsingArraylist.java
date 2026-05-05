package Heaps;

import java.util.ArrayList;

public class HeapUsingArraylist {
    static class Heap {  // O(logn)
        ArrayList<Integer> arr = new ArrayList<>();

        public void add(int data) {
            // add at last index
            arr.add(data);
            int x = arr.size() - 1; // child index
            int par = (x - 1) / 2; // parent index

            while (arr.get(x) < arr.get(par)) {
                int temp = arr.get(x);
                arr.set(x, arr.get(par));
                arr.set(par, temp);

                x = par;
                par = (x-1)/2;
            }

        }

        public int peek(){
            return arr.get(0);
        }

        private void heapity(int i){  // O(logn)
            int left = 2*i+1;
            int right = 2*i+2;
            int minIdx = i;

            if(left < arr.size() && arr.get(minIdx) > arr.get(left)){
                minIdx = left;
            }

            if(right < arr.size() && arr.get(minIdx) > arr.get(right)){
                minIdx = right;
            }

            if(minIdx != i){
                int temp = arr.get(i);
                arr.set(i, arr.get(minIdx));
                arr.set(minIdx,temp);

                heapity(minIdx);
            }
        }

        public int remove(){
            int data = arr.get(0);

            // swap 1st & last
            int temp = arr.get(0);
            arr.set(0,arr.get(arr.size()-1));
            arr.set(arr.size()-1,temp);

            // remove last element
            arr.remove(arr.size() - 1);

            // heapify
            heapity(0);

            return data;
        }

        private boolean isEmpty(){
            return arr.size() == 0;
        }
    }
    public static void main(String[] args) {
        Heap pq = new Heap();
        pq.add(3);
        pq.add(2);
        pq.add(1);
        pq.add(5);

        while (!pq.isEmpty()){
            System.out.println(pq.peek());
            pq.remove();
        }
    }
}
