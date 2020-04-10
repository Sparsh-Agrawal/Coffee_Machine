package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write how many ml of water the coffee machine has: ");
        int w = scan.nextInt() / 200;

        System.out.println("Write how many ml of milk the coffee machine has: ");
        int m =scan.nextInt() / 50;

        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int cb = scan.nextInt() / 15;

        System.out.println("Write how many cups of coffee you will need: ");
        int cc = scan.nextInt();

        int cm = w;

        if( m < cm && m < cb ) {
            cm = m;
        } else if (cb < cm ) {
            cm = cb;
        }

        if ( cm == cc ) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if ( cc < cm ) {
            System.out.println("Yes, I can make that amount of coffee (and even " + (cm-cc) + " more than that)");
        } else {
            System.out.println("No, I can make only " + (cm) + " cup(s) of coffee");
        }




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
}
