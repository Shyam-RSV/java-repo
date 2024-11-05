public class Encapsulation{

    private int salary;

    public void setSalary(int s){
        this.salary = s;
    }

        public int getSalary(){
            return salary;
        }
    public static void main(String[] args){
        Encapsulation myObj = new Encapsulation();
        myObj.setSalary(20000);
        System.out.println(" Salary is " + myObj.getSalary());

    }
}