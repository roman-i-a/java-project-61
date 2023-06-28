package hexlet.code.games;

import hexlet.code.Engine;


public final class GCD  extends Engine {

    private static final int MAX_NUM_GCD = 100;

    private int gcd(final int firstNum, final int secondNum) {
        if (secondNum == 0) {
            return firstNum;
        }
        return gcd(secondNum, firstNum % secondNum);
    }

    @Override
    public void nextQuestion() {
        int firstNumber = getRandom().nextInt(MAX_NUM_GCD);
        int secondNumber = getRandom().nextInt(MAX_NUM_GCD);

        this.setQuestion(String.format("%d %d", firstNumber, secondNumber));
        this.setAnswer(String.valueOf(gcd(firstNumber, secondNumber)));
    }

    @Override
    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }
}
