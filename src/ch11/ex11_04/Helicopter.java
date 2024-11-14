package ch11.ex11_04;

public class Helicopter implements Flyable{

    @Override
    public void fly() {
        System.out.println("헬리콥터는 시끄럽게 날아간다.");
    }
}
