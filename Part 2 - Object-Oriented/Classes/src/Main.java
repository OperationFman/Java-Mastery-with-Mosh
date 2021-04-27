import classes.Employee;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(50000); // -1: Salary cannot be zero or less
        employee.hourlyRate = 20;
        int wage = employee.calculateWage(10);
        System.out.println(wage); // 50200
        
    }
}
