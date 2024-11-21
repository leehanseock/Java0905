package ch11.ex11_08;

public class MainGameSimulation {
    public static void main(String[] args) {
        Knight aragon = new Knight("Aragon");
        Knight arthur = new MagicKnight("Arthur");
        Knight merline = new HolyKnight("Merline");

        aragon.slash();
        arthur.slash();
        merline.slash();

        //다운캐스팅
        Healer healer1 = (HolyKnight) merline;

        Healer healer2 = new HolyKnight("Arathorn");

        //Healer 인터페이스의 참조변수이므로 Healer 인터페이스를 통해 구현된 메소드만 호출할 수 있다.
        healer1.heal();
        healer1.recovery();
//        healer1.slash();

        Wizard wizard1 = (Wizard) arthur;
        wizard1.magicShield();
        wizard1.teleport();

        MagicKnight magicKnight = new MagicKnight("Gandalf");
        magicKnight.magicShield();
        magicKnight.teleport();
        magicKnight.slash();
    }
}
