public class Keyboard implements Movement {
    @Override
    public void moveDown() {
        System.out.println("Move Down");
    }
    
    @Override
    public void moveUp() {
        System.out.println("Move Up");
    }

    @Override
    public void moveRight() {
        System.out.println("Move Right");
    }

    @Override
    public void moveLeft() {
        System.out.println("Move Left");
    }
}
