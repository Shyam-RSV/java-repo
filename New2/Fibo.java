import java.util.Scanner;
public class Fibo {
    public static void main(String[] args) {
        Scanner myObj = new Scanner (System.in); 
        System.out.print("Enter a number : ");

        int nums = myObj.nextInt();
        int x = 0 , y = 1;
        int[] fibArr = new int[32]; 
        fibArr[0] = x;
        fibArr[1] = y;
        for(int i = 2; i <= nums; i++){ // 0, 1, 1, 2, 3, 5, 8, 13, 21
            int next = x+y;
            x = y;
            y = next;
            fibArr[i] = next;
        }

        //int res = 0;
        int[] newFib = new int[32];

        for(int k = 0; k <= nums; k = k+2){
            newFib[k] = fibArr[k];
        }

        for(int j = 0; j <= nums; j++){
            System.out.print(fibArr[j] + " ");
        }
        

    }
}
