package Mix;
public class BSearch 
{   public static void main(String[] args) 
    {   int a[]={1,2,3,4,5,6,7,8,9};
        int target=10;
        System.out.println(search(a,target,0,a.length-1));
    }
    static int search(int a[],int tg,int s,int e)
    {   if(s>e)
        { return -1;}
        int m=s + (e-s)/2;
        if(a[m]==tg)
        { return m;}
        if(tg<a[m])
        { return search(a,tg,s,m-1); }
        return search(a,tg,m+1,e);
    }
    
}
