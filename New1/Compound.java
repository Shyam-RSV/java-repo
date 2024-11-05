import java.util.Scanner;
public class Compound{
    public static float CompoundCalc(float prin, float roi, float Tyear){
        int n = 12;
        float conRoi = roi/100;
        float rn = conRoi/n;
        //float Lastresult = (1+rn);
        //float finalResult = prin * Lastresult;
        float val = n*Tyear;
        float finalResult = prin * (float) Math.pow((1 + rn), val);
        return finalResult;

    }
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter Principal Ammount : ");
        float prinAmt = myScan.nextFloat();
        System.out.print("Enter rate of Interest in Percentage : ");
        float rateOfInt = myScan.nextFloat();
        System.out.print("Enter Tunure in Years : ");
        float year = myScan.nextFloat();

        float compResult = CompoundCalc(prinAmt,rateOfInt, year);
        System.out.println(compResult);

    }
}