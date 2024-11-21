package ch11.ex11_08;

public class Knight {
    public String name;
    public int hp = 100;

    public Knight(String name) {
        this.name = name;
    }

    public void slash(){
        System.out.printf("[%s]의 일반 베기 공격\n",name);
    }
}
