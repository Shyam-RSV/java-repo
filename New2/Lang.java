import java.lang.Math;
public class Lang{
    public static void main(String[] args){
        for(int i = 0; i < 10; i++){
            System.out.println((int) (Math.random() * 10 ));
            System.out.println((int) (Math.random() * (50 - 10)+10 ));
        }
    }
}