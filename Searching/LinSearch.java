package Searching;
import java.util.Scanner;
public class LinSearch 
{
    public static void main(String[] args)
    {   Scanner s=new Scanner(System.in);
        int a[]=new int[]{10,20,30,40,50};
        
        //*******Linear Search *******/
        int found=0;
        System.out.println("Enter element to be searched :");
        int x=s.nextInt();
        for(int i=0;i<a.length;i++)
        {  if(a[i]==x)
           {System.out.println("Yes "+x+" is present at "+ i +" position");
             found=1;
           }
        }
        if(found==0)
        {System.out.println(x+" is not found");
        }
        s.close();
    }
}
