package ch08.ex8_4;

public class MainAvenger {

    public static void main(String[] args) {
        Avenger mango = new Avenger("맹고", 40);
        Avenger thanos = new Avenger("타노스", 200);
        mango.punch(thanos);
        mango.punch(thanos);
        thanos.punch(mango);
    }
}
