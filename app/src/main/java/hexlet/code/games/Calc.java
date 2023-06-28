package hexlet.code.games;

import hexlet.code.Engine;


public final class Calc extends Engine {

    private static final int MAX_NUM = 100;
    private static final int TOTAL_OPERATIONS = 3;

    @Override
    public void nextQuestion() {
        int firstNumber = random.nextInt(MAX_NUM);
        int secondNumber = random.nextInt(MAX_NUM);
        switch (random.nextInt(TOTAL_OPERATIONS)) {
            case 0 -> {
                this.setQuestion(firstNumber + " - " + secondNumber);
                this.setAnswer(String.valueOf(firstNumber - secondNumber));
            }
            case 1 -> {
                this.setQuestion(firstNumber + " + " + secondNumber);
                this.setAnswer(String.valueOf(firstNumber + secondNumber));
            }
            case 2 -> {
                this.setQuestion(firstNumber + " * " + secondNumber);
                this.setAnswer(String.valueOf(firstNumber * secondNumber));
            }
            default -> {
            }
        }

    }

    @Override
    public String getRules() {
        return "What is the result of the expression?";
    }


}
