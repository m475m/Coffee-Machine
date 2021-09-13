package machine;


public class CoffeeMachine {

    static int water = 400;
    static int milk = 540;
    static int coffeBeans = 120;
    static int disposableCups = 9;
    static int money = 550;

    static States state = States.ChoosingAnAction;

    public static void choose(String input) {
        switch (state) {
            case ChoosingAnAction: {
                switch (input) {
                    case "buy": {
                        state = States.ChoosingAVariantOfCoffee;
                        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                        break;
                    }
                    case "fill": {
                        state = States.AddingWater;
                        System.out.println("Write how many ml of water you want to add: ");
                        break;
                    }
                    case "take": {
                        System.out.println("I gave you $" + money);
                        money = 0;
                        System.out.println();
                        System.out.println("Write action (buy, fill, take, remaining, exit): ");
                        break;
                    }
                    case "remaining": {
                        System.out.println("The coffee machine has:\n" +
                                water + " ml of water\n" +
                                milk + " ml of milk\n" +
                                coffeBeans + " g of coffee beans\n" +
                                disposableCups + " disposable cups\n" +
                                "$" + money + " of money");
                        System.out.println();
                        System.out.println("Write action (buy, fill, take, remaining, exit): ");
                        break;
                    }
                    default: {
                        System.out.println("Write action (buy, fill, take, remaining, exit): ");
                    }
                }
                break;
            }
            case ChoosingAVariantOfCoffee: {
                switch (input) {
                    case "1": {
                        if (water < 250) {
                            System.out.println("Sorry, not enough water!");
                            state = States.ChoosingAnAction;
                            System.out.println("Write action (buy, fill, take, remaining, exit): ");
                            break;
                        }

                        if (coffeBeans < 16) {
                            System.out.println("Sorry, not enough coffee beans!");
                            state = States.ChoosingAnAction;
                            System.out.println("Write action (buy, fill, take, remaining, exit): ");
                            break;
                        }

                        if (disposableCups < 1) {
                            System.out.println("Sorry, not enough disposable cups!");
                            state = States.ChoosingAnAction;
                            System.out.println("Write action (buy, fill, take, remaining, exit): ");
                            break;
                        }
                        System.out.println("I have enough resources, making you a coffee!");

                        water = water - 250;
                        coffeBeans = coffeBeans - 16;
                        disposableCups = disposableCups - 1;
                        money = money + 4;
                        state = States.ChoosingAnAction;
                        System.out.println("Write action (buy, fill, take, remaining, exit): ");
                        break;

                    }

                    case "2": {

                        if (water < 350) {
                            System.out.println("Sorry, not enough water!");
                            state = States.ChoosingAnAction;
                            System.out.println("Write action (buy, fill, take, remaining, exit): ");
                            break;
                        }

                        if (milk < 75) {
                            System.out.println("Sorry, not enough milk!");
                            state = States.ChoosingAnAction;
                            System.out.println("Write action (buy, fill, take, remaining, exit): ");
                            break;
                        }

                        if (coffeBeans < 20) {
                            System.out.println("Sorry, not enough coffee beans!");
                            state = States.ChoosingAnAction;
                            System.out.println("Write action (buy, fill, take, remaining, exit): ");
                            break;
                        }

                        if (disposableCups < 1) {
                            System.out.println("Sorry, not enough disposable cups!");
                            state = States.ChoosingAnAction;
                            System.out.println("Write action (buy, fill, take, remaining, exit): ");
                            break;
                        }
                        System.out.println("I have enough resources, making you a coffee!");

                        water = water - 350;
                        milk = milk - 75;
                        coffeBeans = coffeBeans - 20;
                        disposableCups = disposableCups - 1;
                        money = money + 7;
                        state = States.ChoosingAnAction;
                        System.out.println("Write action (buy, fill, take, remaining, exit): ");
                        break;
                    }

                    case "3": {

                        if (water < 200) {
                            System.out.println("Sorry, not enough water!");
                            state = States.ChoosingAnAction;
                            System.out.println("Write action (buy, fill, take, remaining, exit): ");
                            break;
                        }

                        if (milk < 100) {
                            System.out.println("Sorry, not enough milk!");
                            state = States.ChoosingAnAction;
                            System.out.println("Write action (buy, fill, take, remaining, exit): ");
                            break;
                        }

                        if (coffeBeans < 12) {
                            System.out.println("Sorry, not enough coffee beans!");
                            state = States.ChoosingAnAction;
                            System.out.println("Write action (buy, fill, take, remaining, exit): ");
                            break;
                        }

                        if (disposableCups < 1) {
                            System.out.println("Sorry, not enough disposable cups!");
                            state = States.ChoosingAnAction;
                            System.out.println("Write action (buy, fill, take, remaining, exit): ");
                            break;
                        }

                        System.out.println("I have enough resources, making you a coffee!");

                        water = water - 200;
                        milk = milk - 100;
                        coffeBeans = coffeBeans - 12;
                        disposableCups = disposableCups - 1;
                        money = money + 6;
                        state = States.ChoosingAnAction;
                        System.out.println("Write action (buy, fill, take, remaining, exit): ");
                        break;
                    }

                    case "back": {
                        state = States.ChoosingAnAction;
                        System.out.println("Write action (buy, fill, take, remaining, exit): ");
                        break;
                    }
                }
                break;
            }
            case AddingWater: {
                water += Integer.parseInt(input);
                state = States.AddingMilk;
                System.out.println("Write how many ml of milk you want to add: ");
                break;
            }
            case AddingMilk: {
                milk += Integer.parseInt(input);
                state = States.AddingCoffeeBeans;
                System.out.println("Write how many grams of coffee beans you want to add: ");
                break;
            }
            case AddingCoffeeBeans: {
                coffeBeans += Integer.parseInt(input);
                state = States.AddingDisposableCups;
                System.out.println("Write how many disposable cups of coffee you want to add: ");
                break;
            }
            case AddingDisposableCups: {
                disposableCups += Integer.parseInt(input);
                state = States.ChoosingAnAction;
                System.out.println("Write action (buy, fill, take, remaining, exit): ");
                break;
            }

        }


    }
}
