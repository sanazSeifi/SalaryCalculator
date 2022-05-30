package SalaryProjct;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

public int calculateWage(int extraHours) {
    return baseSalary + (extraHours * hourlyRate);
}

public void setBaseSalary(int baseSalary){
    if(baseSalary <= 0)
        try {
            throw new IllegalAccessException(" Salary cannot be Zero or less");
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    this.baseSalary = baseSalary;
}
public int getBaseSalary(){
    return baseSalary;
}

public void setHourlyRate(int hourlyRate){
    if (hourlyRate <= 0)
        try {
            throw new IllegalAccessException("HourlyRate cannot be zero or less");
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    this.hourlyRate= hourlyRate;
}

    public int getHourlyRate() {
        return hourlyRate;
    }
}