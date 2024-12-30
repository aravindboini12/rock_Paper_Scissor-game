# Rock-Paper-Scissors Game in Java

This project is a simple console-based implementation of the classic Rock-Paper-Scissors game written in Java. Players can play against the computer, and the winner is determined based on standard rules.


## Features

- **Random Computer Choice**: The computer randomly selects Paper, Rock, or Scissors.
- **User Input Validation**: Ensures valid inputs (1, 2, or 3) from the user.
- **Game Logic**: Determines the winner or if it's a draw.
- **Simple and Interactive Console Interface**: Outputs choices and the result of the game.

## How to Play

1. **Rules**:
   - **Paper (1)** beats **Rock (2)**.
   - **Rock (2)** beats **Scissors (3)**.
   - **Scissors (3)** beats **Paper (1)**.
   - If both players choose the same option, it’s a draw.

2. **Gameplay**:
   - The player enters a number corresponding to their choice:
     - `1` for Paper
     - `2` for Rock
     - `3` for Scissors
   - The computer also makes its choice, and the winner is displayed.


## Sample Output

```text
Enter 1 for Paper, 2 for Rock, and 3 for Scissors: 
2
Computer chose: Paper
You chose: Rock
You lost the game!

---

## Code Overview

### Classes and Methods

1. **`Game` Class**:
   - Handles game logic, including computer's choice, user input, and determining the result.
   - Methods:
     - `computer()`: Randomly generates the computer's choice.
     - `userNumber()`: Accepts and validates user input.
     - `playGame()`: Compares the choices and prints the result.

2. **`RockPaperScissors` Class**:
   - Entry point for the program (`main` method).
   - Creates a `Game` object and calls the necessary methods.


Feel free to fork the repository, raise issues, or suggest new features! 😊
