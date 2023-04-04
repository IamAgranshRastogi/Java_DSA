public class Flipp_an_Img 
{  // LC 832
    public static void main(String[] args) 
    { int  [][]x={{1,0,0},{0,0,1},{1,1,0}};
      System.out.println(FlipAndInvertImage(x));
    }
    static int[][] FlipAndInvertImage(int[][] image)
    { for(int[] row:image)
      { for(int i=0 ; i<(image[0].length + 1)/2 ; i++)
        { //swap
          int temp=row[i]^1;
          row[i]=row[image[0].length-i]^1; 
          row[image[0].length-i-1]=temp;
        }
      }
      return image;
    }
    
}
