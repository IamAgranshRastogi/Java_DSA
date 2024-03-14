package ArrayList_ques;

import java.util.ArrayList;
import java.util.Scanner;

public class Max_in_ArrayList {
    public static void main(String[] args) {
     Scanner s=new Scanner(System.in);
     ArrayList<Integer> ls=new ArrayList<>();     
     System.out.print("Enter the number of elements: ");
     int n=s.nextInt();
     System.out.println("Enter "+n+" elements:");
     for(int i=0;i<n;i++){
        int ele = s.nextInt();
        ls.add(ele);
     }
     System.out.print("Elements in ArrayList: ");
     System.out.println(ls);
     Max_Ele(ls);
     s.close();   
    }

    public static void Max_Ele(ArrayList<Integer> ls){
        if(ls == null || ls.isEmpty()){
            throw new IllegalArgumentException("Input Array is null or not empty");
        }
        
        int max = Integer.MIN_VALUE;
        for(int i=0;i<ls.size();i++){
            if(max < ls.get(i)){
                max = ls.get(i);
            }
            max=Math.max(max,ls.get(i)); 
        }
        System.out.println("Max Element: "+max);
    }
}
