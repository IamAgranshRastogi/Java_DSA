package String;

// Lexicographically Largest: and anger ant dog "duck" ...

public class Lxcogrphc_Largest {
    public static void main(String[] args) {
        String fruits[]={"apple","mango","banana","guava"};
        String largest=fruits[0];

        for(int i=0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
               largest=fruits[i];
            }
        }
        System.out.println(largest);
    }
}
