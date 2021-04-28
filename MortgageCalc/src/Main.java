import calc.UIControl;

public class Main {
    public static void main(String[] args) throws Exception {
        var control = new UIControl();
        control.disable();
        System.out.println(control.isEnabled());
    }
}
