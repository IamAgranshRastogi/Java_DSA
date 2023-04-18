public class Rotated_BSearch 
{  public static void main(String[] args) 
   { int []arr ={5,6,7,8,1,2,3};
     System.out.println(Rot_Bsearch(arr,8,0,arr.length-1));
   }
   static int Rot_Bsearch(int []arr,int tg,int s,int e)
   {
    if(s>e)
    { return -1;}
    int m=s+(e-s)/2;
    if(arr[m]==tg)
    { return m;
    }
    if(arr[m]==tg)
    { return m;
    }
    if(arr[s]<=arr[m])
    { if(tg>=arr[s]&& tg<= arr[m])
      { return Rot_Bsearch(arr,tg,s,m-1);
      }
      else
      { return Rot_Bsearch(arr,tg,m+1,e);
      }
    }
    if(tg>=arr[m]&&tg<=arr[e])
    { return Rot_Bsearch(arr,tg,m+1,e);
    }
    return Rot_Bsearch(arr,tg,s,m-1);
   } 
}
