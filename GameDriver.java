import java.util.Scanner;

public class GameDriver {
    // Player name input length check
    public static boolean lengthCheck(int len) {
        int minimum = 5;
        int maximum = 20;
        return len >= minimum && len <= maximum;
    }

    public static void main(String[] args) {

        // Initialize the Scanner and print a welcome message
        Scanner in = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissor, Saw!");
        String playerOne;
        // Require Player One name input
        while (true) {
            System.out.print("What is the name of the first player?");
            playerOne = in.nextLine();
            // Player One name input length validation
            boolean playerOneInputLength = lengthCheck(playerOne.length());
            if (!playerOneInputLength) {
                System.out.println("Name must be between 5 and 20 characters!");
            } else {
                break;
            }
        }
        // Require Player Two name input
        String playerTwo = "not set";
        while (true) {
            System.out.print("What is the name of the second player?");
            playerTwo = in.nextLine();
            // Player Two name input length
            boolean playerTwoInputLength = lengthCheck(playerTwo.length());
            if (!playerTwoInputLength) {
                System.out.println("Name must be between 5 and 20 characters!");
                playerTwo = in.nextLine();
            }
            if (playerTwo.equals(playerOne)) {
                System.out.println("Names cannot be the same for both players. Change name for second player: ");
            } else {
                break;
            }
        }

        // Players array
        Player players[] = new Player[2];
        players[0] = new Player(playerOne, new Statistics());
        players[1] = new Player(playerTwo, new Statistics());

        Game game = new Game(players[0], players[1]);

        // Print Menu. Use a while(true) loop and only break the loop if the user wants
        // to quit
        while (true) {
            System.out.print(
                    "Select: 1. Play Game 2. Show Game Rules 3. Show Statistics 4. Quit ");
            String menuSelection = in.nextLine();
            if (menuSelection.equals("4")) {
                System.out.println("You have chosen to quit the game ");
                break;
            }
            if (menuSelection.equals("2")) {
                game.showRules();
            }
            if (menuSelection.equals("3")) {
                System.out.println(players[0].playerNames + " has played " + players[0].scores.gamesPlayed
                        + " and has won " + players[0].scores.gamesWon);
                System.out.println(players[1].playerNames + " has played " + players[1].scores.gamesPlayed
                        + " and has won " + players[1].scores.gamesWon);
                break;
            }
            if (menuSelection.equals("1")) {
                game.playGame();
                game.playGame();
                game.playGame();
            }
            // Print final winner
            if (players[0].scores.gamesWon > players[1].scores.gamesWon) {
                System.out.println(players[0].playerNames + " is the final winner!");
            } else {
                System.out.println(players[1].playerNames + " is the final winner!");
            }

        }

        // Print a final message for the user
        System.out.println("Thanks for playing Rock, Paper, Scissors or Saw!");
    }
}