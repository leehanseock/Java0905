package ch10.ex10_6;

public class Circle extends Shape{
    private int radius;

    @Override
    double area() {
        double result = Math.PI * radius * radius;
        return result;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
