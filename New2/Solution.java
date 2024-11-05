import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    int id;
    String name;
    int totmarksobt;

    // Constructor
    public Solution(int id, String name, int totmarksobt) {
        this.id = id;
        this.name = name;
        this.totmarksobt = totmarksobt;
    }

    // Setters and Getters
    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setTotmarksobt(int totmarksobt) {
        this.totmarksobt = totmarksobt;
    }

    public int getTotmarksobt() {
        return totmarksobt;
    }

    // Method to find the student with the highest total marks
    public static String findStudentWithhighestTotal(Solution[] st) {
        int size = st.length;
        Solution temp = st[0];
        for (int i = 1; i < size; i++) {
            if (temp.getTotmarksobt() < st[i].getTotmarksobt()) {
                temp = st[i];
            }
        }
        return temp.getName().toUpperCase();
    }

    // Method to search students with percentage above 70%
    public static List<Integer> searchStudentBypercentage(Solution[] st) {
        int size = st.length;
        List<Integer> ids = new ArrayList<>();
        double percent;

        for (int i = 0; i < size; i++) {
            percent = (double) st[i].getTotmarksobt() / 400 * 100;
            if (percent > 70) {
                ids.add(st[i].getId());
            }
        }
        Collections.sort(ids);
        if (ids.isEmpty()) {
            return null;
        } else {
            return ids;
        }
    }

    public static void main(String args[]) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        // Workaround to avoid skipping the nextLine() issue after nextInt()
        sc.nextLine();  

        Solution[] sol = new Solution[n];
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            sc.nextLine(); // Consume newline left-over
            String name = sc.nextLine();
            int totmarksobt = sc.nextInt();
            sc.nextLine(); // Consume newline after integer input
            sol[i] = new Solution(id, name, totmarksobt);
        }

        // Find and print the student with the highest total marks
        String res = findStudentWithhighestTotal(sol);
        System.out.println(res);

        // Find and print students with percentage greater than 70%
        List<Integer> result = searchStudentBypercentage(sol);
        if (result != null) {
            for (Integer id : result) {
                System.out.println(id);
            }
        } else {
            System.out.println("No Student found with mentioned attributes");
        }
    }
}
