package ch07.ex12;

public class Cube {
    private int length;

    public void setLength(int length) {
        this.length = length;
    }

    public int getLength() {
        return length;
    }
    public double getVolume(int length){
        return Math.pow(length, 3);
    }

    public double getSurface(int length){
        return 6 * Math.pow(length, 2);
    }
}
