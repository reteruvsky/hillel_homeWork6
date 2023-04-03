package shape;

public class SumArea {
    private double sumArea = 0;

    public double getSumArea(GeometricShape[] shapes) {
        for (GeometricShape arr: shapes) {
            sumArea += arr.shapeArea();
        }

        return sumArea;
    }
}
