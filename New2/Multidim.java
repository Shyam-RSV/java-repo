import java.util.Scanner;
public class Multidim{
    public static void main(String[] args){
        Scanner myObj = new Scanner (System.in);

        int[][] myArr = new int[3][4];
        /*int [][]*/ myArr = new int[][]{
            {1,1,1},
            {1,1,1},
            {1,1,1},
            {1,1,1}
        };
        // int result = 0; // add elements in 2d arr
        // for(int i = 0; i <= 2; i++ ){
        //     for(int j = 0; j <=2 ; j++){
        //         result += myArr[i][j];
        //     }
        // }
        // System.out.println(result);

       int row = myArr.length;
       System.out.println(row + " - Row");

       int column = myArr[2].length;
       System.out.print(column + " - Col");
        
        
        // for(int i = 0; i <= 2; i++ ){ // insert value to 2d array
        //     for(int j = 0; j <=2 ; j++){
        //         System.out.print("Enter value for " + (i+1) + " row and "
        //         + (j+1) + " column : " );
        //         myArr[i][j] = myObj.nextInt();
        //     }
        // }

        // for(int i = 0; i <= 2; i++ ){ // Display
        //     for(int j = 0; j <=2 ; j++){
        //         System.out.print(myArr[i][j]);
        //     }
        // }
        
        }
    }