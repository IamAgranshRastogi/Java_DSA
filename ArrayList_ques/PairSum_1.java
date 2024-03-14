package ArrayList_ques;

import java.util.Scanner;
import java.util.ArrayList;
// Find if any pair in a Sorted ArrayList has a target sum. 
// List=[1,2,3,4,5,6]   target =5 
public class PairSum_1 {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        Scanner s = new Scanner(System.in);
        System.out.print("Enter target sum: ");
        int tg = s.nextInt();
        // Brute Force Approach : O(n^2)
        // System.out.println(pairsum1(ls,tg));
        
        // Two Pointer Approach : O(n)
        System.out.println(pairsum2(ls,tg));
        s.close();
    }

    public static boolean pairsum1(ArrayList<Integer> ls, int target){
       for(int i=0;i<ls.size();i++){
        for(int j=i+1;j<ls.size();j++){
           if(ls.get(i)+ls.get(j)==target){
            System.out.println("Start index of pair: "+i);
            System.out.println("End index of pair: "+j);
            return true;
           }
        }
       } 
       return false;
    }

    public static boolean pairsum2(ArrayList<Integer> ls,int tg){
        int i = 0;
        int j = ls.size()-1;
        while(i<j){
            if(ls.get(i)+ls.get(j)==tg){
                System.out.println("Start Index: "+i+" end Index: "+j);
                return true;
            }
            if(ls.get(i)+ls.get(j)<tg){
                i++;
            }
            else{
                j--;
            }
        }    
        return false;
    }
}
