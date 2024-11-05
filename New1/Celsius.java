import java.util.Scanner;
public class Celsius{
    public static void main(String[] args){
        Scanner myObj = new Scanner (System.in);
        System.out.print("Enter Celsius : ");
        float userCel = myObj.nextFloat();
        // myObj.nextLine();

        float fahrenheit = (float) (1.8 * userCel) + 32;
        System.out.println("Fahrenheit is : "  + fahrenheit);
    }
}