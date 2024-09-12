package ch07.ex11;

public class Cylinder {
    private int radius;
    private int height;

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRadius() {
        return radius;
    }

    public int getHeight() {
        return height;
    }

    public double getVolume(int radius, int height){
        return Math.pow(radius, 2) * Math.PI * height;
    }

    public double getSurfaceArea(int radius, int height){
        double circleArea = Math.pow(radius, 2) * Math.PI;
        double rectangleArea = height*2*Math.PI *radius;
        return 2 * circleArea + rectangleArea;
    }

}
