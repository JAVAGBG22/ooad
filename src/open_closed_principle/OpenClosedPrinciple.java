package open_closed_principle;

public class OpenClosedPrinciple {
    //USE CASE
    // vi ska ta ett vanligt exempel: att räkna ut area på olika former

    public static void main(String[] args) {

    }
}

class AreaCalculator {
    private Shape shape;

    public void calculate() {
        shape.calculate();
    }

   /* private void squareArea(Double height, Double width) {
        System.out.println(height * width);
    }

    private void circleArea(Double radius) {
        System.out.println(radius * radius * 3.14);
    }*/
}

interface Shape {
    void calculate();
}

class Rectangle implements Shape {
    private double height;

    private double width;

    @Override
    public void calculate() {
        System.out.println(height * width);
    }
}

class Circle implements Shape {
    private double radius;

    @Override
    public void calculate() {
        System.out.println(radius * radius * 3.14);
    }
}













