package ArrayList_ques;
import java.util.ArrayList;
import java.util.Scanner;

public class Container_Max_Water_level {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> ht = new ArrayList<>();
        System.out.println("Enter the number of heights in ArrayList: ");
        int n = s.nextInt();
        System.out.println("Enter heights in ArrayList: ");
        for(int i=0;i<n;i++){
            int heights = s.nextInt();
            ht.add(heights);
        }
        System.out.println("Heights ArrayList: ");
        // Brute Force Approach : O(i*j) = O(n^2)  
        // StoreWater(ht);

        // Two Pointer Approach : O(n)
        StoreWater2(ht);
        s.close();
    }

    public static void StoreWater(ArrayList<Integer> ht){
        int st = 0;
        int end = 0;
        int water = 0;
        for(int i=0;i<ht.size();i++){
            for(int j=i+1;j<ht.size();j++){
                int height = Math.min(ht.get(i),ht.get(j));
                int width = (j-i);
                if((height * width)>water){
                  water = height * width;
                  st = i;
                  end = j;  
                }
            }
        }
        System.out.println("The container with Max water: "+water+" have both ends as : ");
        System.out.println("Start Index : "+st);
        System.out.println("End Index : "+end);
    }   

    public static void StoreWater2(ArrayList<Integer> ht){
        // Two Pointers
        int left = 0;
        int right = ht.size() - 1;
        
        int water = 0;
        int start = 0;
        int end = 0; 
        while(left < right){
            int height = Math.min(ht.get(left),ht.get(right));
            int width = right-left;
            water = Math.max(water,height * width);
            if(ht.get(left)<ht.get(right)){
                left++;
            }
            else{
                right--;
            }
            start = Math.max(start,left);
            end = Math.max(end,right); 
        }
        System.out.println("The container with Max water: "+water+" have both ends as : ");
        System.out.println("Start Index : "+start);
        System.out.println("End Index : "+end);
    }
}
