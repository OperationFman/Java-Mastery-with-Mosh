import java.util.Scanner;

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

        int income = 120000;
        boolean isHighIncome = income > 100000; // If this evaluates to true, it's true. Better than if else apparently
        System.out.println(isHighIncome); // true

        int earnings = 120000;
        String className = earnings > 100000 ? "First Class" : "Economy"; // ternerary Operator, alternative to if else
        System.out.println(className); // "First Class"
        
        String role = "admin";
        switch (role) {
            case "admin":
                System.out.println("You're an admin"); // You're an admin
                break; // Always add a break otherwise following stuff executes anyways for some reason
            case "moderator":
                System.out.println("You're a moderator");
                break;
            default: 
                System.out.println("You are a guest");
        }



        for (int i = 0; i < 5; i++) { // aka for i in range
            System.out.println("Hello World " + i);
        }

        int k = 5;
        while (k >= 0) {
            System.out.println("Hello World " + k);
            k --;
        }

        String input = "quit"; // Make empty to run the loop
        Scanner scanner = new Scanner(System.in);
        while (!input.equals("quit")) { // Remember, String is a reference type. Comparing input to "quit" is actually comparing memory addresses, which wouldn't match. use .equals() to compare the output values
            System.out.println("input: ");
            input = scanner.next().toLowerCase();
            System.out.println(input);
        }

        String[] fruits = {"Apple", "Mango", "Orange"};
        for (String i : fruits) { // Traditional 'for i in array', but no access to the index
            System.out.println(i);
        }
        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]); // Similar to 'for i in enumerate(array)' so i is the index
        }


    }
}
