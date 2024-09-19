package ch08.ex8_5;

public class Student{
    // 공유(static) 영역 할당 : 클래스 변수
    static int count = 0;

    // 힙(non-static) 영역 할당 : 인스턴스 변수
    int id;
    String name;

    Student(int id, String name){
        Student.count++;
        this.id = id;
        this.name = name;
    }
}