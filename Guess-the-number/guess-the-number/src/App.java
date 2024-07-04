import java.util.Random;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int origin = 1;
        int bound = 100;
        int numberRandom = random.nextInt(origin, bound);
        int attempts = 10;
        boolean numberCorrect = false;

        System.out.println("\n****************************");
        System.out.println("Welcome to Guess the number!");
        System.out.println("****************************");
        System.out.println("The enter number from 1 to 100: ");

        while(!numberCorrect && attempts > 0) {
            int enteredNumber = scanner.nextInt();
            if(enteredNumber < origin || enteredNumber > bound) {
                System.out.println("The number must be between " + origin + " and " + bound + ". Try again. You have (" + attempts + ") attempts left");
                continue;
            }
            if( enteredNumber == numberRandom) {
                numberCorrect = true;
            } else {
                attempts -= 1;
                if(enteredNumber > numberRandom) {
                    System.out.println(":) The number is lower. You have ("+ attempts + ") attempts left");
                } else {
                    System.out.println(":) The number is higher. You have ("+ attempts + ") attempts left");
                }
            }
        } 

        if(numberCorrect) {
            System.out.println("** You won!!! * Only (" + attempts + ") attempts left! The correct number was " + numberRandom);
        } else {
            System.out.println("X You lost! Better luck next time! The correct number was " + numberRandom);
        }
    }
}
