import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
class Person{
    private String firstName;
    private String lastName;
    private int age;
    private char gender;

    public Person(String firstName, String lastName, int age, char gender){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
    }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }
    public void setLastName(String lastName) { this.lastName = lastName; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
    
    public char getGender() { return gender; }
    public void setGender(char gender) { this.gender = gender; }

}

class Student extends Person{
    private String rollNo;
    private String course;
    private int semester;
    private double GPA; 
    
    public Student(String firstName, String lastName, int age, char gender, String rollNo, String course, int semester, double GPA){
        super(firstName, lastName, age, gender);
        this.rollNo = rollNo;
        this.course = course;
        this.semester = semester;
        this.GPA = GPA;

    }

    public void setRollNo (String rollNo){ this.rollNo = rollNo; }
    public String getRollNo() { return rollNo; }

    public void setCourse (String course){ this.course = course; }
    public String getCourse() { return course; }

    public void setSemester (int semester){ this.semester = semester; }
    public int getSemester() { return semester; }

    public void setGpa (double GPA){ this.GPA = GPA; }
    public double getGpa() { return GPA; }
}

class Faculty extends Person{
    private String employeeId;
    private String department;
    private String designation;
    private double salary;

    public Faculty(String firstName, String lastName, int age, char gender, String employeeId, String department, String designation, double salary){
        super(firstName, lastName, age, gender);
        this.employeeId = employeeId;
        this.department = department;
        this.designation = designation;
        this.salary = salary;
    }

    public void setEmployeeID(String employeeId){ this.employeeId = employeeId; }
    public String getEmployeeID(){ return employeeId; }

    public void setDepartment(String department){ this.department = department; }
    public String getDepartment(){ return department; }

    public void setDesignation(String designation){ this.designation = designation; }
    public String getDesignation(){ return designation; }

    public void setSalary(double salary){ this.salary = salary; }
    public double getSalary(){ return salary; }


}
public class E15 {
    public static Student findHighestGPAStudent(Student[] st){
        Student stud = st[0];
        for(int i = 1; i < st.length; i++){
            if(stud.getGpa() < st[i].getGpa()){
                stud = st[i];
            }
        }
        return stud;
    } 

    public static Faculty findHighestPaidFaculty(Faculty[] facu){
        Faculty fa = facu[0];
        for(int i = 1; i < facu.length; i++){
            if(fa.getSalary() < facu[i].getSalary()){
                fa = facu[i];
            }
        }
        return fa;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Student[] stu = new Student[3];
        Faculty[] fac = new Faculty[3];
        for(int i = 0; i < stu.length; i++){
            System.out.println("Enter new details : " + i+1);
            String sfName = sc.nextLine();
            String slName = sc.nextLine();
            int sage = sc.nextInt(); sc.nextLine();
            char sgender = sc.next(). charAt(0);sc.nextLine();
            String roll = sc.nextLine();
            String course = sc.nextLine();
            int sem = sc.nextInt();sc.nextLine();
            double gpa = sc.nextDouble(); sc.nextLine();
            stu[i] = new Student(sfName, slName, sage, sgender, roll, course, sem, gpa);

        }
        for(int i = 0; i < fac.length; i++){
            System.out.println("Enter new details : " + i+1);
            String ffName = sc.nextLine();
            String flName = sc.nextLine();
            int fage = sc.nextInt(); sc.nextLine();
            char fgender = sc.next(). charAt(0);sc.nextLine();
            String empID = sc.nextLine();
            String dept = sc.nextLine();
            String desi = sc.nextLine();
            double sal = sc.nextDouble(); sc.nextLine();
            fac[i] = new Faculty(ffName, flName, fage, fgender, empID, dept, desi, sal);

        }

        Student stude = findHighestGPAStudent(stu);
        Faculty facl = findHighestPaidFaculty(fac);
        if(stude != null){
            System.out.println(stude.getFirstName());
        } else{
            System.out.println("Sorry - No student is available");
        }

        if(facl != null){
            System.out.println(facl.getFirstName());
        } else{
            System.out.println("Sorry - No faculty is available");
        }
        sc.close();


    }
    
}
