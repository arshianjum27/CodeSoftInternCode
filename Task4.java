 											      //Task4
                                       //QUIZ APPLICATION 
package ArshiAnjum;
import java.util.Scanner;
class Question {
    String questionText;
    String[] options;
    int correctOption;

    Question(String questionText, String[] options, int correctOption) {
        this.questionText = questionText;
        this.options = options;
        this.correctOption = correctOption;
    }
}

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Question[] questions = {
            new Question("ISRO has partnered with which company to promote space-tech startups in India?",
                    new String[]{"[A] Tesla", "[B] Google", "[C] Microsoft", "[D] Apple"}, 2),
            new Question("Who is the only female Indian tennis player to win six grand slams, till date?",
                    new String[]{"[A] Sania Nehwal", "[B] Saina Mirza", "[C] Ankita Raina", "[D] Karman Kaur Thandi"}, 1),
            
        };

        int totalQuestions = questions.length;
        int score = 0;

        System.out.println("Welcome to the Current Affairs Quiz!!");

        for (int i = 0; i < totalQuestions; i++) {
            System.out.println("\nQuestion " + (i + 1) + "::  " + questions[i].questionText);
            for (String option : questions[i].options) {
                System.out.println(option);
            }

            System.out.print("Your answer (A/B/C/D): ");
            char userAnswer = scanner.next().charAt(0);
            int userChoice = userAnswer - 'A';

            if (userChoice == questions[i].correctOption) {
                System.out.println("Correct!!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is " + questions[i].options[questions[i].correctOption]);
            }
        }

        System.out.println("\nQuiz completed!!");
        System.out.println("Your score: " + score + " out of " + totalQuestions);

        scanner.close();
    }
}
