package ch11.ex11_010203;

public class Main_iPhone {
    public static void main(String[] args) {
        //업캐스팅된 경우 참조변수(좌변)는 부모의 것을 사용할 수 있고 자식의 것은 오버라이딩된 것만 사용할 수 있다.
        Phone p = new iPhone();
        p.call("01095081358");
        p.receive("01095081358");
        System.out.printf("제조사명 : %s\n", p.PRODUCT_NAME);
        System.out.println();

        iPhone iPhone1 = new iPhone();
        iPhone1.call("01095081358");
        iPhone1.receive("01095081358");
        iPhone1.beep();
        iPhone1.playMusic("APT");
        iPhone1.receiveAirDrop("연락처");
        iPhone1.sendAirDrop("사진");
        iPhone1.sendMessage("수능대박");
        System.out.println();

        //기존에 이미 생성되있는 객체의 참조 값을 이용해서도 업캐스팅이 가능하다.
        Alarm alarm = iPhone1;
        alarm.beep();
        alarm.playMusic("Houdini");
        System.out.println();

    }
}