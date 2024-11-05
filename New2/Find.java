import java.util.Scanner;
public class Find {
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
        if(!found){
            System.out.print("Values not found");
        }
    }
}
