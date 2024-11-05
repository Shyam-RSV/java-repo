import java.util.Scanner;
public class Frequency {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter number of row : ");
        int row = myObj.nextInt();
        System.out.print("Enter number of column : ");
        int column = myObj.nextInt();
        int[][] a = new int[row][column];
        int[][] b = new int[row][column];

        System.out.println("2d array : A");

        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print("Enter number for row " + (i+1) + " and column " + (j+1) + " : ");
                a[i][j] = myObj.nextInt();
            }
        }
        System.out.println("2d array : B");
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                System.out.print("Enter number for row " + (i+1) + " and column " + (j+1) + " : ");
                b[i][j] = myObj.nextInt();
            }
        }
        int total = row * column;
        int evenA = 0;
        //int [][] c = new int[row][column];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if(a[i][j] % 2 == 0) {
                    evenA++;
                }
            }
        }
        int oddA = total - evenA;

        int evenB = 0;
        //int [][] c = new int[row][column];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                if(b[i][j] % 2 == 0) {
                    evenB++;
                }
            }
        }
        int oddB = total - evenB;

        System.out.println("2d Array A - Even : " + evenA + " and odd : " + oddA);
        System.out.println("2d Array B - Even : " + evenB + " and odd : " + oddB);
        if(evenA > evenB){
            System.out.println("2d array A have more even numbers");
        }else{
            System.out.println("2d array B have more even numbers");

        }

        if(oddA > oddB){
            System.out.println("2d array A have more odd numbers");
        }else{
            System.out.println("2d array B have more odd numbers");

        }

    }
}

