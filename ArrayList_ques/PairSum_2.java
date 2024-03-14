package ArrayList_ques;
// Find any pair in a Sorted & Rotated ArrayList has a target sum.
// list = [11,15, | 6,8,9,10]   target=16
import java.util.Scanner;
import java.util.ArrayList;
public class PairSum_2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> ls = new ArrayList<>();
        ls.add(11);
        ls.add(15);
        ls.add(6);
        ls.add(8);
        ls.add(9);
        ls.add(10);
        
        int tg = 16;
        System.out.println("Pair sum of two indices can be equal to target sum: "+ pairsum2(ls,tg));
        s.close();
    }    
    public static boolean pairsum2(ArrayList<Integer> ls, int tg){
        // Find Pivot(breaking) point where sorting order breaks
        int bp=-1;
        int n = ls.size();
        for(int i=0;i<n;i++){
            if(ls.get(i)>ls.get(i+1)){
                bp=i;
                break;
            }
        }
        int left = bp + 1;
        int right = bp;
        
        while(left!=right){
            // case1 
            if((ls.get(left)+ls.get(right)) == tg){
                System.out.println("Pairsum of "+left+" index and "+right+" index = target sum.");
                return true;
            }
            // case2
            if((ls.get(left)+ls.get(right))<tg){
               left = (left + 1) % n; // Modulo Arithmetic help in checking for rotated array
            }
            // case3
            else{
                right = (n + right - 1) % n;
            }
        }
        return false;
    }
}
