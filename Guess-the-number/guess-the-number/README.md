# Guess the Number Game

This is a simple console-based "Guess the Number" game implemented in Java.

## How to Play

1. **Objective**: Guess the correct number between 1 and 100.

2. **Instructions**:
   - The game will prompt you to enter a number.
   - You have 10 attempts to guess the correct number.
   - After each guess, the game will inform you if your guess was too high or too low.
   - The game will also display the number of attempts remaining.

3. **Game Rules**:
   - The entered number must be between 1 and 100. If not, the game will prompt you to enter a valid number within this range.
   - If you guess the correct number within the given attempts, you win!
   - If you exhaust all your attempts without guessing correctly, you lose.

4. **Implementation Details**:
   - The game uses Java's `Scanner` class for user input and `Random` class for generating a random number.
   - It initializes a random number between 1 and 100 and allows the player to input their guesses.
   - After each guess, it checks if the guess is correct or provides feedback on whether the guess was too high or too low.
   - The game ends when the player guesses the correct number or runs out of attempts.

## How to Run

To run the game:
- Clone this repository.
- Compile the `App.java` file using `javac App.java`.
- Run the compiled file using `java App`.

## Example Gameplay

```
Enter a number from 1 to 100:

50
:) The number is higher. You have (9) attempts left.

750
The number must be between 1 and 100. Try again. You have (8) attempts left.

60
:) The number is higher. You have (7) attempts left.

70
:) The number is lower. You have (6) attempts left.

65
The number is higher. You have (5) attempts left.

68
:) The number is lower. You have (4) attempts left.

67
** You won!!! ** Only (3) attempts left! The correct number was 67.
```