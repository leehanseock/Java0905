package chp12.ex12_5;

public class InterruptedExceptionTest {

    public void printDelay(){
        String[] arr = {"대한민국", "스페인","이탈리아","캐나다","일본"};
        for (int i =0; i<10; i++){
            System.out.println(arr[i]);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}
