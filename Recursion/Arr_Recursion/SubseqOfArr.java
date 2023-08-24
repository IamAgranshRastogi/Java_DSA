import java.util.ArrayList;

public class SubseqOfArr 
{   public static void main(String[] args) 
    {
        int arr[] = new int[]{3, 1, 2};
        ArrayList<Integer> sub = new ArrayList<>();
        generateSubsequences(0, arr, sub);
    }

    public static void generateSubsequences(int i, int[] a, ArrayList<Integer> sub) 
    {   if (i == a.length) 
        { System.out.println(sub);
            return;
        }

        // Include the current element in the subsequence
        sub.add(a[i]);
        generateSubsequences(i + 1, a, sub);

        // Exclude the current element from the subsequence
        sub.remove(sub.size() - 1);
        generateSubsequences(i + 1, a, sub);
    }
}
