import java.util.Arrays;
// TC: O(n)   
public class One_to_N_Without_Loop {
    public static int[] printNos(int x) {
        if(x==0){
            return new int[0];
        }
        else{
            int res[] = printNos(x-1);
            int newAr[] = Arrays.copyOf(res, res.length+1);
            newAr[newAr.length-1] = x;
            return newAr; 
        }
    }
}