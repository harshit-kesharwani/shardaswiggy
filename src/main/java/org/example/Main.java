import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String[] restaurantNames = { "Uncle's Cafe", "Lego" };
        String[][] menus = {
                { "Lassi", "Cold Drink" },
                { "Biryani", "Keema Polao" }
        };
        double[][] prices = {
                { 40.0, 20.0 },
                { 110.0, 150.0 }
        };
        // Display Welcome Message
        System.out.println("Welcome to the Swiggy Customer application ");

        // Display available restaurants
        System.out.println("Choose a restaurant:");
        for (int i = 0; i < restaurantNames.length; i++) {
            System.out.println((i + 1) + ". " + restaurantNames[i]);
        }

        // Get user input for restaurant selection
        Scanner scanner = new Scanner(System.in);
        int restaurantIndex = scanner.nextInt();
        scanner.close();

        // Display menu for the selected restaurant
        if (restaurantIndex >= 1 && restaurantIndex <= restaurantNames.length) {
            int index = restaurantIndex - 1;
            System.out.println("Menu for " + restaurantNames[index] + ":");
            String[] menu = menus[index];
            double[] menuPrices = prices[index];

            for (int i = 0; i < menu.length; i++) {
                System.out.println((i + 1) + ". " + menu[i] + " - " + menuPrices[i]);
            }
        } else {
            System.out.println("Invalid restaurant selection!");
        }
    }
}
