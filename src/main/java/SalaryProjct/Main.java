package SalaryProjct;

public class Main {
    public static void main(String[] args){
  Employee employee = new Employee(20_000, 20);
  //Employee employee = new Employee(); = var employee = new Employee();
        System.out.println(Employee.numberOfEmployees);
        int wage =  employee.calculateWage();
        System.out.println(wage);

}}
