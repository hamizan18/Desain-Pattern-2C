package Case1;

public class BaseGame {
    Controller controller;
    
    public BaseGame(Controller controller) {
        this.controller = controller;
    }

    public void play() {
        controller.moveUp();
        controller.moveDown();
        controller.moveLeft();
        controller.moveRight();
        controller.yes();
        controller.no();
        controller.openMenu();
    }
}
