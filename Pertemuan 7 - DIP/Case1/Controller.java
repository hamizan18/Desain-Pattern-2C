package Case1;

public class Controller implements Movement, Interact, OpenMenu {
    @Override 
    public void moveUp() {
        System.out.println("Arrow Up");
    }

    @Override
    public void moveDown() {
        System.out.println("Arrow Down");
    }

    @Override
    public void moveLeft() {
        System.out.println("Arrow Left");
    }

    @Override
    public void moveRight() {
        System.out.println("Arrow Right");
    }

    @Override
    public void yes() {
        System.out.println("Enter");
    }

    @Override
    public void no() {
        System.out.println("Backspace");
    }

    @Override
    public void openMenu() {
        System.out.println("Escape");
    }
}
