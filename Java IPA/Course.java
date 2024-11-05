import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Program {
    private int courseId;
    private String courseName;
    private String courseAdmin;
    private int quiz;
    private int handson;

    public Program(int courseId, String courseName, String courseAdmin, int quiz, int handson) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.courseAdmin = courseAdmin;
        this.quiz = quiz;
        this.handson = handson;
    }

    public int getCourseId() {
        return courseId;
    }

    public void putCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void putCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseAdmin() {
        return courseAdmin;
    }

    public void putCourseAdmin(String courseAdmin) {
        this.courseAdmin = courseAdmin;
    }

    public int getQuiz() {
        return quiz;
    }

    public void putQuiz(int quiz) {
        this.quiz = quiz;
    }

    public int getHandson() {
        return handson;
    }

    public void putHandson(int handson) {
        this.handson = handson;
    }

}

public class Course {
    public static int findAvgOfQuizByAdmin(Program[] prog, String a) {
        int n1 = prog.length;
        int avgQuiz = 0;
        int value = 0;
        for (int i = 0; i < n1; i++) {
            if (prog[i].getCourseAdmin().equalsIgnoreCase(a)) {
                avgQuiz += prog[i].getQuiz();
                value++;
            }
        }
        int result = avgQuiz / value;
        if (result > 0) {
            return result;
        }
        return 0;
    }

    public static Program[] sortCourseByHandsOn(Program[] prog, int h) {
        int n2 = prog.length;
        List<Program> newProg = new ArrayList<>();

        for (int i = 0; i < n2; i++) {
            if (prog[i].getHandson() < h) {
                newProg.add(prog[i]);
            }
        }
        Program[] s = newProg.toArray(new Program[newProg.size()]);
        Program temp;
        for (int i = 0; i < s.length - 1; i++) {
            for (int j = 0; j < s.length - 1; j++) {
                if (s[j].getHandson() > s[j + 1].getHandson()) {
                    temp = s[j];
                    s[j] = s[j + 1];
                    s[j + 1] = temp;
                }
            }
        }
        return s;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of input : ");
        int n = sc.nextInt();
        sc.nextLine();
        Program[] prog = new Program[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Enter courseId : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter courseName : ");
            String name = sc.nextLine();
            System.out.println("Enter courseAdmin : ");
            String admin = sc.nextLine();
            System.out.println("Enter quiz : ");
            int quiz = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter handson : ");
            int handson = sc.nextInt();
            sc.nextLine();

            prog[i] = new Program(id, name, admin, quiz, handson);
        }
        int value1 = findAvgOfQuizByAdmin(prog, "Shyam");
        if (value1 != 0) {
            System.out.println(value1);
        } else {
            System.out.println("No Course found.");
        }

        Program[] p = sortCourseByHandsOn(prog, 100);
        for (int i = 0; i < p.length; i++) {
            System.out.println(p[i].getCourseId() + " " + p[i].getCourseName());
        }

    }
}
