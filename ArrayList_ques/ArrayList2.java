package ArrayList_ques;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList2 {
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
        System.out.print(ls);
        s.close();
    }
}
