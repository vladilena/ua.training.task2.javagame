/**
 * @author Ushakova Vladlena
 * @since 09/02/2019
 */

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;
    private int currentAnswer;

    public Controller() {
    }

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void runTheGame() {
        Scanner sc = new Scanner(System.in);
        model.guessNumber();
        view.showMessage(view.START_THE_GAME);
        gameLogic(sc);
        view.showMessage(view.HISTORY + model.getAnswersHistory());

    }

    private void gameLogic(Scanner sc) {

        while ((currentAnswer = inputValue(sc)) != model.getRightAnswer()) {
            model.gameHistory(currentAnswer);
            if (currentAnswer > model.getMaxRange() || currentAnswer < model.getMinRange()) {
                view.showMessage(view.WRONG_RANGE_MESSAGE);
                view.showMessage(view.INIT_MESSAGE + model.getMinRange() + " - " + model.getMaxRange());
            } else if (currentAnswer > model.getRightAnswer()) {
                model.setMaxRange(currentAnswer);
                view.showMessage(view.LESS_MESSAGE + currentAnswer);
                view.showMessage(view.INIT_MESSAGE + model.getMinRange() + " - " + model.getMaxRange());
            } else if (currentAnswer < model.getRightAnswer()) {
                model.setMinRange(currentAnswer);
                view.showMessage(view.MORE_MESSAGE + currentAnswer);
                view.showMessage(view.INIT_MESSAGE + model.getMinRange() + " - " + model.getMaxRange());
            }
        }

        view.showMessage(view.WINNING_MESSAGE + currentAnswer);
        model.gameHistory(currentAnswer);
    }

    private int inputValue(Scanner sc) {
        while (!sc.hasNextInt()) {
            view.showMessage(view.NOT_A_NUMBER_MESSAGE);
            view.showMessage(view.INIT_MESSAGE + model.getMinRange() + " - " + model.getMaxRange());
            sc.next();
        }
        return sc.nextInt();
    }


}

