package Backtracking;

import java.util.*;

public class RatInMaze {
    static void printArr(int arr[][]){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    static void printAllPath(String p, boolean maze[][], int r, int c, int arr[][], int step){
        if(r == maze.length-1 && c==maze[0].length - 1){
            arr[r][c] = step;
            printArr(arr);
            System.out.println(p);
            System.out.println();
            return;
        }

        if(!maze[r][c]){
            return;
        }

        maze[r][c] = false;
        arr[r][c] = step;

        // Down
        if(r < maze.length - 1){
            printAllPath(p+"D", maze, r+1, c, arr, step+1);
        }
        // Right
        if(c < maze[0].length - 1){
            printAllPath(p+"R", maze, r, c+1, arr, step+1);
        }
        // Up
        if(r > 0){
            printAllPath(p+"U", maze, r-1, c, arr, step+1);
        }
        // Left
        if(c > 0){
            printAllPath(p+"L", maze, r, c-1, arr, step+1);
        }

        maze[r][c] = true;
        arr[r][c] = 0;
    }

    public static void main(String[] args) {
        boolean maze[][] = {
                {true, true, true},
                {true, false, true},
                {true, true, true},
        };

        int arr[][] = new int[maze.length][maze[0].length];
        printAllPath("", maze, 0, 0, arr, 1);
    }
}
