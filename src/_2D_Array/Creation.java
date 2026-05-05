package _2D_Array;

import java.util.Scanner;

public class Creation {
    public static boolean search(int matrix[][],int key){
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == key){
                    System.out.println("found element at index ("+i+","+j+")");
                    return true;
                }
            }
        }
        return false;
    }

    public static void largestSmallest(int matrix[][]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix[0].length; j++){
                 largest = Math.max(largest,matrix[i][j]);
                 smallest= Math.min(smallest,matrix[i][j]);
            }
        }
        System.out.println(largest+ ","+ smallest );
    }

    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n=matrix.length, m=matrix[0].length;
        Scanner s = new Scanner(System.in);
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                matrix[i][j] = s.nextInt();
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix,5);
        largestSmallest(matrix);
    }
}
