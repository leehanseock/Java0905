package ch08.ex8_5;

public class MainStudent {
    public static void main(String[] args) {
        Student s1 = new Student(240111262, "Lee");
        Student s2 = new Student(240000000, "Choi");
        Student s3 = new Student(240000001, "Park");
        System.out.printf("생성된 Student 객체의 개수 : %d개",Student.count);
    }
}
