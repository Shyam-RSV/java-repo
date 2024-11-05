public class Object{
    static void newMethod(String s){
        System.out.println("My name is " + s);
    }
    static String fName, sName;
    static void insertin(String f, String S){
        fName = f;
        sName = S;
    }
    static void display(){
        System.out.println("This is RSV squad " + fName + " , " + sName);
    }

    // public Object(String s, int age, String work){ // constructor
    //     System.out.println("Im " + s + " age " + age + " works in " + work);

    // }
    void newAdd(int a, int b){
        System.out.println("Addition " + (a+b));

    }
   
    String myStr = "Boomer"; //Attributr of class
    public static void main(String[] args){
        //Object myObj = new Object(); // Creating object from class
        //Object myObj = new Object("Sathyashyam", 21, "TCS");
        new Object().newAdd(10, 20);



        // Noobie myNoob = new Noobie();
        // //System.out.println(myObj.myStr);
        // //System.out.print(myNoob.integer);
        // Object o1 = new Object();
        // Object o2 = new Object();
        // Object o3 = new Object();

        // o1.insertin("Sathyashyam", "Ravindran");
        // o1.display();
        // o2.insertin("Vigneshwar", "Thomas");
        // o2.display();
        // o3.insertin("Sathyashyam", "Vigneshwar");
        // o3.display();

    }
}
class Noobie{
    int integer = 5;
    static void newMethod1(String s){
        System.out.println(s + " is gay");
    }
}