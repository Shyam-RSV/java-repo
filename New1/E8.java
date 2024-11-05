import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            int[] a = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = scanner.nextInt();
            }
            int total = 0;
            for(int i = 0; i < n; i++){
                total = total + a[i];
            }
            
            for(int i = 0; i < n; i++){
                a[i] = a[i] - y;
            }
            
            int totalAfter = 0;
            for(int i = 0; i < n; i++){
                totalAfter = totalAfter + a[i];
            }
            int totalAfter1 = totalAfter + x;
            
            if(total > totalAfter1 ){
                System.out.println("COUPON");
            }else{
                System.out.println("NO COUPON");
            }
            
            // Your code goes here
        }
        scanner.close();
    }
}
