//Q1.. NUMBER GAME
// 1. Generate a random number within a specified range, such as 1 to 100.
// 2. Prompt the user to enter their guess for the generated number.
// 3. Compare the user's guess with the generated number and provide feedback on whether the guess is correct, too high, or too low
// 4. Repeat steps 2 and 3 until the user guesses the correct number.
// You can incorporate additional details as follows:
// 5. Limit the number of attempts the user has to guess the number.
// 6. Add the option for multiple rounds, allowing the user to play again.
// 7. Display the user's score, which can be based on the number of attempts taken or rounds won.


import java.util.Scanner;
public class demo {


    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int chances = 8;
            int finals = 0;
            boolean playAgain = true;
            
            System.out.println("Welcome buddy!");
            System.out.println("Hey buddy, you have " + chances + " chances to win the game");
            
            while (playAgain) {
                int rand = getRandN(1, 100);
                boolean guess = false;
                
                for (int i = 0; i < chances; i++) {
                    System.out.println("Chance " + (i + 1) + ": Enter your guess");
                    int user = sc.nextInt();
                    
                    if (user == rand) {
                        guess = true;
                        finals += 1;
                        System.out.println("You Won it.");
                        break;
                    } else if (user > rand) {
                        System.out.println("Too High");
                    } else {
                        System.out.println("Too Low");
                    }
                }
                
                if (!guess) {
                    System.out.println("Sorry buddy. You lost the chances. The number was " + rand);
                }
                
                System.out.println("Do you want to play again (y/n)?");
                String pA = sc.next();
                playAgain = pA.equalsIgnoreCase("y");
            }
            
            System.out.println("That's it buddy, hope you enjoyed it");
            System.out.println("Here is your score: " + finals);
        }
    }

    public static int getRandN(int i, int j) {
        return (int) (Math.random() * (j - i + 1) + i);
    }
}

