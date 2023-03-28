package Sorting;

import java.util.Scanner;

public class SelectionSortStr
{     public static void main(String[] args)
        {   Scanner s=new Scanner(System.in);
            System.out.println("Enter number of elements :");
            int size=s.nextInt();
            String[] a=new String[size];
            System.out.println("Enter elements: ");
            for(int i=0;i<size;i++)
            {
                a[i]=s.next();
            }
            int min;     // var to check for smallest element
            String temp="";                  // var for swapping
            for(int i=0;i<size;i++)
            {  min=i;
                for(int j=i+1;j<size;j++)        //to  check right side remaining elemnts for smallest
                {
                    if(a[j].compareTo(a[min])<0)         //shift index to rightside element if  smaller than current
                    {
                        min=j;
                    }
                }
                temp=a[i];                      // swapping current element
                a[i]=a[min];                    // with smallest rightside
                a[min]=temp;                    // element found
            }
            System.out.println("sorted list of elements :");
            for(int j=0;j<size;j++)
            {
                System.out.println(a[j]);
            }
            s.close();
        }


}
