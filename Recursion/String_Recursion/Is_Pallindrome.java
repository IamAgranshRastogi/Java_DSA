package String_Recursion;

public class Is_Pallindrome 
{   public static boolean IsPallin(int i,String s)
    { if(i>=s.length()/2) 
        return true;
      if(s.charAt(i) != s.charAt(s.length()-i-1))
        return false;
      return IsPallin(i+1,s);
    }
    public static void main(String[] args) 
    { String str1="MADESeDAM";
      String str2="MALAYALAM";
      System.out.print("MADESeDAM is a pallindrome : " + IsPallin(0,str1)); 
      System.out.print("\nz MALAYALAM is a pallindrome : " + IsPallin(0,str2));
    }
}
