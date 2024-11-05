import java.util.Scanner;

class Employee {
    private int id;
    private String name;
    private String designation;
    private double salary;

    public Employee(int id, String name, String designation, double salary) {
        this.id = id;
        this.name = name;
        this.designation = designation;
        this.salary = salary;
    }

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

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public String getDesignation() {
        return designation;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public double getSalary1() {
        return salary;

    }

    public String getDesignation1() {
        return designation;
    }
}

public class Company {
    private String companyName;
    private Employee[] employee;
    private int numEmployees;

    public Company(String companyName, Employee[] employee, int numEmployees) {
        this.companyName = companyName;
        this.employee = employee;
        this.numEmployees = numEmployees;
    }

    public void getEmployeesByDesignation(String designation, Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            if(designation.equalsIgnoreCase(employee[i].getDesignation())){
                System.out.println(designation + " " + employee[i].getId() + " " + employee[i].getName());
            }
        }
    }

    public void getMaxSalary(Employee[] employee) {
        Employee maxSal = employee[0];
        for (int i = 1; i < employee.length; i++) {
            if (maxSal.getSalary() < employee[i].getSalary()) {
                maxSal = employee[i];
            }

        }
        System.out.println("Maximun Salary : " + maxSal.getSalary());

    }

    public void getAverageSalary(Employee[] employee) {
        int div = employee.length;
        int aveSalary = 0;

        for (int i = 0; i < div; i++) {
            aveSalary += employee[i].getSalary();
        }
        int result = aveSalary / div;
        System.out.println("Average sal : " + result);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Name of Company : ");
        String co = sc.nextLine();
        System.out.println("Enter number of emp : ");
        int num = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter company employee details : ");
        Employee[] emp = new Employee[num];
        for (int i = 0; i < num; i++) {
            System.out.println("Enter employee id : ");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Enter employee name : ");
            String nam = sc.nextLine();
            System.out.println("Enter designation : ");
            String desi = sc.nextLine();
            System.out.println("Enter salary : ");
            double sal = sc.nextDouble();
            emp[i] = new Employee(id, nam, desi, sal);

        }
        Company com = new Company(co, emp, num);

        com.getEmployeesByDesignation("Engineer", emp);
        com.getMaxSalary(emp);
        com.getAverageSalary(emp);

    }
}
