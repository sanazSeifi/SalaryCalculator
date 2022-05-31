package SalaryProjct;

public class Employee {
    public int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;

    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees ++;
    }

    public static void printNumberOfEmployees(){
        new Employee(2_000, 30).calculateWage(20);
        System.out.println(numberOfEmployees);
    }
public int calculateWage(int extraHours) {
    return baseSalary + (extraHours * hourlyRate);
}public int calculateWage() {
    return calculateWage(0);
}

private void setBaseSalary(int baseSalary){
    if(baseSalary <= 0)
        try {
            throw new IllegalAccessException(" Salary cannot be Zero or less");
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    this.baseSalary = baseSalary;
}
private int getBaseSalary(){
    return baseSalary;
}

private void setHourlyRate(int hourlyRate){
    if (hourlyRate <= 0)
        try {
            throw new IllegalAccessException("HourlyRate cannot be zero or less");
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    this.hourlyRate= hourlyRate;
}

    private int getHourlyRate() {
        return hourlyRate;
    }
}