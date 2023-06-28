package hexlet.code.games;

import hexlet.code.Engine;


public class Even extends Engine {

    @Override
    public void nextQuestion() {
        int number = getRandom().nextInt(100);
        this.setQuestion(String.valueOf(number));
        this.setAnswer(number % 2 == 0 ? "yes" : "no");
    }

    @Override
    public String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
}
