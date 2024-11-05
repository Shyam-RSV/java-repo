public class Transpose{
    public static void main(String[] args){
        int[][] mainArr = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        int[][] traArr = new int [mainArr.length][mainArr[0].length];
        for(int i = 0; i < mainArr.length; i++){
            for(int j = 0; j < mainArr[0].length; j++){
                traArr[j][i] = mainArr[i][j];
            }
        }
        for(int i = 0; i < mainArr.length; i++){
            for(int j = 0; j < mainArr[0].length ; j++){
                System.out.print(mainArr[i][j]);
                if(j < mainArr.length - 1){
                    System.out.print(", " );
                }
            }
            System.out.println();
        }
        System.out.println();

        for(int i = 0; i < mainArr.length; i++){
            for(int j = 0; j < mainArr[0].length ; j++){
                System.out.print(traArr[i][j]);
                if(j < mainArr.length - 1){
                    System.out.print(", " );
                }
            }
            System.out.println();
        }

    }
}