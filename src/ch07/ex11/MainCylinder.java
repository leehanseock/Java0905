package ch07.ex11;

public class MainCylinder {
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setRadius(4);
        c.setHeight(5);
        int h = c.getHeight();
        int r = c.getRadius();
        System.out.printf("원기둥의 부피: %.2f\n", c.getVolume(r,h));
        System.out.printf("원기둥의 겉넓이: %.2f\n", c.getSurfaceArea(r,h));
    }
}
