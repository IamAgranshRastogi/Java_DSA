//Multi dimension Arr = Arr of Arr = Jagged Arr
public class MultiDim_Arr 
{/*  int [][]arr1=new int[10][10];
 int [][][]arr2=new int[10][10][10];
*/  
static int[][] a={{10,20,30,40},{50,60},{70,80,90}};
  public static void main(String[] args) 
  { System.out.println("Multi_dim_Array"); 
    
    //Retrieval
    for(int i=0;i<a.length;i++)
    { for(int j=0;j<a[i].length;j++)
      { System.out.println(a[i][j]+" "); 
      }
      System.out.println();
    }
    
  }
}    

