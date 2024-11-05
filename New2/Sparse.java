public class Sparse{
    public static void main(String[] args){
        int row = 5;
        int column = 4;
        int[][] mainArray = new int[row][column];
        mainArray = new int[][] {
            {0, 0, 0, 1},
            {0, 2, 0, 0},
            {0, 0, 5, 0},
            {0, 1, 0, 0},
            {7, 0, 0, 0}
        };
        int[] newArr = new int[32];
        int[] ii = new int[32];
        int[] jj = new int[32];
        int value = 0;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < column ; j++){
                if(mainArray[i][j] != 0){
                    newArr[value] = mainArray[i][j];
                    ii[value] = i;
                    jj[value] = j;
                    value++;
                }
            }
        }

        for(int i = 0; i < value; i++){
            System.out.println("Row       Column       Value");
            System.out.println(ii[i] + "         " + jj[i] + "            " + newArr[i]);
        }



    }
}