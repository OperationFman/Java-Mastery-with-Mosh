import classes.UIControl;

public class App {
    public static void main(String[] args) {
        var control = new UIControl();
        control.disable();
        System.out.println(control.isEnabled());
    }
}
