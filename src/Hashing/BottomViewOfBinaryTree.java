package Hashing;

import java.util.*;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class Pair {
    Node node;
    int hd;

    Pair(Node node, int hd) {
        this.node = node;
        this.hd = hd;
    }
}


public class BottomViewOfBinaryTree {

    public static void bottomView(Node root){
        if(root == null ) return;
        Queue<Pair> q = new LinkedList<>();
        TreeMap<Integer,Integer> map = new TreeMap<>();
        q.add(new Pair(root,0));

        while (!q.isEmpty()){
            Pair p = q.poll();
            Node temp = p.node;
            int hd = p.hd;

//            if(!map.containsKey(hd)) {
//                map.put(hd,temp.data);  // for top view
//            }

            map.put(hd,temp.data); // for bottom view

            if(temp.left != null){
                q.add(new Pair(temp.left,hd-1));
            }
            if (temp.right != null)
                q.add(new Pair(temp.right, hd + 1));
        }

        for(int key : map.keySet()){
            System.out.println(map.get(key));
        }

    }
    public static void main(String[] args) {

        Node root = new Node(20);
        root.left = new Node(8);
        root.right = new Node(22);
        root.left.left = new Node(5);
        root.left.right = new Node(3);
        root.right.right = new Node(25);
        root.left.right.left = new Node(10);
        root.left.right.right = new Node(14);

        bottomView(root);
    }
}
