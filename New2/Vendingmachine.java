import java.util.*;

public class Vendingmachine {
    static Scanner vending = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the juice name : ");
        String juice = vending.nextLine();
        //vending.next();
        System.out.print("Enter the number of quantity : ");
        int quantity = vending.nextInt();
        System.out.print("Cash given : ");
        int customerpay = vending.nextInt();

        int amount = 0;
        int result = 0;

        if (juice.equalsIgnoreCase("Orange")) {
            amount = 150 * quantity;
        } else if (juice.equalsIgnoreCase("Pineapple")) {
            amount = 350 * quantity;
        } else if (juice.equalsIgnoreCase("Pomegranate")) {
            amount = 250 * quantity;
        } else if (juice.equalsIgnoreCase("Mango")) {
            amount = 150 * quantity;
        } else {
            System.out.println("Invalid juice name");
        }

        result = customerpay - amount;
        
        if (result > 0) {
            System.out.println("Here is your balance : " + result);
            System.out.println("Thanks for ordering : " + juice);
        } else if (result == 0) {
            System.out.println("Thanks for ordering  " + juice );
        } else {
            System.out.println("Given less amount");
        }
        vending.close();
    }
}
