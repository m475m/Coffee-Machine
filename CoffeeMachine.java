package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
       /* System.out.printf("Starting to make a coffee\n" +
                "Grinding coffee beans\n" +
                "Boiling water\n" +
                "Mixing boiled water with crushed coffee beans\n" +
                "Pouring coffee into the cup\n" +
                "Pouring some milk into the cup\n" +
                "Coffee is ready!");

        System.out.println("Write how many cups of coffee you will need: ");
        Scanner scanner = new Scanner(System.in);
        int cupsAmount = scanner.nextInt();
        System.out.println("For 25 cups of coffee you will need:");
        System.out.printf("%d ml of water\n", 200 * cupsAmount);
        System.out.printf("%d ml of milk\n", 50 * cupsAmount);
        System.out.printf("%d g of coffee beans\n", 15 * cupsAmount);*/

        Scanner scanner = new Scanner(System.in);

       /* System.out.println("Write how many ml of water the coffee machine has: ");
        int water = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has: ");
        int milk = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has: ");
        int coffeeBeans = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need: ");
        int cupsNeed = scanner.nextInt();

        int cupsAvaliable = Math.min(water / 200, Math.min(milk / 50, coffeeBeans / 15));

        if (cupsNeed == cupsAvaliable) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (cupsNeed > cupsAvaliable) {
            System.out.printf("No, I can make only %d cup(s) of coffee", cupsAvaliable);
        } else {
            System.out.printf("Yes, I can make that amount of coffee (and even %d more than that)", cupsAvaliable - cupsNeed);
        }
*/
        int water = 400;
        int milk = 540;
        int coffeBeans = 120;
        int disposableCups = 9;
        int money = 550;




        for (boolean exit = false; exit != true; ) {
            System.out.println("Write action (buy, fill, take, remaining, exit):");
            switch (scanner.next()) {
                case "buy": {
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
                    switch (scanner.next()) {
                        case "1": {
                            if(water < 250) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            }

                            if (coffeBeans < 16) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            }

                            if (disposableCups < 1) {
                                System.out.println("Sorry, not enough disposable cups!");
                                break;
                            }
                            System.out.println("I have enough resources, making you a coffee!");

                            water = water - 250;
                            coffeBeans = coffeBeans - 16;
                            disposableCups = disposableCups - 1;
                            money = money + 4;
                            /*System.out.println("The coffee machine has:\n" +
                                    water + " ml of water\n" +
                                    milk + " ml of milk\n" +
                                    coffeBeans + " g of coffee beans\n" +
                                    disposableCups + " disposable cups\n" +
                                    "$" + money + " of money"); */
                            break;

                        }

                        case "2": {

                            if(water < 350) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            }

                            if (milk < 75) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            }

                            if (coffeBeans < 20) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            }

                            if (disposableCups < 1) {
                                System.out.println("Sorry, not enough disposable cups!");
                                break;
                            }
                            System.out.println("I have enough resources, making you a coffee!");

                            water = water - 350;
                            milk = milk - 75;
                            coffeBeans = coffeBeans - 20;
                            disposableCups = disposableCups - 1;
                            money = money + 7;
                            /* System.out.println("The coffee machine has:\n" +
                                    water + " ml of water\n" +
                                    milk + " ml of milk\n" +
                                    coffeBeans + " g of coffee beans\n" +
                                    disposableCups + " disposable cups\n" +
                                    "$" + money + " of money"); */
                            break;
                        }

                        case "3": {

                            if(water < 200) {
                                System.out.println("Sorry, not enough water!");
                                break;
                            }

                            if (milk < 100) {
                                System.out.println("Sorry, not enough milk!");
                                break;
                            }

                            if (coffeBeans < 12) {
                                System.out.println("Sorry, not enough coffee beans!");
                                break;
                            }

                            if (disposableCups < 1) {
                                System.out.println("Sorry, not enough disposable cups!");
                                break;
                            }

                            System.out.println("I have enough resources, making you a coffee!");

                            water = water - 200;
                            milk = milk - 100;
                            coffeBeans = coffeBeans - 12;
                            disposableCups = disposableCups - 1;
                            money = money + 6;
                            /* System.out.println("The coffee machine has:\n" +
                                    water + " ml of water\n" +
                                    milk + " ml of milk\n" +
                                    coffeBeans + " g of coffee beans\n" +
                                    disposableCups + " disposable cups\n" +
                                    "$" + money + " of money"); */
                            break;
                        }

                        case "back": {
                            break;
                        }
                    }
                    continue;
                }
                case "fill": {
                    System.out.println("Write how many ml of water you want to add: ");
                    water = water + scanner.nextInt();
                    System.out.println("Write how many ml of milk you want to add: ");
                    milk = milk + scanner.nextInt();
                    System.out.println("Write how many grams of coffee beans you want to add: ");
                    coffeBeans = coffeBeans + scanner.nextInt();
                    System.out.println("Write how many disposable cups of coffee you want to add: ");
                    disposableCups = disposableCups + scanner.nextInt();

                   /* System.out.println("The coffee machine has:\n" +
                            water + " ml of water\n" +
                            milk + " ml of milk\n" +
                            coffeBeans + " g of coffee beans\n" +
                            disposableCups + " disposable cups\n" +
                            "$" + money + " of money"); */

                    continue;
                }
                case "take": {
                    System.out.println("I gave you $" + money);
                    money = 0;
                    /*System.out.println("The coffee machine has:\n" +
                            water + " ml of water\n" +
                            milk + " ml of milk\n" +
                            coffeBeans + " g of coffee beans\n" +
                            disposableCups + " disposable cups\n" +
                            "$" + money + " of money"); */

                    continue;
                }
                case "remaining": {
                    System.out.println("The coffee machine has:\n" +
                            water + " ml of water\n" +
                            milk + " ml of milk\n" +
                            coffeBeans + " g of coffee beans\n" +
                            disposableCups + " disposable cups\n" +
                            "$" + money + " of money");
                    continue;
                }
                case "exit": {
                    exit = true;
                   continue;
                }
                default:
                    continue;
            }
        }
    }


}
