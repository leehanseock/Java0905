package ch10.ex10_6;

public class Square extends Shape {
    private int width;

    @Override
    double area() {
        double result = width * width;
        return result;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
