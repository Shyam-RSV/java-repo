import java.util.HashMap;
public class Haspmap {
    public static void main(String[] args){
       HashMap <Integer, String> myHash = new HashMap<Integer, String>();
       myHash.put(1, "Sathyashyam");
       myHash.put(2, "Ravindran");
       myHash.put(3, "Vigneshwar");

        // System.out.println(myHash);
        // System.out.print(myHash.get(1));
        // System.out.print(myHash.size());
        //myHash.remove(2);
        //myHash.clear();
        //System.out.print(myHash);
        for(String i : myHash.values()){
            System.out.println(i);
        }
        for(int i : myHash.keySet()){
            System.out.println(myHash.get(i));
        }

    }
}
