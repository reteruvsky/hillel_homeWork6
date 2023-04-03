package shape;

public class Triangle implements GeometricShape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double shapeArea() {
        return 0.5 * base * height;
    }
}
