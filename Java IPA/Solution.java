import java.util.*;
class Employee{
private int employeeId;
private String employeeName;
private int age;
private char gender;
private double salary;

public Employee(int employeeId, String employeeName, int age, char gender, double salary) {
    this.employeeId=employeeId;
    this.employeeName=employeeName;
    this.age=age;
    this.gender=gender;
    this.salary=salary;
    }

    public void displayMethod(){
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Employee Name : " + employeeName);
        System.out.println("Employee Age : " + age);
        System.out.println("Employee Gender : " + gender);
        System.out.println("Employee Salary : " + salary);
        System.out.println("------------------");

    }

public void setId(int employeeId){
    this.employeeId = employeeId;
}
public int getId(){
    return employeeId;
}

public void setName(String employeeName){
    this.employeeName = employeeName;
}
public String getName(){
    return employeeName;
}

public void setAge(int age){
    this.age = age;
}
public int getAge(){
    return age;
}

public void setGender(char gender){
    this.gender = gender;
}
public char getGender(){
    return gender;
}

public void setSalary(double salary){
    this.salary = salary;
}
public double getSalary(){
    return salary;
}

} // Employee class over
public class Solution{
    public static Employee[] getEmployeeWithSecondLowestSalary(Employee[] emp ){
        int size1 = emp.length;
        Employee temp;
        for(int i = 0; i < size1 - 1; i++){
            for(int j = 0; j < size1 - 1; j++){
                if(emp[j].getSalary() > emp[j+1].getSalary()){
                    temp = emp[j];
                    emp[j] = emp[j+1];
                    emp[j+1] = temp;
                }
            }
        }
        return emp;

    }
    public static int countEmployeesBasedOnAge(Employee[] emp, int age){
        int county = 0;
        int size2 = emp.length;
        for(int i = 0; i < size2; i++){
            if(age == emp[i].getAge()){
                county ++;
            }
        }
        return county;

    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter number of n : ");
        //int n = sc.nextInt();
        Employee[] emp = new Employee[5];

            emp[0] = new Employee(001, "Sathyashyam", 21, 'M', 30000);
            emp[1] = new Employee(002, "Anjali Sharma", 29, 'F', 45000);
            emp[2] = new Employee(003, "Rahul Verma", 35, 'M', 52000);
            emp[3] = new Employee(004, "Priya Patel", 27, 'F', 41000);
            emp[4] = new Employee(005, "Ravi Kumar", 35, 'M', 60000);
            int target = 35;
            Employee[] result = getEmployeeWithSecondLowestSalary(emp);
            System.out.println(emp[1].getId() + "#" + emp[1].getName());
            int count = countEmployeesBasedOnAge(emp, target);
            System.out.println(count);
            // emp[0].displayMethod();
            // emp[1].displayMethod();
            // emp[2].displayMethod();
            // emp[3].displayMethod();
            // emp[4].displayMethod();
            // Employee lowestSal = emp[0];
            // for(int i = 1; i < emp.length; i++){
            //     if(emp[i].getSalary() < lowestSal.getSalary()){
            //         lowestSal = emp[i];
            //     } // find lowest salary
            // }
            // emp[0].displayMethod();
            // emp[1].displayMethod();
            // emp[2].displayMethod();
            // emp[3].displayMethod();
            // emp[4].displayMethod();
    }

}