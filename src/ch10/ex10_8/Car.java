package ch10.ex10_8;

public class Car {
    private String name;

    public Car(String name) {
        this.name = name;
        System.out.printf("모델명 : %s\n", name);
    }

    public void move(){
        System.out.printf("%s가 부릉부릉~\n", name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
