/**
 * @author Ushakova Vladlena
 * @since 09/02/2019
 */
public class Main {
    public static void main(String[] args) {
        View view = new View();
        Model model = new Model();
        Controller controller = new Controller(model, view);

        controller.runTheGame();
    }
}