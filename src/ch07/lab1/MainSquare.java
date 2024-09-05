package ch07.lab1;

public class MainSquare {
    public static void main(String[] args) {
        Square square = new Square();
        square.setLength(5);
        int area = square.area();

        System.out.printf("한 변의 길이가 %d㎝인 정사각형의 넓이는 %d㎠입니다.\n",
                square.getLength(),area);

        Square s2 = new Square();
        s2.setLength(7);
        int result2 = s2.area();
        System.out.printf("한 변의 길이가 %d㎝인 정사각형의 넓이는 %d㎠입니다.\n",
                s2.getLength(),result2);
    }
}
