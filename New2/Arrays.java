import java.util.Random;
//import java.lang.Math;
public class Arrays{
    public static void main(String[] args){
        Random rand = new Random();
        int [][][] array3d = new int[2][3][4];

        for(int i = 0; i < array3d.length; i++){
            for(int j = 0; j < array3d[0].length; j++){
                for(int k = 0; k < array3d[0][1].length; k++){
                    array3d[i][j][k] = rand.nextInt(10);
                    }
                    //System.out.println();
                }
                //System.out.println();
            }

            for(int i = 0; i < array3d.length; i++){
                for(int j = 0; j < array3d[0].length; j++){
                    for(int k = 0; k < array3d[0][1].length; k++){
                        System.out.print(array3d[i][j][k]);
                        if(k < array3d[i][j].length - 1){
                            System.out.print(", ");
                        }
                        }
                        System.out.println();
                    }
                    System.out.println();
                }
        }


    }


