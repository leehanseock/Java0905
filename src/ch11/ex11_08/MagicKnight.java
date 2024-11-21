package ch11.ex11_08;

public class MagicKnight extends Knight implements Wizard{

    public int mp = 100;

    public MagicKnight(String name) {
        super(name);
    }

    @Override
    public void magicShield() {
        System.out.printf("[%s]가(이) 마법 결계를 쳤다.\n", name);
    }

    @Override
    public void teleport() {
        System.out.printf("[%s]가(이) 순간이동했다.\n", name);
    }

    @Override
    public void slash() {
        System.out.printf("[%s]의 마력이 깃든 베기 공격\n", name);
    }
}
