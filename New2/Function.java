// import java.util.Random;
// public class Function {
//     public int RandomFunction (int a){ // Function in java
//         Random rand = new Random();
//         int result = rand.nextInt(a);
//         return result;

//     }
//     public static void main(String[] args){
//         Function myObj = new Function(); //RandomFunction is not static
//         System.out.print(myObj.RandomFunction(10));
//     }
// }

// public class Function{
//     public static String arrayFunction(String[] a){
//         String x = a[0];
//         return x;
//     }
//     public static void main(String[] args){
//         //int[] newArray = new int[10];
//         String[] newArray =  {"Bot", "Panda", "Ravi"};
//         System.out.println(arrayFunction(newArray));

//         }
// }

public class Function{
    public static void ArrayPrinter(int[][][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[1].length; j++) {
                for(int k = 0; k < array[0][1].length; k++){
                    System.out.print(array[i][j][k] );
                if(k < array[0][1].length - 1){
                    System.out.print(", ");
                }
                }
                System.out.println();
            }
            System.out.println(); // Move to the next line after each row
        }
    }
    public static void main(String[] args){
        int[][][] Arr2d = new int[2][3][3];
        Arr2d = new int[][][]{
            {
                {1,2,3},
                {1,2,3},
                {1,2,3}
            },
            {
                {1,2,3},
                {1,2,3},
                {1,2,3}
            }
        };
        ArrayPrinter(Arr2d);
    }
}