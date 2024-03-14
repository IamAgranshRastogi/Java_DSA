package ArrayList_ques.MultiDimArrList;

import java.util.ArrayList;
public class MultiD_ArLs2 {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mls = new ArrayList<>();
        ArrayList<Integer> ls1 = new ArrayList<>();
        ArrayList<Integer> ls2 = new ArrayList<>();
        ArrayList<Integer> ls3 = new ArrayList<>();
        
        for(int i=1;i<=5;i++){
            ls1.add(i*1);
            ls2.add(i*2);
            ls3.add(i*3);
        }

        mls.add(ls1);
        mls.add(ls2);
        mls.add(ls3);
        ls2.remove(3);
        ls2.remove(2);
        System.out.println("MultiDimensional ArrayList: ");
        System.out.print(mls);

        // nested loops
        for(int i=0;i<mls.size();i++){
            ArrayList<Integer> curr = mls.get(i);
            for(int j=0;j<curr.size();j++){
                System.out.print(curr.get(j)+" ");
            }
            System.out.println();
        }
    }
}
