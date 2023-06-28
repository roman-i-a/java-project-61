package hexlet.code;


import java.util.Random;
import java.util.Scanner;

public abstract class Engine {
    protected final Random random = new Random();

    private String question = "Default question";
    private String answer = "Default answer";

    public abstract void nextQuestion();

    public void start(Scanner scanner, String username) {
        System.out.println(this.getRules());
        int score = 0;
        while (score < 3) {
            this.nextQuestion();

            System.out.printf("Question: %s\n", this.getQuestion());
            System.out.print("Your answer: ");
            String answer = scanner.nextLine();
            if (answer.equals(this.getAnswer())) {
                score++;
                System.out.println("Correct!");
                continue;
            }
            System.out.printf("'%s' is wrong answer ;(. Correct answer was '%s'.\nLet's try again, %s!\n\n",
                    answer, this.getAnswer(), username);
            return;
        }
        // Три правильных подряд -- победа
        System.out.printf("Congratulations, %s!\n\n", username);
    }

    public abstract String getRules();

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
