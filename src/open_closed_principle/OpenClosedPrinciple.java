package open_closed_principle;

public class OpenClosedPrinciple {
    //USE CASE
    // vi ska ta ett vanligt exempel: att räkna ut area på olika former

    public static void main(String[] args) {

    }
}

class AreaCalculator {
    private void squareArea(Double height, Double width) {
        System.out.println(height * width);
    }

    private void circleArea(Double radius) {
        System.out.println(radius * radius * 3.14);
    }
}