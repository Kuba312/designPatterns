package singleton;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    private int score = 0;

    private final int[] numbers = new int[9];
    Scanner scanner = new Scanner(System.in);


    private final static GuessGame instance = new GuessGame();

    private GuessGame(){
    }

    public int getScore() {
        return score;
    }

    public static GuessGame getInstance() {
        return instance;
    }

    public void play() {
        for (int number : numbers) {
            score = new Random().nextInt(numbers.length);

            System.out.println("Guess a number: ");
            int guess = scanner.nextInt();

            if (score == guess) {
                System.out.println("Well done!");
                score++;

            } else {
                System.out.println("I am so sorry, i think about " + score);
            }
        }
    }


}
