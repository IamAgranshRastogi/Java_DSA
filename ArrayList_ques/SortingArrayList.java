package ArrayList_ques;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;

public class SortingArrayList {
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
        Collections.sort(ls);
        System.out.println("After Sorting Asc order: "+ls);

        Collections.sort(ls,Collections.reverseOrder());  // reverseOrder() is a comparator used to define order of sorting.
        System.out.println("After soring Desc order: "+ls);
        s.close();
    }    
}
