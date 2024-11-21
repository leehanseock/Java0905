package ch11.ex11_05_06;

public class Bicycle implements Vehicle {
    @Override
    public void horn() {
        System.out.println("따르릉 따르릉 비켜가세요 자전거가 나갑니다 따르르르릉🎵");
    }

    //인터페이스에 정의된 static 메소드는 오버라이딩 할 수 없다.
    //인터페이스에 static 메소드를 오버라이딩할 수는 없지만, 현재 클래스에서 같은 이름으로 정의는 할 수 있다.
    //단, 사용할 때는 아래 메소드를 호출하고 싶다면 Bicycle.stop()을 사용해야한다. (Vehicle.stop() 호출하면 x)
    //둘은 개별적인 stop이라는것 유의.
    static public void stop(String place){
        System.out.printf("자전거가 %s에서 멈춘다.", place);
    } // Bicycle의 멤버 메소드로 인식하는 것이지, 인터페이스의 stop에 오버라이딩되는 것은 아님.
}
