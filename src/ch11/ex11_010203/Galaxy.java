package ch11.ex11_010203;

public class Galaxy implements Phone, Alarm, Message{
    @Override
    public void playMusic(String musicTitle) {
        System.out.printf("%s 음악을 재생한다.\n", musicTitle);
    }

    @Override
    public void beep() {
        System.out.println("삐-삐-삐-삐----");
    }

    @Override
    public void sendMessage(String content) {
        System.out.printf("%s 메시지를 전송한다.\n", content);
    }

    @Override
    public void receiveMessage(String content) {
        System.out.printf("%s 메시지를 수신한다.\n", content);
    }

    @Override
    public void call(String phonenum) {
        System.out.printf("%s로 전화를 한다.\n", phonenum);
    }

    @Override
    public void receive(String phonenum) {
        System.out.printf("%s에서 온 전화를 받는다.\n", phonenum);
    }

    public void samsungPay(String creditCard){
        System.out.printf("%s로 결제를 합니다.\n", creditCard);
    }
}
