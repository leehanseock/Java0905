package ch08.ex8_4;

public class Avenger {
    private String name;
    private int healthPower;

    public Avenger(String name, int healthPower) {
        this.name = name;
        this.healthPower = healthPower;
    }

    public String getName() {
        return name;
    }

    public void setHealthPower(int healthPower) {
        this.healthPower = healthPower;
    }

    public int getHealthPower() {
        return healthPower;
    }

    public void punch(Avenger enemy) {
        System.out.printf("%s의 냥냥펀치! ", getName());
        enemy.setHealthPower(enemy.getHealthPower()-10);
        System.out.printf("-> %s는 %d로 체력이 감소했다.\n", enemy.getName(), enemy.getHealthPower());
    }
}
