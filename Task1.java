											//TASK1
										//Number game
package ArshiAnjum;
import java.util.Random;
import java.util.Scanner;
public class Task1 {

public static void main(String[] args) {
int min = 1; 
int max = 100;
int maxAttempts = 10; 

Scanner scanner = new Scanner(System.in);
Random random = new Random();
int score = 0;

System.out.println("Welcome to the Guess the Number Game!!");
System.out.println("You have " + maxAttempts + " attempts to guess the number between " + min + " and " + max + ".");

boolean playAgain = true;

while (playAgain) {
int randomNumber = random.nextInt(max - min + 1) + min;
int numberOfAttempts = 0;
System.out.println("\nNew round has started!!");

while (numberOfAttempts < maxAttempts) {
System.out.print("Enter your guess:: ");
int userGuess = scanner.nextInt();
numberOfAttempts++;

if (userGuess < randomNumber) {
System.out.println("Your guess is too low.");
} else if (userGuess > randomNumber) {
System.out.println("Your guess is too high.");
} else {
System.out.println("Congratulations!! You've guessed the number " + randomNumber + " correctly.");
score++;
break;
}

if (numberOfAttempts == maxAttempts) {
System.out.println("Sorry, you've run out of attempts. The number was " + randomNumber + ".");
} else {
System.out.println("Attempts left:: " + (maxAttempts - numberOfAttempts));
}
}
System.out.print("Do you want to play another round? (yes/no):: ");
String playAgainInput = scanner.next();
playAgain = playAgainInput.equalsIgnoreCase("yes");
}

System.out.println("\nGame Over!! Your total score is:: " + score);
scanner.close();
}

}
