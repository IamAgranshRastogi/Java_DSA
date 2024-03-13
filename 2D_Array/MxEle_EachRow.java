public class MxEle_EachRow {
    public static void main(String[] args) {
        int matrix[][]={{1,30,20,34},
                        {25,31,19,56},
                        {46,49,323,87}};
                        
        MaxEleInEachRow(matrix);
    }
    public static void MaxEleInEachRow(int [][]matrix){
        for(int i=0;i<matrix.length;i++){
            int mxEle=matrix[i][0];
            for(int j=0;j<matrix[0].length;j++){
                if(mxEle<matrix[i][j]){
                    mxEle=matrix[i][j];
                }
            }
            System.out.println("Max element in row"+(i+1)+":"+mxEle);
        }
    }
}
