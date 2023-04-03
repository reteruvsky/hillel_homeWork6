package packageShape;

import java.util.ArrayList;

public interface GeometricShape {

    public double shapeArea(double firstVar, double secondVar);
}

class Circle implements GeometricShape {

    @Override
    public double shapeArea(double pi, double radius) {
        pi = Math.PI;
        return Math.pow(radius, 2.0) * pi;
    }
}

class Triangle implements GeometricShape {

    @Override
    public double shapeArea(double firstSide, double secondSide) {
        return (firstSide * secondSide) / 2;
    }
}

class Square implements GeometricShape {

    @Override
    public double shapeArea(double firstSide, double secondSide) {
        return firstSide * secondSide;
    }
}

class Main {
    public static void main(String[] args) {
        ArrayList<GeometricShape> array = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            array.add(new Circle());
            array.add(new Triangle());
            array.add(new Square());
        }
    }

    public void sumArea(ArrayList<GeometricShape> arrayList) {
        double sum = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            sum += arrayList.get(i).shapeArea(Math.random(), Math.random());
        }
        System.out.println(sum);
    }
}