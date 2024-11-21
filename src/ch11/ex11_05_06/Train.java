package ch11.ex11_05_06;

public class Train implements Vehicle {

    @Override
    public void horn() {
        System.out.println("부아앙");
    }

    @Override
    public void move(String from, String to) {
        System.out.printf("기차가 %s에서 %s까지 이동한다.\n",from, to);
    }
}
