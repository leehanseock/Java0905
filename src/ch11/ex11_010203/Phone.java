package ch11.ex11_010203;

public interface Phone {
    //인터페이스는 상수, 추상메소드, default 메소드 등을 사용할 수 있다.
    //상수는 final과 static을 생략 가능
    static final String PRODUCT_NAME = "Apple";
    //추상메소드는 public과 abstract를 생략 가능
    public abstract void call(String phonenum);
    abstract public void receive (String phonenum);
}
