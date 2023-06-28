package hexlet.code.games;

import hexlet.code.Engine;

public final class Prime extends Engine {

    private boolean isPrime(final int number) {
        for (int i = 2; i < number / 2 + 1; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    @Override
    public void nextQuestion() {
        int number = getRandom().nextInt(MAX_NUMBER);
        this.setQuestion(String.valueOf(number));
        this.setAnswer(isPrime(number) ? "yes" : "no");
    }

    @Override
    public String getRules() {
        return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
    }
}
