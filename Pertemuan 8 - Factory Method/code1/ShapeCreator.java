package code1;

interface Shape {
    double area();

    void describe();
}

class Circle implements Shape {
    // TODO: Add a private field for radius (double)

    public Circle(double radius) {
        // TODO: Store the radius
    }

    @Override
    public double area() {
        // Return pi * radius * radius (use Math.PI)
        return 0;
    }

    @Override
    public void describe() {
        // TODO: Print "Circle with area: " followed by area() formatted to 2 decimal places
        // Hint: Use System.out.printf("Circle with area: %.2f%n", area())
    }
}

class Rectangle implements Shape {
    // TODO: Add private fields for width and height (double)
    public Rectangle(double width, double height) {
        // TODO: Store width * height
    }

    @Override
    public double area() {
        // TODO: Return width * height
        return 0;
    }

    @Override
    public void describe() {
        // TODO: Return width * height
    }
}

class Triangle implements Shape {
    // TODO: Add private fields for base and height (double)
    public Triangle(double base, double height) {
        // TODO: Store base and height
    }

    @Override
    public double area() {
        // TODO: Print "Triangle with are: " followed by area() formatted to 2 decimal places
        return 0;
    }

    @Override
    public void describe() {
        // TODO: Print "Triangle with area: " followed by area() formatted to 2 decimal places
    }
}

abstract class ShapeCreator {
    // Factpry method - subclasses decide which Shape to create
    public abstract Shape createShape();

    public void describe() {
        // TODO: Call createShape() to get a Shape instance
        // TODO: Call describe() on the shape
    }
}

class CircleCreator extends ShapeCreator {
    @Override
    public Shape createShape() {
        // TODO: Return a new Circle with radius 5
        return null;
    }
}

class RectangleCreator extends ShapeCreator {
    @Override
    public Shape createShape() {
        // TODO: Return a new Rectangle with width 4 and height 6
        return null;
    }
}

// Tambah sendiri karna ga enak dipandang merah merah:'
class TriangleCreator extends ShapeCreator {
    @Override
    public Shape createShape() {
        // 
        return null;
    }
}