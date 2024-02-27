public class SpiralMatrx
{ 
    public static void printSpiral(int matrix[][]) 
    {   int top=0;
        int left=0;
        int bottom=matrix.length-1;
        int right=matrix[0].length-1;
        
        while(top <= bottom && left <= right)
        { //top
          for(int j=left;j<=right;j++)
          { System.out.print(matrix[top][j]+" ");
          }
          

          //right
          for(int i=top+1;i<=bottom;i++)
          { System.out.print(matrix[i][right]+" ");
          }
          

          //bottom
          for(int j=right-1;j>=left;j--)
          { if(top==bottom) 
            { break;
            }
            System.out.print(matrix[bottom][j]+" ");
          }
          

          //left
          for(int i=bottom-1;i>=top+1;i--)
          { if(left==right) 
            { break;
            }
            System.out.print(matrix[i][left]+" ");
          }
          top++;
          right--;
          bottom--;
          left++;
        }
        System.out.println();
    }
    public static void main(String[] args) 
    { int matrix [][]={{1,2,3,4,5},
                        {6,7,8,9,10},
                        {11,12,13,14,15}};
 
      int matrix2[][]= {{ 1,  2,  3,  4},
                       { 5,  6,  7,  8},
                       { 9, 10, 11, 12},
                       {13, 14, 15, 16}};
      
      printSpiral(matrix);
      System.out.println("--------------------");
      printSpiral(matrix2);
    }

}