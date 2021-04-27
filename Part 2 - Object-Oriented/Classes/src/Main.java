import classes.TextBox;

public class Main {
    public static void main(String[] args) {
        var textBox1 = new TextBox(); // New instance of textbox
        textBox1.setText("Box 1");
        System.out.println(textBox1.text); // Box 1

        var textBox2 = new TextBox(); // New instance of textbox
        textBox2.setText("Box 2");
        System.out.println(textBox2.text); // Box 2

        int baseSalary = 50000;
        int extraHours = 10;
        int hourlyRate = 20;
        int wage = calculateWage(baseSalary, extraHours, hourlyRate);
        System.out.println(wage);
        
    }

    public static int calculateWage(int baseSalary, int extraHours, int hourlyRate) {
        return baseSalary + extraHours * hourlyRate;
    }
}
