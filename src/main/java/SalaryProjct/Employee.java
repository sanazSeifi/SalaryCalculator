package SalaryProjct;

public class Employee {
    private int baseSalary;
    public int hourlyRate;

public int calculateWage(int extraHours) {
    return baseSalary + (extraHours * hourlyRate);
}

public void setBaseSalary(int baseSalary){
    if(baseSalary <= 0){
        throw
    }
}
}