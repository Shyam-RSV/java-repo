import java.util.Scanner;

public class E10 {
    public static int checkNumber(int num) {
        int count = 1;
        while (num / 10 != 0) {
            int last = num % 10;
            if ((last % 2) != 0) {
                count++;
            }
            num = num / 10;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers : ");
        int x = sc.nextInt();
        sc.nextLine();
        int n = checkNumber(x);
        if (n >= 3) {
            System.out.println("Accepted ");
        } else {
            System.out.println("Not Accepted ");
        }
    }
}