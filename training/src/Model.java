/**
 * @author Ushakova Vladlena
 * @since 09/02/2019
 */

public class Model {
    private int rightAnswer;
    private int minRange;
    private int maxRange = 100;
    private String answersHistory;
    private StringBuilder builder = new StringBuilder();

    public Model(int rightAnswer, int minRange, int maxRange) {
        this.rightAnswer = rightAnswer;
        this.minRange = minRange;
        this.maxRange = maxRange;

    }

    public Model() {
    }


    public void guessNumber() {
        rightAnswer = (int) (Math.random() * 100);
    }


    public void gameHistory(int currentAnswer) {
        answersHistory = String.valueOf(builder.append(currentAnswer).append("; "));
    }


    public int getRightAnswer() {
        return rightAnswer;
    }

    public int getMinRange() {
        return minRange;
    }

    public void setMinRange(int minRange) {
        this.minRange = minRange;
    }

    public int getMaxRange() {
        return maxRange;
    }

    public void setMaxRange(int maxRange) {
        this.maxRange = maxRange;
    }

    public String getAnswersHistory() {
        return answersHistory;
    }

}
