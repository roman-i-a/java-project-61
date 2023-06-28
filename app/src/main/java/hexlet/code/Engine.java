package hexlet.code;


import java.util.Random;
import java.util.Scanner;

public abstract class Engine {
    private static final int MAX_SCORE = 3;
    protected static final int MAX_NUMBER = 100;
    private final Random random = new Random();

    public final Random getRandom() {
        return random;
    }

    private String question = "Default question";
    private String answer = "Default answer";

    public abstract void nextQuestion();

    public final void start(final Scanner scanner, final String username) {
        System.out.println(this.getRules());
        int score = 0;
        while (score < MAX_SCORE) {
            this.nextQuestion();

            System.out.printf("Question: %s\n", this.getQuestion());
            System.out.print("Your answer: ");
            String userAnswer = scanner.nextLine();
            if (userAnswer.equals(this.getAnswer())) {
                score++;
                System.out.println("Correct!");
                continue;
            }
            System.out.printf(
                    """
                            '%s' is wrong answer ;(. Correct answer was '%s'.
                            Let's try again, %s!
                            """,
                    userAnswer, this.getAnswer(), username);
            return;
        }
        // Три правильных подряд -- победа
        System.out.printf("Congratulations, %s!\n\n", username);
    }

    public abstract String getRules();

    public final String getQuestion() {
        return question;
    }

    public final void setQuestion(final String value) {
        this.question = value;
    }

    public final String getAnswer() {
        return answer;
    }

    public final void setAnswer(final String value) {
        this.answer = value;
    }
}
