import java.util.*;
public class Oop{
    final String fname = "Sathyashyam"; // atributes
    final String lname = "Ravichandran";

    public void objMethod(){ // method
        System.out.println("Hello from class methods");
    }

    String clName;
    int clAge;
    public Oop(String name, int age){ // constructor
        clName = name;
        clAge = age;
    }

    private int salary;

    public void setSalary(int sal){ // Encapsulation
        salary = sal;
    }
    public int getSalary(){
        return salary;
    }
    

    public static void main(String[] args){ // main method
         //Second myObj1 = new Second(); // creation of obj
         //Oop myObj3 = new Oop();
         //Second myObj2 = new Second();

         //System.out.println("Your name is : " + myObj3.fname + " " + myObj3.lname);
         //System.out.println("Your age is : " + myObj1.age);
         //myObj3.y = 40;
         //System.out.println(myObj1.age);
         //System.out.println(myObj2.x);

         //myObj3.objMethod(); // call class method
         //myObj1.newMethod();

        //  myObj1.car("BMw M5 CS");
        //  myObj1.speed(100);
        //Second myObj1 = new Second(10);
        //System.out.println(myObj1.x);
        Oop myObj1 = new Oop("Sathyashyam " , 21);
        System.out.println(myObj1.clName + myObj1.clAge);
        myObj1.setSalary(1000);
        System.out.println(myObj1.getSalary());

    }
}
class Second{ // new class
    // int x;
    // public Second(int y){
    //     x = y;
    // }
    // int age = 21; // class attributes
    // static void newMethod(){
    //     System.out.println("This is from Second method");
    // }

    // public void car(String myCar){
    //     System.out.println("Your Favorite car is " + myCar );
    // }

    // public void speed(int mySpeed){
    //     switch(mySpeed){
    //         case 100:
    //         System.out.println("You are going at full speed");
    //         break;
    //         case 50:
    //         System.out.println("You are going at half speed");
    //         break;
    //         case 0:
    //         System.out.println("You are going at zero speed");
    //         break;
    //         default:
    //         System.out.println("Get a driving licence");
    //         break;
    //     }
    //}
    
}