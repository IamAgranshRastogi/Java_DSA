import java.util.*;
public class MxOperationInput {
  /**
   * @param args
   */
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    System.out.println("Enter no. of rows of Matrix1 :");
    int r1=s.nextInt();
    System.out.println("Enter no. of cols of Matrix1 :");
    int c1=s.nextInt();
    
    int matrix1[][]=new int[r1][c1];
    System.out.println("Enter Elements of Matrix1 :");
    for(int i=0;i<r1;i++){
      for(int j=0;j<c1;j++){
        matrix1[i][j]=s.nextInt();  
      }
    }
        
    System.out.println("Enter no. of rows of Matrix2 :");
    int r2=s.nextInt();
    System.out.println("Enter no. of cols of Matrix2 :");
    int c2=s.nextInt();
    int matrix2[][]=new int[r2][c2];
    
    System.out.println("Enter Elements of Matrix2 :");
    for(int i=0;i<r2;i++){
      for(int j=0;j<c2;j++){
        matrix2[i][j]=s.nextInt();
      }
    }    
    System.out.println("  Do you wish to get \n1. Matrix Sum \n2. Matrix Multiplication \nEnter 1 or 2 :");
    int op=s.nextInt();
    if (op==1)
    { System.out.println("Matrix Sum result :");
      MatrixSum(matrix1,matrix2,r1,c1,r2,c2);
    }
    else if (op==2)
    { System.out.println("Matrix Multiplication result :");
      MatrixMul(matrix1,matrix2,r1,c1,r2,c2);
    }
    else{
      System.out.println("Wrong Input");
    }
    s.close();
  }

  public static void MatrixMul(int m1[][],int m2[][],int r1,int c1,int r2,int c2){
    if(c1!=r2){
      System.out.print("Invalid Input");
    }  
    else if(c1==r2){
      int res[][] = new int[r1][c2];
      for(int i=0;i<r1;i++){
        for(int j=0;j<c2;j++){
          for(int k=0;k<c1;k++){
            res[i][j] += m1[i][k] * m2[k][j];   
          }
        }
        for(int j=0;j<c2;j++){
          System.out.print(res[i][j]+" ");
        }
        System.out.println();
      }
    }
  }
  public static void MatrixSum(int a[][], int b[][],int row1,int col1,int row2,int col2){
    if(row1==row2 && col1==col2)
    { int c[][]=new int[row1][col1];
      for(int i=0;i<row1;i++){
        for(int j=0;j<col1;j++){
          c[i][j]=a[i][j] + b[i][j];
          System.out.print(c[i][j]+" ");
        }
        System.out.println();
      }
    }
    else{
        System.out.println("Sum not Possible as the size of matrices vary");
    }
  } 
}
