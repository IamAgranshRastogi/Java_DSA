package Hashing;

import java.util.*;

public class CountNumInArr
{ public static void main(String[] args) 
  {  Scanner s=new Scanner(System.in);
     int n=s.nextInt();
     int a[]=new int[n];
     for(int i=0;i<n;i++)
     { a[i]=s.nextInt();
     }
     
     int hash[]=new int[n+1];
     for(int i=0;i<=n;i++)
     {  hash[a[i]]+=1;
     }
     int q=s.nextInt();
     while(q-->0)
     { int num=s.nextInt();
       System.out.println(num);
     }
     s.close();
  }
} 
// https://www.youtube.com/@ArshGoyal/
// https://www.youtube.com/channel/UCkqR9QW4r1J9_k4_BBvdG2Q