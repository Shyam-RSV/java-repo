import java.util.*;
public class E16 {
     
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Enter a sentence: ");
            String[] s = sc.nextLine().split(" "); // Read the input and split by spaces
    
            // Print the split words
            System.out.println("You entered " + s.length + " words:");
            for (String word : s) {
                System.out.println(word);
            }
    
            sc.close();
        }
    }
     

