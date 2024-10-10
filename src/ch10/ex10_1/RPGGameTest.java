package ch10.ex10_1;

public class RPGGameTest {
    public static void main(String[] args) {
        Wizard w1 = new Wizard();
        w1.name = "도라에몽";
        w1.hp = 100;
        w1.mp = 100;
        w1.punch();
        w1.fireball();

        Knight k1 = new Knight();
        k1.name = "비실이";
        k1.hp = 60;
        k1.stamina = 30;
        k1.punch();
        k1.slash();
    }
}
