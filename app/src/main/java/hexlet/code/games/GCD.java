package hexlet.code.games;

import hexlet.code.Engine;


public class GCD  extends Engine {

    private int gcd(int a, int b) {
        if (b==0) return a;
        return gcd(b,a%b);
    }

    @Override
    public void nextQuestion() {
        int firstNumber = random.nextInt(100);
        int secondNumber = random.nextInt(100);

        this.setQuestion(String.format("%d %d", firstNumber, secondNumber));
        this.setAnswer(String.valueOf(gcd(firstNumber, secondNumber)));
    }

    @Override
    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }
}
