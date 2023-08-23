import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan_main = new Scanner(System.in);
        String respond;

        while (true) {
            System.out.println("Do you want to start the game? (Y/N)");
            respond = scan_main.next().toUpperCase();

            if (respond.equals("Y")) {
                Game.game();  // Call your game logic hered
            } else if (respond.equals("N")) {
                System.out.println("Game over");
                break;  // Exit the loop if user chooses not to start
            } else {
                System.out.println("Invalid input. Please enter 'Y' or 'N'.");
            }
        }
        scan_main.close();
    }
}
