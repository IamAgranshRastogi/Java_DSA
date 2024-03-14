package ArrayList_ques;
import java.util.Scanner;
import java.util.ArrayList;

public class Swap2Num {
    public static void main(String[] args) {
        ArrayList<Integer> ls = new ArrayList<>();
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements u want in ArrayList: ");
        int n = s.nextInt();
        System.out.print("Enter elements: ");
        for(int i=0;i<n;i++)
        {  ls.add(s.nextInt()); 
        }
        System.out.println("ArrayList: "+ls);
        System.out.print("Enter two indices you want to swap: ");
        int i1 = s.nextInt();
        int i2 = s.nextInt();
        SwaptwoNum(ls,i1,i2);
        s.close();
    }
    public static void SwaptwoNum(ArrayList<Integer> ls,int i1,int i2) {
        int temp = ls.get(i1);
        ls.set(i1,ls.get(i2));
        ls.set(i2,temp);
        System.out.println("ArrayList after Swapping "+i1+" and "+i2+": "+ls);
    }
}
