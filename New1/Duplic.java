import java.util.Scanner;
public class Duplic{
    public void duplicateString(String st){
        int[] charArray = new int[256];
        st = st.toLowerCase();
        for(int i = 0; i < st.length(); i++){
            charArray[st.charAt(i)]++;
        }
        for(int j = 0; j < charArray.length; j++){
            System.out.print(charArray[j] + " ");
            // if(charArray[j] > 1){
            //     System.out.println("Duplicate : " + (char) j + " " + charArray[j]);
            // }
        }
       
        
    }
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in); // Scanner Obj
        System.out.print("Enter a string : ");
        String myStr = myObj.nextLine();
        
        Duplic funcObj = new Duplic(); // Function Obj
        funcObj.duplicateString(myStr);

    }
}