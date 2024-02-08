class Pen{
    String color;
    String type; 

    public void write(){
        System.out.println("write something");
    }

    public void printColor(){
        System.out.println(this.color);
    }
}

class Student{
    String name;
    int age;

    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    
    // ****Non-Parameterised Constructor
    // Student(){
    //     System.out.println("constructor called");
    // }


    // ****Parameterised Constructor
    // Student(String name, int age){
    //     this.age=age;
    //     this.name=name;  
    // }


    // ****Copy Constructor 
    Student(Student s2){
        this.name=s2.name;
        this.age=s2.age;
    }
    
    Student(){

    }
}


public class OOPS {
    public static void main(String[] args) {
      /*Pen pen1=new Pen();
        pen1.color="blue";
        pen1.type="gel";
        pen1.write();
        
        Pen pen2=new Pen();
        pen2.color="black";
        pen2.type="ballpoint";

        pen1.printColor();
        pen2.printColor();
        */

        // ****For parameterised Constructor
        // Student s1=new Student("Harish",20);
        // s1.printInfo();

        // ****For Non-Parameterised Constructor
        // Student s1=new Student();
        // s1.name="Ashu";
        // s1.age=22;
        // s1.printInfo();

        // ****For Copy Constructor
        Student s1=new Student();
        s1.name="Henry";
        s1.age=23;

        Student s2=new Student(s1);
        s2.printInfo();
    }
}
