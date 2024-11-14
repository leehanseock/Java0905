package ch11.ex11_04;

public class Rocket implements Flyable{

    @Override
    public void fly() {
        System.out.println("로켓이 굉음을 내면서 발사되었다.");
    }
}
