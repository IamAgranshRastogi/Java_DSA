package String_practice;
// Interning: More than 1 reference variables("str1,str2") can point to same value("Kohli") stored in heap memory.

// (str3) new keyword creates a new object and then point to it.

public class Str_Cmpar {
    public static void main(String[] args) {
        String s1="Kohli";
        String s2="Kohli";
        if(s1==s2){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        String s3=new String("Kohli");
        if(s1==s3){
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }

        if(s1.equals(s3)){   
            System.out.println("Strings are equal");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
    
}

//  == checks if the variables are same at object level
// while equals() checks for the values
