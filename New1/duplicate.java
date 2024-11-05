//7package array_;

import java.util.*;

public class duplicate {
    public static void main(String[] args) {
        Scanner arr = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = arr.nextInt();
        int[] a = new int[size];

        // Loop for inserting elements into the array
        for (int i = 0; i < a.length; i++) {
            System.out.println("Enter the number a[" + i + "]");
            a[i] = arr.nextInt();
        }

        // Remove duplicates from the array
        int[] newArray = rsv(a);

        // Print the unique elements
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + " ");
        }

    }

    // Method to remove duplicates from the array
    public static int[] rsv(int[] a) {
        int size = a.length;
        int[] temp = new int[size];
        int j = 0;

        for (int i = 0; i < size; i++) {
            boolean isDuplicate = false;

            for (int k = 0; k < j; k++) {
                if (a[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[j++] = a[i];
            }
        }

        // Copy the unique elements to a new array
        int[] newArray = new int[j];
        for (int i = 0; i < j; i++) {
            newArray[i] = temp[i];
        }

        return newArray;
    }

}