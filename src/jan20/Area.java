package jan20;

public class Area {
    public int sqaurePerimeter(int x) {
        return 4 * x;
    }

    public int squareArea(int x) {
        return x * x;

    }

    public int rectanglePerimeter(int x, int y) {
        int perimeter = 2 * (x + y);
        return perimeter;
    }

    public int rectangleArea(int x, int y) {
        int area = x * y;
        return area;

    }

    public double circlePerimeter(int x) {
        double perimeter = 2 * 3.14 * x;
        return perimeter;

    }

    public double circleArea(int x) {
        double area = 3.14 * x * x;
        return area;

    }
}
