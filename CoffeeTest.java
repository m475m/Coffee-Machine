package machine;

import java.util.Scanner;

public class CoffeeTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeMachine.choose("");
        String inputString = scanner.next();
        while (!inputString.equals("exit")) {
            CoffeeMachine.choose(inputString);
            inputString = scanner.next();
        }


    }
}
