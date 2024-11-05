import java.util.Scanner;
public class Dia {
    public static void main(String[] args){
        int[][] array = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        Scanner myObj = new Scanner (System.in);
        System.out.print("Enter the element to find : ");
        int tar = myObj.nextInt();

        boolean found = false;
        int row = 0;
        int column = 0;
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[0].length; j++){
                if(array[i][j] == tar){
                    found = true;
                    row = i;
                    column = j;
                    break;
                }
            }
            if(found){
                System.out.println("Found in row " + row + " and column " + column);
                break;
            }

        }
        int[] newArr = new int[array.length * array[0].length];
        final int finCol = column;
        int value = 0;
            for(int j = 0; j < array[0].length; j++){
                if(array[j][finCol] == tar){
                    continue;
                } 
                newArr[value] = array[j][finCol];
                value++;
            }

        final int finRow = row;
        if(finCol == 0 || finCol == 2){
            for(int i = 1; i < array.length -1; i++){
                newArr[value] = array[finRow][i];
                value++;
            }            
        }
        else{
            for(int j = 0; j < array.length; j++){
                if(array[finRow][j] == tar){
                    continue;
                }
                newArr[value] = array[finRow][j];
                value++;
            }
        }
    

        for(int i = 0; i < value; i++){
            System.out.print(newArr[i] + "   ");
        }
        if(!found){
            System.out.print("Values not found");
        }
    }
}
