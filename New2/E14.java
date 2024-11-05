import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class E14 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);

        list2.add(5);
        list2.add(6);
        list2.add(7);
        list2.add(8);

        for(int i = 0; i < list2.size(); i++){
            list1.add(list2.get(i));
        }
        for(int i = 0; i < list1.size(); i++){
            System.out.println(list1.get(i));
        }

    }
}
