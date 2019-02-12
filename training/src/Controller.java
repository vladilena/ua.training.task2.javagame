/**
 * @author Ushakova Vladlena
 * @since 09/02/2019
 */

import java.util.Scanner;

public class Controller {
    private Model model;
    private View view;

    public Controller() {
    }

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void runTheGame() {
        Scanner sc = new Scanner(System.in);
        view.showMessage(view.START_GAME);
        model.setMinRange(GlobalConstants.INITIAL_MIN);
        model.setMaxRange(GlobalConstants.INITIAL_MAX);
        model.createRightAnswer();
        while (model.gameLogic(checkInput(sc))) {
            lessOrMoreMessage();
        }
        view.showMessage(view.WINNING_MESSAGE + view.SPACE_SIGN + model.getRightAnswer());
        view.showMessage(view.HISTORY + view.SPACE_SIGN + model.gameHistory);
    }


    private void lessOrMoreMessage() {
        if (model.lessOrMore.equals(GlobalConstants.BIGGER_NUMBER)) {
            view.showMessage(view.LESS_MESSAGE);
        } else if (model.lessOrMore.equals(GlobalConstants.LESS_NUMBER)) {
            view.showMessage(view.MORE_MESSAGE);
        }
    }


    private int checkInput(Scanner sc) {
        int currentAnswer = 0;
        do {
            view.showMessage(view.INIT_MESSAGE + view.SPACE_SIGN + model.getMinRange() + view.SPACE_SIGN + view.DASH_SIGN + view.SPACE_SIGN + model.getMaxRange() + view.SPACE_SIGN + view.INCLUSIVE_OR_NOT);
            while (!sc.hasNextInt()) {
                view.showMessage(view.NOT_A_NUMBER_MESSAGE);
                view.showMessage(view.INIT_MESSAGE + view.SPACE_SIGN + model.getMinRange() + view.SPACE_SIGN + view.DASH_SIGN + view.SPACE_SIGN + model.getMaxRange() + view.SPACE_SIGN + view.INCLUSIVE_OR_NOT);
                sc.next();
            }
            currentAnswer = sc.nextInt();
        } while (currentAnswer > model.getMaxRange() || currentAnswer < model.getMinRange());
        return currentAnswer;
    }
}
