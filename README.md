# rock-paper-scissors-saw
This Rock Paper Scissors Saw Text-Based Game is a simple game played in the terminal created with object-oriented programming using Java. It will simulate a Rock, Paper, Scissors, Saw game. There is a possibility of two human users. The computer will also be a user, thus equating a game played between 3 users, two being human. The game will begin by requesting the names of the users and then displaying a menu. At the end of the game, the game will display the winners based off of most won games. 


## High Level Overview of System Architecture
The four main components of Rock Paper Scissors Saw Text-Based Game: GameDriver class, Game class and Player class and Statistics class. Rock Paper Scissors Saw Text-Based Game is responsible for prompting and parsing user input data and running game. It creates an instance of GameDriver class and 3 instances of Game class. It then runs the player methods for the ability to store player information and statistics methods for storing statistics.


## Interfaces Description
Rock Paper Scissors Saw Text-Based Game will have text based interface with textual output and textual prompts where the user needs to type in a response.
When the program starts, the user gets prompted for names of both human players.
Valid input is input with characters greater than or equal to 5 characters and less than or equal to 20 characters.
On invalid input, user will get prompted to re-input name and error will read “Name must be between 5 and 20 characters!”  and upon inputting both human names as the same name, user will be prompted to input a different name for the second player with the error prompt reading, “Names cannot be the same for both players. Change name for second player:”.
After all inputs are correct, the user will be prompted to select from a menu consisting of 4 options: 1. : “1. Play game”, “2. Show game rules”, “3. Show statistics”, and “4. Exit” in that order.          
User must select from the menu. 

### Menu option 1 will allow the user to begin playing the game.
### Menu option 2 will display game rules for the user . The rules to display are as follows:
### Rock breaks scissors and Saw therefore rock wins over scissors and saw. Rock loses against paper.
### Scissors cut paper therefore scissors win over paper. Scissors lose against rock and Saw.
### Paper covers rock therefore paper wins over rock. Paper loses against scissors and saw
### Saw cuts through scissors and paper therefore saw wins over scissors and paper. Saw loses against rock.
### If player and computer make the same selection, there is a tie

### Menu option 3 will display how many games each player has played and how many wins each player has achieved. 
### Menu option 4 will exit from the game and return the user to the terminal. 
### Users, while playing game after having clicked option 1, will type the weapon of their choice into the terminal. If user types anything other than “rock”, “paper”, “scissors” or “saw”, game will prompt user to re-type their input and display error. 

## Screenshots Interface

![](https://ibb.co/CP7gNKr)
