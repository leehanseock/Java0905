package ch10.ex10_9;

public class Dog extends Animal{
    private String name = "바둑이";

    @Override
    public void eat(String food) {
        System.out.println(getName() + "가(이) " +food+"를 먹는다");
    }

    @Override
    public void cry(String sound) {
        System.out.println(getName() + "가(이) " +sound+" 짖는다.");
    }

    public void wag(){
        System.out.println(getName()+"가(이) 꼬리를 친다.");
    }
}
