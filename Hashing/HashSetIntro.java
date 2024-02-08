package Hashing;

/* Contains only Unique value and reduced time complexity.
 *
 *  Operations           |  Array  | Sorted Array | BinaryST | Binary ST  |
 *    (HashSet)                                    (height:h)  (n nodes)
 * Insert/Add -     O(1) |  O(1)   | O(N)         | O(h)     |  O(n)      |
 * Search/Contains- O(1) |  O(N)   | O(logN)      | O(h)     |  O(n)      | O(logN) [best case]
 * Delete/Remove-   O(1) |  O(N)   | O(N)         | O(h)     |  O(n)      | 
 * 
 */

import java.util.HashSet;
import java.util.LinkedHashSet;
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
    
    // Search-Contains
    if(set.contains(1))   
    { System.out.println("set contains 1");
    }
    if(!set.contains(6))
    { System.out.println("does not contain 6"); 
    }
    
    //Delete 
    set.remove(1);
    { if(!set.contains(1))
      { System.out.println("Does not contain 1 as we deleted it.");
      }
    }

    //Size of Set
    System.out.println("Size:"+set.size());
    

    // Iteration through elements:
    for(int i:set)
    { System.out.println(i);
    }

    // Removing all elements
    set.clear();
  
    // Checking if set is empty
    if(set.isEmpty())
    { System.out.println("Empty set");
    }

    // No Order in HashSet 
    // For Ordered HashSet ==>  use 'LinkedHashSet'
    LinkedHashSet<String> set2=new LinkedHashSet<>();
    set2.add("Used");
    set2.add("To Maintain");
    set2.add("Insertion");
    set2.add("Order");

  }  
}
