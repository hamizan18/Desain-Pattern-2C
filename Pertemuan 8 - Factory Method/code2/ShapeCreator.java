package code2;

interface Shape {
    double area();
    void describe();
}

class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI * radius * radius;
    }

    @Override
    public void describe() {
        System.out.printf("Circle with area: %.2f%n", area());
    }
}

class Rectangle implements Shape {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double area() {
        return width * height;
    }

    @Override
    public void describe() {
        System.out.printf("Rectangle with area: %.2f%n", area());
    }
}

class Triangle implements Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public void describe() {
        System.out.printf("Triangle with area: %.2f%n", area());
    }
}

abstract class ShapeCreator {
    // Factoru method - subclasses decide which Shape to create
    public abstract Shape createShape();

    public void describe() {
        Shape shape = createShape();
        shape.describe();
    }
}

class CircleCreator extends ShapeCreator {
    @Override
    public Shape createShape() {
        return new Circle(5);
    }
}

class RectangleCreator extends ShapeCreator {
    @Override
    public Shape createShape() {
        return new Rectangle(4, 6);
    }
}

class TriangleCreator extends ShapeCreator {
    @Override
    public Shape createShape() {
        return new Triangle(3, 8);
    }
}