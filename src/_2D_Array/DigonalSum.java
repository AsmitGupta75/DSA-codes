package _2D_Array;

public class DigonalSum {
    public static int digonalSum(int matrix[][]){
        int sum =0;

        //brout force
//        for(int i=0; i<matrix.length; i++){
//            for(int j=0; j<matrix[0].length; j++){
//                if(i==j){
//                    sum += matrix[i][j];
//                }
//                else if(i+j == matrix.length-1){
//                    sum += matrix[i][j];
//                }
//            }
//        }

        //optimal
        for(int i=0; i<matrix.length; i++){
            //sd
            sum += matrix[i][i];
            //pd
            if(i != matrix.length-i-1) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        int matrix[][] = {{1,2,3,4},
                {5,6,7,8},{9,10,11,12},{13,14,15,16}};
        System.out.println(digonalSum(matrix));
    }
}
