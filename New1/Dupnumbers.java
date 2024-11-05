import java.util.Arrays;
public class Dupnumbers {
    public static int[] DuplicateRemover(int[] a){
        int n = a.length;
        if(n < 2){
            return a;
        }
        Arrays.sort(a);
        int index = 1;
        for(int i = 1; i < n; i++){
            if(a[i] != a[i-1]){
                a[index] = a[i];
                index++;
            }
        }
        int[] uniqueArray = Arrays.copyOf(a, index);

        return uniqueArray;
    }
    public static void main(String[] args){
        int[] myArray = {1,1,3,5,2,6,8,4,2,5};
        System.out.println(Arrays.toString(DuplicateRemover(myArray)));

    }

}
