import java.util.Scanner;
public class E13 {
    public static String reverseString(String st){
        String newStr = "";
        char ch;
        for(int i = st.length() - 1; i >= 0; i--){
            ch = st.charAt(i);
            newStr = newStr + ch;
        }
        return newStr.toLowerCase();
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String : ");
        String str = sc.nextLine();
        System.out.println(reverseString(str));

    }
}
