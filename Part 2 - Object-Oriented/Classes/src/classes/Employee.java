package classes;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public int calculateWage(int extraHours) {
        return baseSalary + extraHours * hourlyRate;
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) throw new IllegalArgumentException("Salary cannot be zero or less");
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() { // This is na getter/setter so class variables can;t be edited
        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0) throw new IllegalArgumentException("Hourly Rate cannot be zero or less");
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() { // This is na getter/setter so class variables can;t be edited
        return hourlyRate;
    }
}
