package ch10.ex10_6;

public class Triangle extends Shape{
    private int height;
    private int width;

    @Override
    double area() {
        double result = (double) (0.5 * height * width);
        return result;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
}
