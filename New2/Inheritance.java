import java.util.Scanner;
abstract class Nokia{
    public abstract void cameraQ(); // Abstract method, no body
}
class OuterClass{
    int x = 5;
    class InnerClass{
        int y = 10;
    }
}
class Poco extends Nokia {
    public void cameraQ(){
        System.out.println("Samsung Camera 200MP");
    }
    protected String mobiName = "The Poco x6 5g";
    public void MobMethod(){
        System.out.println("600rs battery");
    }
}

class Foldable{
    public void MobMethod(){
        System.out.println("2000rs Battery");
    }

}

public class Inheritance extends Poco{ // Inheritance
    public static void main(String[] args){
        // Inheritance myObj = new Inheritance();
        // System.out.println(myObj.mobiName);
        // myObj.MobMethod();
        Poco myPoco = new Poco();
        // Foldable myFoldable = new Foldable();
        // myPoco.MobMethod();
        // myFoldable.MobMethod();

        OuterClass myOuter = new OuterClass(); // Inner class
        OuterClass.InnerClass myInner = myOuter.new InnerClass();
        System.out.println(myOuter.x + myInner.y);
        myPoco.MobMethod();
        myPoco.cameraQ();


    }
}

