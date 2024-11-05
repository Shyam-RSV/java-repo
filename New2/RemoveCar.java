import java.util.Scanner;
import java.util.*;
class Car{
    int carId;
    String carName;
    String fuelType; 
    public Car(int carId, String carName, String fuelType){
        this.carId = carId;
        this.carName = carName;
        this.fuelType = fuelType;
    }

    public void setcarId(int carId){
        this.carId = carId;
    }
    public int getcarId(){
        return carId;
    }
    public void setcarName(String carName){
        this.carName = carName;
    }
    public String getcarName(){
        return carName;
    }
    public void setcarFuel(String fuelType){
        this.fuelType = fuelType;
    }
    public String getcarFuel(){
        return fuelType;
    }
    
}
public class RemoveCar {
    public static Car[] RemoveAndRearrange (int id, Car[] c){
        int n1 = c.length;
        List<Car> arr = new ArrayList<>();
        for(int i = 0; i < n1; i++){
            if(c[i].getcarId() != id){
                arr.add(c[i]);
            }
        }
        Car[] newC = arr.toArray(new Car[arr.size()]);
        if(newC.length > 0){
            return newC;
        }else{
            return null;
        }

    }
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter value for N : ");
        int n = sc.nextInt(); sc.nextLine();
        Car[] car = new Car[n];
        for(int i = 0; i < n; i ++){
            int a = sc.nextInt(); sc.nextLine();
            String b = sc.nextLine();
            String c = sc.nextLine();
            car[i] = new Car(a,b,c);
        }
        Car[] c1 = RemoveAndRearrange(102, car);
        if(c1 != null){
            for(int i = 0; i < c1.length; i++){
                System.out.println(c1[i].getcarId() + " : " + c1[i].getcarName());
            }
        }else{
            System.out.println("There are no car with given id");
        }
        sc.close();
    }
}
