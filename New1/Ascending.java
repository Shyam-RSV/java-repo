import java.util.Arrays;
public class Ascending {
    public static int[] AscendingOrder(int[] asc){
        int size1 = asc.length;
        //int[] z = new int[size1];
        //int value = 0;
        for(int i = 0; i < size1 - 1; i++){
            for(int j = 0; j < size1 - 1; j++){
                if(asc[j] > asc[j+1]){
                    int temp = asc[j];
                    asc[j] = asc[j+1];
                    asc[j+1] = temp;
                }
            }
        }
        return asc;
        // return asc[asc.length - 2]; //Second largest number
    } 
    public static void main(String[] args){
        int[] a = {1,4,2,6,7};
        int size2 = a.length;
        //System.out.print(AscendingOrder(a));
        int[] result = Arrays.copyOf(AscendingOrder(a), size2);
        System.out.print(result[0]);
        System.out.print(result[1]);
        System.out.print(result[2]);
        System.out.print(result[3]);
        System.out.print(result[4]);
    

    }
}
