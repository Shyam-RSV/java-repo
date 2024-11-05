import java.util.Scanner;
public class Addition {
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
        int [][] c = new int[row][column];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column; j++){
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Added 2d array : ");
        //System.out.print("{ "); 
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column ; j++){
                System.out.print(c[i][j]);
                if(j < row - 1){
                    System.out.print(", " );

                }
            }
            System.out.println();
        }


        }
    }

