package code2;

public class ShapeFactoryDemo {
    public static void main(String[] args) {
        ShapeCreator creator;

        creator = new CircleCreator();
        creator.describe();

        creator = new RectangleCreator();
        creator.describe();

        creator = new TriangleCreator();
        creator.describe();
    }
}
