package ch08;
class Hero{
    private String name;
    private int power;
    private int speed;

    public Hero(String name, int power) {
        this.name = name;
        this.power = power;
    }

    public Hero(String name, int power, int speed){
        this.name = name;
        this.power = power;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }

    public int getSpeed() {
        return speed;
    }

    public Hero(String name) {
        this.name = name;
    }


//    public String toString(){
//        return String.foramt("Hero{name: %s, power: %d, speed: %d}", name, power, speed);
//    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Hero{" +
                "name='" + name + '\'' +
                ", power=" + power +
                ", speed=" + speed +
                '}';
    }
}