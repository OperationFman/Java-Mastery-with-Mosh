import mortgageclasses.UIControl;;

public class App {
    public static void main(String[] args) throws Exception {
        var control = new UIControl();
        control.disable();
        System.out.println(control.isEnabled());
    }
}
