package ArrayList_ques.MultiDimArrList;

import java.util.ArrayList;

public class MultiD_ArLs1 {
    public static void main(String[] args) {
       ArrayList<ArrayList<Integer>> mls = new ArrayList<>();
       
       ArrayList<Integer> ls = new ArrayList<>();
       ls.add(1);
       ls.add(2);
       ls.add(3);
       ls.add(4);
       mls.add(ls);
       
       ArrayList<Integer> ls2 = new ArrayList<>();
       ls2.add(5);
       ls2.add(6);
       ls2.add(7);
       ls2.add(8); 
       mls.add(ls2); 

       for(int i=0;i<mls.size();i++){
         ArrayList<Integer> curr = mls.get(i);
         for(int j=0;j<curr.size();j++){
           System.out.print(curr.get(j)+" ");
         }
         System.out.println();
       }
       System.out.println(mls);
    }
}
