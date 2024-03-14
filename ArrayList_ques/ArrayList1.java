package ArrayList_ques;
import java.util.ArrayList;
public class ArrayList1{
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>(); 
        // Add Operation : O(1)
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(4,9); //O(n) 
        
        // Get Operation : O(1)
        int ele1 = ls.get(2); //3
        int ele2 = ls.get(0); //1 
        System.out.println("Ele at 0: "+ele2+", ele at 2: "+ele1);
        
        // Delete Operation : O(n) as it searches first then deletes
        ls.remove(2); // 3 deleted 
        System.out.println(ls);

        // Set Element at Index : O(n)
        ls.set(2,10);
        System.out.println(ls);

        // Contains Element at Index : O(n)
        System.out.println(ls.contains(2)); // checks whether 2 is present or not 
        System.out.println(ls.contains(10));

        // Size ()
        System.out.println(ls.size()); 

        // Printing arraylist
        for(int i=0;i<ls.size();i++){
            System.out.print(ls.get(i)+" ");
        }
    }
}
