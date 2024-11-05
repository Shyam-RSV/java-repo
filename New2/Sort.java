import java.util.Arrays;
public class Sort {
    public static void main(String[] args){
        int[] newArr = {1, 4, 21, 40, 2, 19, 55, 100, 33, 60};
        Arrays.sort(newArr);
        //System.out.print(Arrays.toString(newArr));
        for(int i = newArr.length - 1; i >= 0; i--){
            System.out.print(newArr[i] + " ");
            }
        }
    }

