import java.util.Random;
import java.util.Scanner;

public class DiceRoller {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("🎲 Welcome to Dice Roller Game!");
        String choice;

        do {
            System.out.println("\nPress Enter to roll the dice...");
            sc.nextLine();

            int dice = rand.nextInt(6) + 1; // 1 to 6
            System.out.println("You rolled: " + dice);

            System.out.print("Do you want to roll again? (y/n): ");
            choice = sc.nextLine();

        } while (choice.equalsIgnoreCase("y"));

        System.out.println("\nThanks for playing! Goodbye 👋");
        sc.close();
    }
}
