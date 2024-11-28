package chp12.ex12_4;

public class MainNullPointer {
    public static void main(String[] args) {
        NullPointerExceptionTest npe = new NullPointerExceptionTest();

        npe.addName("김건우");
        npe.addName("오현민");

        npe.printAllNames();
    }
}
