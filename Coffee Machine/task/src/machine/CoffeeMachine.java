package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Write how many cups of coffee you will need: ");

        // taking input
        int n = scan.nextInt();

        int w = 200 * n;
        int m = 50 * n;
        int cb = 15 * n;

        System.out.println("For " + n + "cups of coffee you will need:");
        System.out.println(w + " ml of water");
        System.out.println(m + " ml of milk");
        System.out.println(cb + " g of coffee beans");

    }
}
