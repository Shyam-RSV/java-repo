abstract class newCar{
    public abstract void Sound();
    void main(){
        System.out.println("Boom Boom Boomer");
    }

}
class anoClass extends newCar{
    public void Sound(){
        System.out.println("Im unstoppable");
    }

}
public class Abstract{
    public static void main(String[] args){
        anoClass myObj = new anoClass();
        myObj.Sound();
        myObj.main();

    }
}