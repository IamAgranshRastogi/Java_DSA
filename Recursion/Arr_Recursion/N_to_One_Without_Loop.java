import java.util.Arrays;
import java.util.Scanner;
// TC: O(n)  SC:O(n)
public class N_to_One_Without_Loop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int x = s.nextInt();
        int[] res = printNos(x);
        System.out.println(Arrays.toString(res));
        s.close();
    }
    public static void RecurFunc(int x, int[] ar) {
        if (x == 0)  return;
        ar[ar.length-x] = x; 
        RecurFunc(x-1, ar);
    }
    public static int[] printNos(int x) {
        int[] arr = new int[x]; 
        RecurFunc(x, arr); 
        return arr; 
    }
}
