package classes;

public class Employee {
    private int baseSalary; // instance Fields

    public static int numberOfEmployees; // static Fields

    private int hourlyRate;

    public Employee(int baseSalary, int hourlyRate) { // Uses the setters to set defaults values. aka it';'s a constuctor
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++; // Whenever a new employeee is created, mthe above static field is incrmeneted. 
        // In this case, that means we can see how many employees exist by just dot-notationing it
    }

    public static void printNumberOfEmployees() {
        System.out.println(numberOfEmployees); // fyi this cannot see the others methods in this class
    }

    public int calculateWage(int extraHours) {
        return baseSalary + extraHours * hourlyRate;
    }

    private void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0) throw new IllegalArgumentException("Salary cannot be zero or less");
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() { // This is na getter/setter so class variables can't be edited
        return baseSalary;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate <= 0) throw new IllegalArgumentException("Hourly Rate cannot be zero or less");
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() { // This is na getter/setter so class variables can't be edited
        return hourlyRate;
    }
}
