package ch08.ex8_6;

import java.util.Scanner;

public class MainMyMath {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("비교하려는 첫 번째 정수값을 입력해주십시오 : ");
        int n1 = myScanner.nextInt();
        System.out.print("비교하려는 두 번째 정수값을 입력해주십시오 : ");
        int n2 = myScanner.nextInt();
        System.out.printf("%d과(와) %d중에서 더 큰 값은? %d\n",n1, n2, MyMath.max(n1,n2));
        System.out.printf("%d과(와) %d중에서 더 작은 값은? %d\n",n1, n2, MyMath.min(n1,n2));
        myScanner.close();
    }
}
