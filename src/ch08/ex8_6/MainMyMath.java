package ch08.ex8_6;

public class MainMyMath {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 20;
        System.out.printf("%d과 %d중에서 더 큰 값은? %d\n",n1, n2, MyMath.max(n1,n2));
        System.out.printf("%d과 %d중에서 더 작은 값은? %d\n",n1, n2, MyMath.min(n1,n2));
    }
}
