public class Search_In_Sorted 
{   public static void main(String[] args) 
    { int mx[][]={
        {10,20,30,40}, // Sorted both row wise and col wise
        {15,25,35,45},
        {27,29,37,48},
        {32,33,39,50}
        };
        int key= 35 ;
        // SortedSearch(mx,key);   
       StaircaseSearch(mx, key);
        // System.out.println(x); 
    }
    public static boolean StaircaseSearch(int mx[][],int key)
    {   int rw=0;
        int col=mx[0].length-1;
        while(rw<mx.length&&col>=0)
        { if(mx[rw][col]==key)
          { System.out.println("Found key at ("+rw+","+col+")");
            // break;
            return true;
          }
          else if(key<mx[rw][col])
          { col--;
          }
          else
          { rw++;
          }
        }
        System.out.println("key not found");
        return false; 
    }
    
}

// TC: O(n+m)
