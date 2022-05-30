package SalaryProjct;

public class Main {
    public static void main(String[] args){
  Employee employee = new Employee();
  //Employee employee = new Employee(); = var employee = new Employee();
        employee.setBaseSalary(0);
        employee.hourlyRate = 20;

        int wage =  employee.calculateWage(10);
        System.out.println(wage);

}}
