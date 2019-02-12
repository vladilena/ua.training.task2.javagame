import java.util.ArrayList;
import java.util.List;

/**
 * @author Ushakova Vladlena
 * @since 09/02/2019
 */

public class Model {
    private int rightAnswer;
    private int minRange;
    private int maxRange;
    List<Integer> gameHistory = new ArrayList<>();
    String lessOrMore;

    public Model(int rightAnswer, int minRange, int maxRange) {
        this.rightAnswer = rightAnswer;
        this.minRange = minRange;
        this.maxRange = maxRange;

    }

    public Model() {
    }

    //range is from 1 to 99
    public void createRightAnswer() {
        rightAnswer = (int) (Math.random() * (maxRange - minRange - 2) + minRange + 1);
    }


    public boolean gameLogic(int currentAnswer) {
        saveGameHistory(currentAnswer);

        boolean res = true;
        if (currentAnswer == rightAnswer) {
            res = false;
        } else if (currentAnswer > rightAnswer) {
            maxRange = currentAnswer;
            lessOrMore = GlobalConstants.BIGGER_NUMBER;
        } else {
            minRange = currentAnswer;
            lessOrMore = GlobalConstants.LESS_NUMBER;
        }
        return res;
    }


    public void saveGameHistory(int currentAnswer) {
        gameHistory.add(currentAnswer);
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

}
