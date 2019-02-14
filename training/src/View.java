/**
 * @author Ushakova Vladlena
 * @since 09/02/2019
 */
public class View {
    public final String SPACE_SIGN = " ";
    public final String DASH_SIGN = "-";
    public final String INIT_MESSAGE = "Input the number in range";
    public final String LESS_MESSAGE = "It`s less!";
    public final String MORE_MESSAGE = "It`s bigger!";
    public final String WINNING_MESSAGE = "You're right! It`s";
    public final String NOT_A_NUMBER_MESSAGE = "It`s not a number!";
    public final String HISTORY = "Your game history is";
    public final String INCLUSIVE_OR_NOT = "(non-inclusive)";
    public final String START_GAME = "In this game you must guess the number. Program will help you with prompts 'less' or 'bigger'";
    public final String INPUT_RANGES = "Please, input the range:";
    public final String FROM = "from";
    public final String TO = "to";


    public void showMessage(String message) {
        System.out.println(message);
    }
}