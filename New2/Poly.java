class Car{
    public void newCar(){
        System.out.println("Car Sound : ");
    }
}

class Bmw extends Car{
    public void newCar(){
        System.out.println("Ratatatata");
    }

}
class Mustang extends Car{
    public void newCar(){
        System.out.println("Tututututu");
    }
}

// *********** Inner Class ************** //

class outerClass{
    int x = 10;
    class innerClass{
        int y = 20;
    }
}
public class Poly{
    public static void main(String[] args){
        Car carObj = new Car(); //Car obj
        Car bmwObj = new Bmw(); // bmw obj
        Car mustangObj = new Mustang(); // mustang object
        carObj.newCar();
        bmwObj.newCar();
        mustangObj.newCar();

        // *********** Inner Class
        outerClass outerObj = new outerClass();
        outerClass.innerClass innerObj = outerObj.new innerClass();

        System.out.println(outerObj.x + innerObj.y);
        
    }
    
}