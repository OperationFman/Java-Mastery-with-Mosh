import classes.Employee;
import classes.Browser;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(50000); // setter
        employee.setHourlyRate(20); // setter
        int wage = employee.calculateWage(10); // setter

        int salary = employee.getBaseSalary(); // getter
        int hourlyRate = employee.getHourlyRate(); // getter
        
        System.out.println(wage); // 50200
        System.out.println(salary); // 50000
        System.out.println(hourlyRate); // 20



        var browser = new Browser(); // Check class to see how decoupling was setup
        browser.navigate("192.168.0.1"); // Return <html></html>
    }
}
