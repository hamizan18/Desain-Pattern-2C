package Case2;
public class Keyboard implements Movement, Interact, Qwerty, MouseAction {
    @Override
    public void moveDown() {
        System.out.println("Down Arrow Button clicked!\nMoving Down.. ");
    }
    
    @Override
    public void moveUp() {
        System.out.println("Up Arrow Button clicked!\nMoving Up.. ");
    }

    @Override
    public void moveRight() {
        System.out.println("Right Arrow Button clicked!\nMoving Right.. ");
    }

    @Override
    public void moveLeft() {
        System.out.println("Left Arrow Button clicked!\nMoving Left.. ");
    }

    @Override
    public void interact() {
        System.out.println("E Button clicked!\nInteracting.. ");
    }

    @Override 
    public void qwerty() {
        System.out.println("Button clicked!\nTyping.. ");
    }

    @Override
    public void mouseMove() {
        System.out.println("Aiming.. ");
    }
}