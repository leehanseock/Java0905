package ch07.lab1;

public class Square {
    private int length;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int area(){
        int result = (int)Math.pow(length,2);
        return result;
    }
}
