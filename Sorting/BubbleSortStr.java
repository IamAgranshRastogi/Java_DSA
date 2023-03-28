package Sorting;
import java.util.Scanner;
    public class BubbleSortStr
    {   public static void main(String[] args)
          { Scanner s=new Scanner(System.in);
            System.out.print("Enter number of elements to be sorted :");
            int n=s.nextInt();
            String[] a=new String[n];
            System.out.println("Enter elements :");
            for(int i=0;i<n;i++)
            {   a[i]=s.next();
            }
            // ************Main BUBBLE SORT CODE STARTS HERE*************
            String temp;
            for(int i=0;i<n;i++)
            {   int flag=0;
                for(int j=0;j<n-1-i;j++)
                {   if(a[j].compareTo(a[j+1])>0)
                {  temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=1;
                }
                }
                if(flag==0)
                { break;
                }
            }
            System.out.println("Array after performing Bubble sort: ");
            for(int j=0;j<n;j++)
            {
                System.out.println(a[j]);
            }
            s.close();
          }
    }
