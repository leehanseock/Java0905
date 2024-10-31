package ch10.ex10_5;

public class MainArcher {
    public static void main(String[] args) {
        Archer archer = new Archer();
        MasterArcher masterArcher = new MasterArcher();
        Archer archer2 = new MasterArcher();
        Archer archer3 = (Archer) new MasterArcher(); // 자식클래스로 객체 생성해놓고 부모클래스로 업캐스팅
        archer.shoot();
        masterArcher.shoot(); // 오버라이딩된 메소드가 호출됨
        archer2.shoot(); // 오버라이딩된 메소드가 호출됨
        archer3.shoot(); // 업캐스팅을 해도 오버라이딩된 메소드가 호출됨
    }
}
