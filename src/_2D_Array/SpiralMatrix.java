package _2D_Array;

public class SpiralMatrix {
    public static void spiralMatrix(int matrix[][] ){
        int stRow = 0;
        int stCol = 0;
        int edRow = matrix.length-1;
        int edCol = matrix[0].length-1;

        while(stRow <= edRow && stCol <= edCol){
            //top
            for(int j=stCol; j<=edCol; j++){
                System.out.print(matrix[stRow][j]+" ");
            }
            //right
            for (int i=stRow+1; i<=edRow; i++){
                System.out.print(matrix[i][edCol]+" ");
            }
            //bottom
            for(int j=edCol-1; j>=stCol; j--){
                if(stRow == edRow){
                    break;
                }
                System.out.print(matrix[edRow][j]+" ");
            }
            //left
            for(int i=edRow-1; i>=stRow+1 ; i--){
                if(stCol == edCol){
                    break;
                }
                System.out.print(matrix[i][stCol]+" ");
            }
            stRow++;
            stCol++;
            edCol--;
            edRow--;
        }
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                {5,6,7,8},{9,10,11,12},{13,14,15,16}};
        spiralMatrix(matrix);
    }
}
