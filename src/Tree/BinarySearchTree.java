package Tree;

import java.util.ArrayList;

public class BinarySearchTree {
    static class Node{
        int data;
        Node left;
        Node right;

        public Node(int data){
            this.data = data;
        }
    }

    // build BST
    public static Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }

        if(root.data > val){
            root.left = insert(root.left,val);
        }else {
            root.right = insert(root.right,val);
        }

        return root;
    }

    public static void inorder(Node root ){
        if(root == null){
            return;
        }

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }

    // Search in BST
    public static boolean search(Node root , int key){
        if(root == null){
            return false;
        }

        if(root.data == key){
            return true;
        }
        if(root.data > key){
            return search(root.left, key);
        }else {
            return search(root.right, key);
        }
    }


    // Delete a Node in BST
    public static Node delete(Node root, int val){
        if(root.data < val){
            root.right = delete(root.right, val);
        }
        else if(root.data > val){
            root.left = delete(root.left, val);
        }else {
            // case 1
            if(root.left == null && root.right == null){
                return null;
            }

            // case 2
            if(root.left == null){
                return root.right;
            }else if(root.right == null){
                return root.left;
            }

            // both children
            Node IS = findInorderSuccessor(root.right);
            root.data = IS.data;
            root.right = delete(root.right,IS.data);
        }

        return root;
    }

    public static Node findInorderSuccessor(Node root){
        while (root.left != null){
            root = root.left;
        }
        return root;
    }


    // Print in Range
    public static void printInRange(Node root, int k1, int k2){
        if(root == null){
            return;
        }
        if(root.data >= k1 && root.data <= k2){
            printInRange(root.left,k1,k2);
            System.out.print(root.data +" ");
            printInRange(root.right,k1,k2);
        }else if(root.data < k1){
            printInRange(root.left,k1,k2);
        }else {
            printInRange(root.right,k1,k2);
        }
    }


    // Root to leaf Path
    public static void printpath(ArrayList<Integer> path){
        for(int i = 0; i<path.size(); i++){
            System.out.print(path.get(i)+ " -> ");
        }
        System.out.println(" Null ");
    }
    public static void root2Leaf(Node root, ArrayList<Integer> path){
        if(root == null){
            return;
        }
        path.add(root.data);

        if(root.left == null && root.right == null){
            printpath(path);
        }

        root2Leaf(root.left,path);
        root2Leaf(root.right,path);

        path.remove(path.size() - 1);
    }



    // Validate BST
    public static boolean isValid(Node root, Node min, Node max){
        if(root == null){
            return true;
        }

        if(min != null && root.data <= min.data){
            return false;
        }else if(max != null && root.data >= max.data){
            return false;
        }

        return isValid(root.left,min,root) && isValid(root.right,root,max);
    }

    public static void main(String[] args) {
        int values[] = {8,5,3,1,4,6,10,11,14};
        Node root = null;

        for(int i=0; i<values.length; i++){
            root = insert(root,values[i]);
        }

//        inorder(root);

//        if(search(root,3)){
//            System.out.println("found");
//        }else {
//            System.out.println("not found");
//        }

//        root = delete(root,5);
//        System.out.println();
//        inorder(root);
//        System.out.println();

//        printInRange(root,5,12);

        root2Leaf(root, new ArrayList<>());

        if(isValid(root,null, null)){
            System.out.println("valid");
        }else System.out.println("Invalid");
    }
}
