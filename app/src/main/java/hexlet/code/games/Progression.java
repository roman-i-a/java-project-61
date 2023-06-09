package hexlet.code.games;

import hexlet.code.Engine;


public final class Progression extends Engine {
    private static final int MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 10;
    private static final int MAX_STEP = 15;
    private static final int MAX_START_VALUE = 15;

    @Override
    public void nextQuestion() {
        int length = getRandom().nextInt(MIN_LENGTH, MAX_LENGTH);
        int step = getRandom().nextInt(MAX_STEP);
        int position = getRandom().nextInt(length);
        int value = getRandom().nextInt(MAX_START_VALUE);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            if (i == position) {
                sb.append(".. ");
                this.setAnswer(String.valueOf(value));
                value += step;
                continue;
            }
            sb.append(value);
            sb.append(" ");
            value += step;
        }
        this.setQuestion(sb.toString());
    }

    @Override
    public String getRules() {
        return "What number is missing in the progression?";
    }
}
