// Given an m x n integer matrix matrix, if an element is 0,
//  set its entire row and column to 0's.

import java.util.Scanner;
class SetMatrixZero{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter No. of Rows :");
        int m=s.nextInt();
        System.out.println("Enter No. of Rows :");
        int n=s.nextInt();
        int mx[][]=new int[m][n];
        System.out.println("Enter elements of matrix with few zeros:");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mx[i][j]=s.nextInt();
            }
        }
        
        System.out.println("Result matrix after setting zeros :");
        int mx1[][]=SetMatrix3(mx,m,n);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(mx1[i][j]+" ");
            }
            System.out.println();
        }
        s.close();
    }

    // public static void SetMatrix(int mx[][],int m,int n){
    //   for(int i=0;i<m;i++){
    //     for(int j=0;j<n;j++){
    //        if(mx[i][j]==0){
    //         SetRow(mx,n,i);
    //         SetCol(mx,m,j);
    //        }
    //     }
    //   }
      
    //   for(int i=0;i<m;i++){
    //     for(int j=0;j<n;j++){
    //        if(mx[i][j]==Integer.MIN_VALUE ){
    //         mx[i][j]=0;
    //        }
    //        System.out.print(mx[i][j]+" ");
    //     }
    //     System.out.println();
    //   }
    // }

    // public static int[][] SetRow(int [][]mx,int n,int i){
    //   for(int j=0;j<n;j++){
    //     mx[i][j]=Integer.MIN_VALUE;
    //   }
    //   return mx;
    // }

    // public static int[][] SetCol(int [][]mx,int m,int j){
    //   for(int i=0;i<m;i++){
    //     mx[i][j]=Integer.MIN_VALUE;
    //   }
    //   return mx;
    // }
   
   public static int [][]SetMatrix3(int mx[][],int m,int n){
    int col0=0;  // Oth index of Column Mark
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            if(mx[i][j]==0){  // If Element 0
                mx[i][0]=0;   //    Row Mark=0 
                if(j==0){     //    If Element 0 found in 0th column
                    col0=0;   //       Zeroth Col Mark =0 
                }
                else{         //    Else
                    mx[0][j]=0;//      Col Mark=0
                }
            }
        }
    }

    for(int i=1;i<m;i++){       // FROM 1st row | Not taking Col Mark
        for(int j=1;j<n;j++){   // FROM 1st col | Not taking Row Mark
            if(mx[i][j]!=0){    // IF ele not 0
                if(mx[0][j]==0||mx[i][0]==0){  // FOR ele in 0th row| Col Mark OR 0th col | Row Mark equals 0 
                   mx[i][j]=0;                 // Set all ele in that row and col 0
                }
            }
        }
    }

    if(mx[0][0]==0){      // IF 0th Row Mark equals 0
        for(int j=0;j<n;j++){ // Set all ele of that col be 0
            mx[0][j]=0;
        }
    }
    if(col0==0){          // IF 0th Col Mark equals 0
      for(int i=0;i<m;i++){ // Set all ele of that row be 0
           mx[i][0]=0;
      }
    }
    return mx;
   }
}