import java.util.Scanner;

public class E1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number for row : ");
        int row = sc.nextInt();
        System.out.println("enter a number for col : ");
        int col = sc.nextInt();
        int[][] a = new int[row][col];
        //loop for inserting the element
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.println("elements of the matrix [" + i + "][" + j + "]");
                a[i][j] = sc.nextInt();
            }
        }
        // loop for adding rowwise numbers
        System.out.println("ROW-WISE");
        int rowsum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                rowsum += a[i][j];
            }
            System.out.println("sum of row" + (i + 1) + ": " + rowsum);
            rowsum = 0;
        }
        // System.out.println("sum of row" + rowsum);
        int colsum = 0;
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                colsum += a[j][i];
            }
            System.out.println("sum of col" + (i + 1) + " : " + colsum);
            colsum = 0;
        }
        
        int totalsum = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                totalsum += a[i][j];

            }
        }
        System.out.println("total sum is " + totalsum);
    }
}