package ch10.ex10_9;

public class MainAnimal {
    public static void main(String[] args) {
       //추상클래스는 new 연산자로 객체 생성이 불가능하다.
        // Animal animal =new Animal();

        Dog dog = new Dog();
        Cat cat = new Cat();

        dog.setName("스누피");
        dog.cry("왈왈");
        dog.eat("사료");
        dog.sleep(10);
        System.out.println();
        cat.setName("도라에몽");
        cat.eat("단팥빵");
        cat.cry("찡구야!");
        cat.sleep(18);

        // 추상 클래스로 업캐스팅하면 오버라이딩한 메소드와 추상 클래스에 정의된 메소드들도 사용할 수 있습니다
        Animal animal = new Dog();
        animal.sleep(5);
    }
}