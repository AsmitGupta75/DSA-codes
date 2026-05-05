package Tree;

import java.util.*;

public class TreeQuestion {
    static class Node{
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    // Height of a Tree
    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        return Math.max(lh,rh) + 1;
    }

    // Count of tree
    public static int count(Node root){
        if(root == null){
            return 0;
        }

        int lc = count(root.left);
        int rc = count(root.right);

        return lc + rc + 1;
    }

    // Sum of Node
    public static int sum(Node root){
        if(root == null){
            return 0;
        }

        int lsum = sum(root.left);
        int rsum = sum(root.right);

        return lsum + rsum + root.data;
    }

    // Diameter of a Tree -- O(n^2)
    public static int diameter1(Node root){
        if(root == null){
            return 0;
        }

        int leftDiam = diameter1(root.left);
        int leftht = height(root.left);
        int rightDiam = diameter1(root.right);
        int rightht = height(root.left);

        int selfDiam = leftht + rightht + 1;

        return Math.max(selfDiam,Math.max(leftDiam,rightDiam));
    }

    // Diameter of a Tree approach 2  -- O(n)
    public static class Info{
        int diam;
        int ht;
        public Info(int diam , int ht){
            this.diam = diam;
            this.ht = ht;
        }
    }
    public static Info diameter(Node root){
        if(root == null){
            return new Info(0,0);
        }

        Info leftInfo = diameter(root.left);
        Info rightInfo = diameter(root.right);

        int diam = Math.max(Math.max(leftInfo.diam,rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
        int ht = Math.max(leftInfo.ht , rightInfo.ht) + 1;

        return new Info(diam,ht);
    }


    // SubTree of another Tree;

    public static boolean isIdentical(Node node , Node subRoot){
        if(node == null && subRoot == null){
            return true;
        }else if(node == null || subRoot == null || node.data != subRoot.data){
            return false;
        }

        if(!isIdentical(node.left, subRoot.left)){
            return false;
        }
        if(!isIdentical(node.right,subRoot.right)){
            return false;
        }

        return true;
    }
    public static boolean isSubtree(Node root , Node subRoot){
        if(root == null ){
            return false;
        }
        if(root.data == subRoot.data){
            if(isIdentical(root , subRoot)){
                return true;
            }
        }

        return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
    }


    // Top view of Tree
    public static class Infoo{
        Node node;
        int hd;

        public Infoo(Node node , int hd){
            this.node = node;
            this.hd = hd;
        }
    }

    public static void topView(Node root){
        Queue<Infoo> q = new LinkedList<>();
        HashMap<Integer,Node> map = new HashMap<>();

        int min = 0 ,max = 0;
        q.add(new Infoo(root,0));
        q.add(null);

        while(!q.isEmpty()){
            Infoo curr = q.remove();
            if(curr == null){
                if(q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            }else {
                if(!map.containsKey(curr.hd)){
                    map.put(curr.hd, curr.node);
                }
                if(curr.node.left != null){
                    q.add(new Infoo(curr.node.left, curr.hd-1));
                    min = Math.min(min,curr.hd-1);
                }
                if(curr.node.right != null){
                    q.add(new Infoo(curr.node.right, curr.hd+1));
                    max = Math.max(max,curr.hd+1);
                }
            }
        }
        for(int i=min; i<=max; i++){
            System.out.print(map.get(i).data+" ");
        }
        System.out.println();
    }


    // kth level print
    public static void kLevel(Node root, int level, int k) {
        if (root == null) {
            return;
        }
        if (level == k) {
            System.out.print(root.data + " ");
        }

        kLevel(root.left, level + 1, k);
        kLevel(root.right, level + 1, k);
    }

    // Lowest common Ancestor

    public static boolean getPath(Node root, int n, ArrayList<Node> path){
        if(root == null){
            return false;
        }

        path.add(root);

        if(root.data == n){
            return true;
        }

        boolean leftPath = getPath(root.left, n, path);
        boolean rightPath = getPath(root.right, n , path);

        if(leftPath || rightPath){
            return true;
        }

        path.remove(path.size()-1);

        return false;
    }
    public static Node lca(Node root , int n1, int n2){
        ArrayList<Node> path1 = new ArrayList<>();
        ArrayList<Node> path2 = new ArrayList<>();

        getPath(root, n1, path1);
        getPath(root, n2, path2);

        int i=0;
        for(; i<path1.size() && i<path2.size(); i++){
            if(path1.get(i) != path2.get(i)){
                break;
            }
        }

        Node lca = path1.get(i-1);
        return lca;
    }

    // Lowest common Ancestor approach 2;
    public static Node lca2(Node root , int n1, int n2 ){
        if(root == null || root.data == n1 || root.data == n2){
            return root;
        }

        Node leftLca = lca2(root.left, n1, n2);
        Node rightLca = lca2(root.right, n1, n2);

        if(leftLca == null){
            return rightLca;
        }
        if(rightLca == null){
            return leftLca;
        }

        return root;
    }


    // Minimum distance b/w 2 nodes;

    public static int lcaDist(Node  root, int n){
        if(root == null){
            return -1;
        }

        if(root.data == n){
            return 0;
        }

        int leftDist = lcaDist(root.left, n);
        int rightDist = lcaDist(root.right, n);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }else if(leftDist == -1){
            return rightDist + 1;
        }else {
            return leftDist + 1;
        }

    }

    public static int minDist(Node root, int n1, int n2){
        Node lca = lca2(root,n1,n2);
        int dist1 = lcaDist(lca, n1);
        int dist2 = lcaDist(lca, n2);

        return dist1 + dist2;
    }


    // kth ancestor of node

    public static int kAncestor(Node root, int n , int k){
        if(root == null){
            return -1;
        }
        if(root.data == n){
            return 0;
        }

        int leftDist = kAncestor(root.left,n,k);
        int rightDist = kAncestor(root.right,n,k);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }

        int max = Math.max(leftDist,rightDist);

        if(max + 1 == k){
            System.out.println(root.data);
        }

        return max+1;
    }


    // Transform to sum Tree
    public static int transform(Node root){
        if(root == null){
            return 0;
        }

        int leftChild = transform(root.left);
        int rightChild = transform(root.right);

        int data = root.data;

        int newLeft = root.left == null ? 0 : root.left.data;
        int newRight = root.right == null ? 0 : root.right.data;
        root.data = newLeft + leftChild + newRight + rightChild;

        return data;
    }

  public static void preOrder(Node root){
        if(root == null){
            return;
        }
      System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
  }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

//        System.out.println(height(root));
//        System.out.println(count(root));
//        System.out.println(sum(root));
//        System.out.println(diameter1(root));

//        System.out.println(diameter(root).diam);
//        System.out.println(diameter(root).ht);

//
//        Node subRoot = new Node(2);
//        subRoot = new Node(4);
//        subRoot = new Node(5);
//        System.out.println(isSubtree(root, subRoot));

//        topView(root);
//
//        int k = 3;
//        kLevel(root,1,k);

//        int n1 = 4, n2 = 6;
//        System.out.println(minDist(root,n1,n2));

//        int n = 5 , k = 2;
//        System.out.println(kAncestor(root,n,k));

        transform(root);
        preOrder(root);

    }
}
