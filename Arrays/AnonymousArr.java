//Anonymous Array is used when we have to use it only once.
class AnonymousArr
{   public static void main(String[] args) 
    { AnonymousArr.sum_1D(new int[]{10,20,30});
      AnonymousArr.sum_2D(new int[][]{{10,20,30},{40,50}});   
    }
    static void sum_1D(int[] no1)
    { int tot1=0;
        for(int i:no1)
        { tot1=tot1+i;
        }
        System.out.println("Sum is :"+ tot1);
    }
    static void sum_2D(int[][] no2)
    {  int tot2=0;
       for(int j1[]:no2)
       {  for(int j2:j1)
          { tot2=tot2 + j2;
          }  
       } 
       System.out.println("Sum is : " + tot2);

    }
}

/*
1. Array without Name.
2. Created & Initialized in a single line.
3. It can be single or multidimensional also.
4. It can be used only once.
5. It can be used as an Argument in Method. 


 */