

class Shape{
    String color;
    public void area(){
        System.out.println("displays area");
    }
}
// Single Level
class Triangle extends Shape{
    public void area(int b,int h){
        System.out.println(1/2*b*h);
    }
}

//Multi Level
class EquilateralTriangle extends Triangle{
    public void area(int b){
        System.out.println(b*b);
    }
}

// Hierarchial Level
class Circle extends Shape{
    public void area(int b){
        System.out.println(3.14*b*b);
    }
}


public class Inheritance {
    public static void main(String[] args) {
        EquilateralTriangle t1=new EquilateralTriangle();
        t1.color="red";
        t1.area(2);
    }
}
