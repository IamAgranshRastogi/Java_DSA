public class SpiralMatrx
{ 
    public static void printSpiral(int mx[][]) 
    {   int rwstrt=0;
        int colstrt=0;
        int rwend=mx.length-1;
        int colend=mx[0].length-1;
        
        while(rwstrt <= rwend && colstrt <= colend)
        { //top
          for(int j=colstrt;j<=colend;j++)
          { System.out.print(mx[rwstrt][j]+" ");
          }

          //right
          for(int i=rwstrt+1;i<=rwend;i++)
          { System.out.print(mx[i][colend]+" ");
          }

          //bottom
          for(int j=colend-1;j>=colstrt;j--)
          { if(rwstrt==rwend) 
            { break;
            }
            System.out.print(mx[rwend][j]+" ");
          }

          //left
          for(int i=rwend-1;i>=rwstrt+1;i--)
          { if(colstrt==colend) 
            { break;
            }
            System.out.print(mx[i][colstrt]+" ");
          }

          colstrt++;
          rwstrt++;
          colend--;
          rwend--;
        }
        System.out.println();
    }
    public static void main(String[] args) 
    { int mx[][]= {{1,2,3,4},
                   {5,6,7,8},
                   {9,10,11,12},
                   {13,14,15,16}};
      
      printSpiral(mx);
    }

}