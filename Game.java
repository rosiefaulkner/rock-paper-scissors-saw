import java.util.Scanner;

public class Game {

    Player playerOne;
    Player playerTwo;
    Scanner in;

    // Create a class constructor for the Game class
    public Game(Player player1, Player player2) {
        in = new Scanner(System.in);
        playerOne = player1;
        playerTwo = player2;
    }

    public void showRules() {
        System.out.print(
                "Rule 1: Rock breaks scissors and Saw therefore rock wins over scissors and saw. Rock loses against paper. \n");
        System.out.print(
                "Rule 2: Scissors cut paper therefore scissors win over paper. Scissors lose against rock and Saw. \n");
        System.out.print(
                "Rule 3: Paper covers rock therefore paper wins over rock. Paper loses against scissors and saw. \n");
        System.out.print(
                "Rule 4: Saw cuts through scissors and paper therefore saw wins over scissors and paper. Saw loses against rock. \n");
        System.out.print(
                "Rule 5: If player and computer make the same selection, there is a tie. \n");
    }

    public void finalWinner(){
        if(playerTwo.scores.gamesWon < playerOne.scores.gamesWon){
            System.out.println("Winner is " + playerOne.scores.gamesWon + "!");
        }else if(playerTwo.scores.gamesWon > playerOne.scores.gamesWon){
            System.out.println("Winner is " + playerTwo.scores.gamesWon + "!");
        }else{
            System.out.println("Winner is the Computer!");
        }
    }

    public void playGame() {
        playerOne.scores.gamesPlayed++;
        playerTwo.scores.gamesPlayed++;
        // Get the user's move through user input
        System.out.print(
                "What is your move, " + playerOne.playerNames
                        + "? To make a move, enter rock, paper, scissors or saw. ");
        String playerOneMove = in.nextLine();

        if (!playerOneMove.equals("rock") && !playerOneMove.equals("paper") && !playerOneMove.equals("scissors")
                && !playerOneMove.equals("saw")) {

            System.out.println("Your move isn't valid! ");
            playerOneMove = in.nextLine();
        }

        System.out.print(
                "What is your move, " + playerTwo.playerNames
                        + "? To make a move, enter rock, paper, scissors or saw. ");
        String playerTwoMove = in.nextLine();

        // Check if the user's move is valid (rock, paper, or scissors)
        if (!playerTwoMove.equals("rock") && !playerTwoMove.equals("paper") && !playerTwoMove.equals("scissors")
                && !playerTwoMove.equals("saw")) {

            System.out.println("Your move isn't valid! ");
            playerTwoMove = in.nextLine();

        } else {

            // Get a random number in between 0 and 3 and convert it to an integer so that
            // the possibilities are 0, 1, or 2
            int rand = (int) (Math.random() * 3);

            // Convert the random number to a string using conditionals and print the
            // opponent's move
            String computerMove = "";
            if (rand == 0) {
                computerMove = "rock";
            } else if (rand == 1) {
                computerMove = "paper";
            } else if (rand == 2) {
                computerMove = "saw";
            } else {
                computerMove = "scissors";
            }
            System.out.println("Computer's move: " + computerMove);

            // Print the results of the game: tie, lose, win
            if (playerOneMove.equals(computerMove) && playerTwoMove.equals(computerMove)) {
                System.out.println("It's a tie!");
            } else if (playerOneMove.equals("rock") && playerTwoMove.equals("saw")
                    && computerMove.equals("scissors")
                    || playerOneMove.equals("rock") && computerMove.equals("saw")
                            && playerTwoMove.equals("scissors")
                    || playerOneMove.equals("scissors") && playerTwoMove.equals("paper")
                            && computerMove.equals("paper")
                    || playerOneMove.equals("scissors") && computerMove.equals("paper")
                            && playerTwoMove.equals("paper")
                    || playerOneMove.equals("paper") && playerTwoMove.equals("rock") && computerMove.equals("rock")
                    || playerOneMove.equals("paper") && computerMove.equals("rock") && playerTwoMove.equals("rock")
                    || playerOneMove.equals("saw") && playerTwoMove.equals("scissors")
                            && computerMove.equals("paper")
                    || playerOneMove.equals("saw") && computerMove.equals("scissors")
                            && playerTwoMove.equals("paper")) {
                System.out.println(playerOne.playerNames + ": You won!");
                playerOne.scores.gamesWon++;

            } else if (playerTwoMove.equals("rock") && playerOneMove.equals("saw")
                    && computerMove.equals("scissors")
                    || playerTwoMove.equals("rock") && computerMove.equals("saw")
                            && playerOneMove.equals("scissors")
                    || playerTwoMove.equals("scissors") && playerOneMove.equals("paper")
                            && computerMove.equals("paper")
                    || playerTwoMove.equals("scissors") && computerMove.equals("paper")
                            && playerOneMove.equals("paper")
                    || playerTwoMove.equals("paper") && playerOneMove.equals("rock") && computerMove.equals("rock")
                    || playerTwoMove.equals("paper") && computerMove.equals("rock") && playerOneMove.equals("rock")
                    || playerTwoMove.equals("saw") && playerOneMove.equals("scissors")
                            && computerMove.equals("paper")
                    || playerTwoMove.equals("saw") && computerMove.equals("scissors")
                            && playerOneMove.equals("paper")) {
                System.out.println(playerTwo.playerNames + ": You won!");
                playerTwo.scores.gamesWon++;
            } else {
                System.out.println("Computer won!");
            }

        }

    }
}
