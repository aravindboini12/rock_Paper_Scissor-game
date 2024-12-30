import java.util.Random;
import java.util.Scanner;

class Game {
    private int randomNo;
    private int userInput;

    void computer() {
        Random rand = new Random();
        randomNo = rand.nextInt(3) + 1;
    }

    void userNumber() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 for Paper, 2 for Rock, and 3 for Scissors: ");
            userInput = sc.nextInt();
            if (userInput >= 1 && userInput <= 3) {
                break;
            } else {
                System.out.println("Invalid input! Please enter 1, 2, or 3.");
            }
        }
        sc.close();
    }

    void playGame() {
        System.out.print("Computer chose: ");
        switch (randomNo) {
            case 1 -> System.out.println("Paper");
            case 2 -> System.out.println("Rock");
            case 3 -> System.out.println("Scissors");
        }

        System.out.print("You chose: ");
        switch (userInput) {
            case 1 -> System.out.println("Paper");
            case 2 -> System.out.println("Rock");
            case 3 -> System.out.println("Scissors");
        }

        if (userInput == randomNo) {
            System.out.println("It's a draw!");
        } else if ((userInput == 1 && randomNo == 2) || 
                   (userInput == 2 && randomNo == 3) || 
                   (userInput == 3 && randomNo == 1)) {
            System.out.println("You won the game!");
        } else {
            System.out.println("You lost the game!");
        }
    }
}

public class RockPaperScissors {
    public static void main(String[] args) {
        Game game = new Game();
        game.computer();
        game.userNumber();
        game.playGame();
    }
}
