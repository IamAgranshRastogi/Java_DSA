public class DiagonalSwap {
    public static void main(String[] args) {
     int matrix[][]={{  1,  2,  3,  4},
                     {  5,  6,  7,  8},
                     {  9, 10, 11, 12},
                     { 13, 14, 15, 16}};
     swapDiagonal(matrix);

     for(int i=0;i<matrix.length;i++){
        for(int j=0;j<matrix[0].length;j++){
            System.out.print(matrix[i][j]);
        }
        System.out.println();
     }   
    }
    public static void swapDiagonal(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            int temp =matrix[i][i];
            matrix[i][i]=matrix[i][matrix.length-1-i];
            matrix[i][matrix.length-1-i]=temp;
        }
    }
}
