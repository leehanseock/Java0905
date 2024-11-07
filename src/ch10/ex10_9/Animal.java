package ch10.ex10_9;

// 추상클래스 : 자식클래스를 표준화(특정 기능을 반드시 갖도록 하기 위함)시키기 위해
abstract public class Animal {
    private String name;

    // 실제 이 클래스에서 구현은 하지않고 날 상속받으면 반드시 eat이라는 메소드를 정의해야한다고 정해주는것
    public abstract void eat(String food);
    public abstract void cry(String sound);

    public void sleep(int hours){
        System.out.printf("%s는 %d시간 동안 쿨쿨해~zzz\n", name, hours);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
