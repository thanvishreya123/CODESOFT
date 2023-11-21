import java.util.*;

class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rd = new Random();

        while (true) {
            int count = 0;
            int random = rd.nextInt(100) + 1;
            boolean isCorrect = false;

            while (count < 5 && !isCorrect) {
                System.out.println("Enter your guess.You have 5 attempts");
                int guess = scanner.nextInt();
                count++;

                if (random > guess) {
                    System.out.println("Your Guess is Too low");
                } else if (random < guess) {
                    System.out.println("Your Guess is Too high");
                } else {
                    System.out.println("Congrats its a Correct guess!");
                    System.out.println("Your Score: " + count);
                    isCorrect = true;
                }
            }

            System.out.println("Do you want to play again? (yes/no)");
            String playAgain = scanner.next().toLowerCase();

            if (!playAgain.equals("yes")) {
                System.out.println("Thank you for playing!");
                break;
            }
        }
    }
}
