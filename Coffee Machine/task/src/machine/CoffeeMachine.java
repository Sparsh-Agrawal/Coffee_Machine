package machine;

import java.util.Scanner;

public class CoffeeMachine {

    final private static Scanner scan = new Scanner(System.in);
    private static int water = 400;
    private static int milk = 540;
    private static int coffee_beans = 120;
    private static int d_cups = 9;
    private static int money = 550;

    public static void main(String[] args) {

        while (true) {
            System.out.println("Write action (buy, fill, take, remaining, exit): ");
            String action = scan.next();

            if (action.equals("buy")) {
                buy();
                printCMStatus();
            } else if (action.equals("fill")) {
                fill();
                printCMStatus();
            } else if (action.equals("take")) {
                take();
                printCMStatus();
            } else if (action.equals("remaining")) {
                printCMStatus();
            } else if (action.equals("exit")) {
                break;
            }
        }









//        System.out.println("Write how many ml of water the coffee machine has: ");
//        int w = scan.nextInt() / 200;
//
//        System.out.println("Write how many ml of milk the coffee machine has: ");
//        int m =scan.nextInt() / 50;
//
//        System.out.println("Write how many grams of coffee beans the coffee machine has:");
//        int cb = scan.nextInt() / 15;
//
//        System.out.println("Write how many cups of coffee you will need: ");
//        int cc = scan.nextInt();
//
//        int cm = w;
//
//        if( m < cm && m < cb ) {
//            cm = m;
//        } else if (cb < cm ) {
//            cm = cb;
//        }
//
//        if ( cm == cc ) {
//            System.out.println("Yes, I can make that amount of coffee");
//        } else if ( cc < cm ) {
//            System.out.println("Yes, I can make that amount of coffee (and even " + (cm-cc) + " more than that)");
//        } else {
//            System.out.println("No, I can make only " + (cm) + " cup(s) of coffee");
//        }




//        System.out.println("Write how many cups of coffee you will need: ");
//
//        // taking input
//        int n = scan.nextInt();
//
//        int w = 200 * n;
//        int m = 50 * n;
//        int cb = 15 * n;
//
//        System.out.println("For " + n + "cups of coffee you will need:");
//        System.out.println(w + " ml of water");
//        System.out.println(m + " ml of milk");
//        System.out.println(cb + " g of coffee beans");

    }

    static void printCMStatus() {
        System.out.println("The coffee machine has:");
        System.out.println(water + " of water");
        System.out.println(milk + " of milk");
        System.out.println(coffee_beans + " of coffee beans");
        System.out.println(d_cups + " of dispossable cups");
        System.out.println(money + " of money \n");
    }

    static void buy() {
        System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu: ");
        String i = scan.next();
        if(i.equals("1")) {
            if(water>=250 && coffee_beans>=16 && d_cups>=1) {
                water -= 250;
                coffee_beans -= 16;
                money += 4;
                d_cups -= 1;
                System.out.println("I have enough resources, making you a coffee!");
            }
            else {
                if(water<250)
                    System.out.println("Sorry, not enough water!");
                if(coffee_beans<16)
                    System.out.println("Sorry, not enough coffee beans!");
                if(d_cups<1)
                    System.out.println("Sorry, not enough cups!");
            }
        } else if (i.equals("2")) {
            if(water>=350 && milk>-75 && coffee_beans>=20 && d_cups>=1) {
                water -= 350;
                milk -= 75;
                coffee_beans -= 20;
                money += 7;
                d_cups -= 1;
            }
            else {
                if(water<350)
                    System.out.println("Sorry, not enough water!");
                if(milk<75)
                    System.out.println("Sorry, not enough milk!");
                if(coffee_beans<20)
                    System.out.println("Sorry, not enough coffee beans!");
                if(d_cups<1)
                System.out.println("Sorry, not enough cups!");
            }
        } else if (i.equals("3")) {
            if(water>=200 && milk>=100 && coffee_beans>=12 && d_cups>=1) {
                water -= 200;
                milk -= 100;
                coffee_beans -= 12;
                money += 6;
                d_cups -= 1;
            }
            else {
                if(water<200)
                    System.out.println("Sorry, not enough water!");
                if(milk<100)
                    System.out.println("Sorry, not enough milk!");
                if(coffee_beans<12)
                    System.out.println("Sorry, not enough coffee beans!");
                if(d_cups<1)
                    System.out.println("Sorry, not enough cups!");
            }
        } else if (i.equals("back")) {

        }
        System.out.println();
    }

    static void fill() {
        System.out.println("Write how many ml of water do you want to add:");
        water += scan.nextInt();
        System.out.println("Write how many ml of milk do you want to add:");
        milk += scan.nextInt();
        System.out.println("Write how many grams of coffee beans do you want to add:");
        coffee_beans += scan.nextInt();
        System.out.println("Write how many disposable cups of coffee do you want to add:");
        d_cups += scan.nextInt();
        System.out.println();
    }

    static void take() {
        System.out.println("I gave you $" + money);
        money = 0;
        System.out.println();
    }
}
