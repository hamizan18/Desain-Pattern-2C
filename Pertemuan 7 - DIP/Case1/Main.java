package Case1;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();
        BaseGame game = new BaseGame(controller);
        game.play();
    }
}
