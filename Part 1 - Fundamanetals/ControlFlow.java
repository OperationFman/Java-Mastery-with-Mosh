public class ControlFlow {
    public static void main(String[] args) {
        int temperature = 22;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(isWarm); // true

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
        boolean isEligible = hasHighIncome || hasGoodCredit;
        System.out.println(isEligible); // true

        boolean hasCriminalRecord = false;
        boolean isEligible2 = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord; // && !<boolean> means 'and not'
        System.out.println(isEligible2); // true


        int temp = 32;
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink plenty of water");
        } else if (temp > 20) {
            System.out.println("Beautiful Day");
        } else {
            System.out.println("It's a cold day");
        }

    }
}
