package ch10.ex10_4;

public class MainSquare {
    public static void main(String[] args) {
        //Object, Shape, Square 객체의 필드와 메소드를 접근할 수 있다.
        Square square = new Square();

        //Shape 객체의 필드와 메소드 접근이 가능하다.
        //(예외적으로 Square객체의 멤버-필드, 메소드-에 접근할 수도 있다.)
        Shape shape = new Square();
    }
}
