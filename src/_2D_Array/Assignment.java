package _2D_Array;

public class Assignment {
    public static void print7(int matrix[][]){
        int countof7 = 0;
        for(int i=0; i<matrix.length; i++){
            for(int  j=0; j<matrix[0].length; j++){
                if(matrix[i][j] == 7) countof7++;;
            }
        }
        System.out.println("no of 7 : "+countof7);
    }

    public static void sumOfSecondRow(int[][] nums){
        int sum = 0;
        for(int j=0; j<nums[0].length; j++){
            sum += nums[1][j];
        }
        System.out.println("sum : "+sum);
    }

    public static void print2dArray(int matrix[][]){
        System.out.println("the matrix is : ");
        for(int i=0; i<matrix.length; i++){
            for(int  j=0; j<matrix[0].length; j++){
                System.out.print(matrix[i][j]+ "   ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        // int matrix[][] = {{4,7,8}, {8,8,7}};
        // print7(matrix);

        //int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        //sumOfSecondRow(nums);

        int row = 2, column = 3;
        int[][] matrix = { {2, 3, 7}, {5, 6, 7} };

        // display original matrix
        print2dArray(matrix);

        // transpose the matrix
        int[][] transpose = new int[column][row];
        for(int i = 0; i<row; i++) {
            for (int j = 0; j<column; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        print2dArray(transpose);


    }
}
