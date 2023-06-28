package hexlet.code.games;

import hexlet.code.Engine;


public class Calc extends Engine {

    @Override
    public void nextQuestion() {
        int firstNumber = random.nextInt(100);
        int secondNumber = random.nextInt(100);
        switch (random.nextInt(3)) {
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
        }

    }

    @Override
    public String getRules() {
        return "What is the result of the expression?";
    }


}
