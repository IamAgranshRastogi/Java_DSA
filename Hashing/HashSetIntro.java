package Hashing;


// Why HashSet ?

/* Contains only Unique value and reduced time complexity.

 *  Operations           |  Array  | Sorted Array | BinaryST | Binary ST  |
 *    (HashSet)                                    (height:h)  (n nodes)
 * Insert/Add - O(1)     |  O(1)   | O(N)         | O(h)     |  O(n)      |
 * Search/Contains- O(1) |  O(N)   | O(logN)      | O(h)     |  O(n)      | O(logN) [best case]
 * Delete/Remove-  O(1)  |  O(N)   | O(N)         | O(h)     |  O(n)      | 
 * 
 */

import java.util.HashSet;
public class HashSetIntro
{ 
public static void main(String[] args) 
  { // Creating
    HashSet<Integer> set=new HashSet<>();
    
    // Insert
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(1); // won't be added cause set contains only Unique values.
    
    // Search/Contains
    if(set.contains(1))   
    { System.out.println("set contains 1");
    }
    if(!set.contains(6))
    { System.out.println("does not contain 6"); 
    }
    
  }  
}
