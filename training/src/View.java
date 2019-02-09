/**
 * @author Ushakova Vladlena
 * @since 09/02/2019
 */
public class View {
    public final String START_THE_GAME = "You must guess the number in range from 0 to 100!";
    public final String INIT_MESSAGE = "Input the number in range ";
    public final String LESS_MESSAGE = "It`s less than ";
    public final String MORE_MESSAGE = "It`s more than ";
    public final String WINNING_MESSAGE = "You're right! It`s ";
    public final String NOT_A_NUMBER_MESSAGE = "It`s not a number!";
    public final String WRONG_RANGE_MESSAGE = "This number not in range. Try again";
    public final String HISTORY = "Your game history is ";

    public void showMessage(String message) {
        System.out.println(message);
    }
}