import java.util.Scanner;
public class Shyam{
    public static void main(String[] args){
        // Scanner myObj = new Scanner (System.in);
        // System.out.println("Enter a number to find fibonacci");
        // int userNum = myObj.nextInt();
        // int result = summer(userNum);
        // System.out.println(result);

        Scanner myObj = new Scanner (System.in);
        System.out.print("Enter the number of elements in array : ");
        int n = myObj.nextInt();
        myObj.nextLine();
        String[] myArr = new String[n];

        for( int i = 0; i < n ; i++){
            System.out.print("Enter name " + (i+1) + " to fill array : " );
            myArr[i] = myObj.nextLine();
            System.out.println(" ");
        }
        readArr(myArr, n);


    }
    static void readArr(String myAr[], int arrSize){
        for(int i = 0; i < arrSize; i++){
            System.out.println(myAr[i]);
        }
    }

    // static int summer(int num){ //Function
    //     if(num <= 0){
    //         return 0; 
    //     }
    //     return num + summer(num - 1);
    // }
}