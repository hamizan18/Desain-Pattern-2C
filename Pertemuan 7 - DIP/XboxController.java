public class XboxController implements XAccesibility, Xyba, Analog, Movement, LRButton, Home {
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
    public void homeButton() {
        System.out.println("Back to home screen");
    }

    @Override
    public void shareButton() {
        System.out.println("Choose where to share");
    }

    @Override
    public void viewButton() {
        System.out.println("View button pressed");
    }

    @Override
    public void menuButton() {
        System.out.println("Opened menu");
    }

    @Override
    public void YButton() {
        System.out.println("Y Button clicked!\nCharacter Jumping.. ");
    }

    @Override
    public void XButton() {
        System.out.println("X Button clicked!\nCharacter Dodging.. ");
    }

    @Override
    public void AButton() {
        System.out.println("A Button clicked!\nCharacter Slashing.. ");
    }

    @Override
    public void BButton() {
        System.out.println("B Button clicked!\nCharacter Defending.. ");
    }

    @Override
    public void leftAnalog() {
        System.out.println("Changing Character Movement.. ");
    }

    @Override
    public void rightAnalog() {
        System.out.println("Changing Camera Angle.. ");
    }

    @Override
    public void L1Button() {
        System.out.println("Changing Weapon.. ");
    }

    @Override
    public void R1Button() {
        System.out.println("Shooting!");
    }

    @Override
    public void L2Button() {
        System.out.println("Ultimate Activated!");
    }

    @Override
    public void R2Button() {
        System.out.println("Filling Stamina.. ");
    }
}
