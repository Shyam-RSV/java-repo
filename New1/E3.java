import java.util.ArrayList;
import java.lang.Math;
public class E3 {
    public static int maxArea(int[] height) {
        ArrayList<Integer> result = new ArrayList<>();
        int size = height.length;
        for(int i = 0; i < size; i++){
            if(height[i] >= 7){
                result.add(height[i]);
            }
        }
        int[] n1 = new int[result.size()];
        for(int i = 0; i < result.size(); i++){
            n1[i] = result.get(i);
        }
        int val = 0 ;
        int width = (size - 2);
        int hei = Math.min(n1[0], n1[2]);
        int area = width * hei;
        System.out.println("Height : " + hei);
        System.out.println("Width : " + width);

        return area;
        
    }
    public static void main(String[] args){
        int[] height = {1,8,6,2,5,4,8,3,7};
        int value = maxArea(height);
        
        System.out.println(value);
    }
}