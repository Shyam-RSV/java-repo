import java.util.Scanner;
public class Sic{
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter principal ammount : ");
        int pAmt = myObj.nextInt();

        System.out.print("Enter interest rate : ");
        int intRate = myObj.nextInt();

        System.out.print("Enter Tenure in Years : ");
        int tenYrs = myObj.nextInt();

        int res = simpleInterestCalc(pAmt, intRate, tenYrs);
        int inteEarned = pAmt + res;

        System.out.println("Interest Earned : " + res);
        System.out.print("Total Value: " + inteEarned);

    }

    static int simpleInterestCalc(int amt, int inte, int yrs){
        int result = (amt * inte * yrs)/100;
        return result;
    }
}
