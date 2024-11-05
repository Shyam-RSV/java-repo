import java.time.LocalDate;
import java.time.LocalTime;
public class Date {
    public static void main(String[] args){
        LocalDate myObj = LocalDate.now();
        System.out.println(myObj);
        LocalTime myTime = LocalTime.now();
        System.out.println(myTime);

    }
}
