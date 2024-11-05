public class E11 {
    public static void main(String[] args){
        String str = "123";
        //int x = Integer.parseInt(str);
        //System.out.println(x + 123);
        for (int i = 0 ; i < 3 ; i++){
            int x = ((str.charAt(i) - '0')+ 10);
            //int x = str.charAt(i);
            //System.out.println(x);
        }
        System.out.println(2%10);
    }
}
