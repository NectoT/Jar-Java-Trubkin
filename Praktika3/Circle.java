package Praktika3;

public class Circle {

    Circle(double radius) {
        this.radius = radius;
    }

    private final double radius;

    public double getRadius() {
        return radius;
    }

    public double getDiameter() {
        return this.radius * 2;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getLength() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) { // for testing purposes
        Circle circle = new Circle(4);

        if (circle.getRadius() != 4) {
            return;
        }
        if (circle.getDiameter() != 8) {
            return;
        }
        if (circle.getLength() != 8 * Math.PI) {
            return;
        }
        if (circle.getArea() != 16 * Math.PI) {
            return;
        }

        System.out.println("All is well");
    }

}
