public class Diagonal_Sum 
{ public static void main(String[] args) 
  { int mx[][]= {
    {1,2,3,4},
    {5,6,7,8},
    {9,10,11,12},
    {13,14,15,16} };
    
    DiagSum(mx);
  }
  public static void DiagSum(int mx[][])
  { int lsum=0;
    int rsum=0;
    for(int i=0;i<mx.length;i++)
    { for(int j=0;j<mx[0].length;j++)
        {   if(i==j)
            { lsum=lsum+mx[i][j]; 
            }
            if(i==mx.length-1-j)
            { rsum=rsum+mx[i][j];
            }
        }
    }
    System.out.println("Left Diagonal sum :"+lsum);
    System.out.println("Right Diagonal sum :"+rsum);
    System.out.println("Sum of Diagonal's sum :"+(rsum+lsum));
  }  
}
