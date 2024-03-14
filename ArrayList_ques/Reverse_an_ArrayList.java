package ArrayList_ques;

import java.util.ArrayList;
import java.util.Scanner;

public class Reverse_an_ArrayList {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> ls = new ArrayList<>();
        System.out.print("Enter the no. of ArrayList elements you want: ");
        int n = s.nextInt();
        for(int i=0;i<n;i++)
        { ls.add(i);
        }

        // Reverse print - O(n)
        for(int i=ls.size()-1;i>=0;i--){
            System.out.print(ls.get(i)+" ");
        }
        s.close();   
    }    
}
