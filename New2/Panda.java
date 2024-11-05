import java.util.*;
public class Panda{
    public static void main(String[] args){
        //int randomNum = (int) (Math.random() * 50);

        Scanner Arr = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int arrSize = Arr.nextInt();
        int[] arrInt = new int[arrSize];

        for(int i = 0; i<arrSize; i++){
            System.out.print("Enter " + (i+1) + " Number to array : " ); 
            arrInt[i] = Arr.nextInt();
        }
        printing(arrInt, arrSize);

    }
    static void printing(int Array[], int numSize){
        for(int i = 0; i < numSize; i++){
            System.out.println(Array[i]);
        }

    }
}