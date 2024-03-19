public class IsSorted_Rotated {
    public static void main(String args[]) {
        int arr[] = {1, 2, 3, 4, 5}; 
        int n = 5;
        System.out.println(isSorted(arr, n));
      }
    

    // Brute Force Approach
    // TC: O(n^2)     SC: O(1)
    public static boolean isSorted(int arr[], int n) { 
      for (int i = 0; i < n; i++) {
        for (int j = i + 1; j < n; j++) {
          if (arr[j] < arr[i])
            return false;
        }
      }
      return true;
    }

    // Optimal Approach 
    // TC: O(n)   SC: O(1)
    public static boolean isSorted2(int arr[], int n) {
        for (int i = 1; i < n; i++) {
          if (arr[i] < arr[i - 1])
            return false;
        }
        return true; 
    }
}
