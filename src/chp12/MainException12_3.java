package chp12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainException12_3 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.print("* 나누는 수를 입력하세요:");
        try{
            int dividend = s1.nextInt();
            double result = 30/dividend;
            System.out.printf("%d을 %d로 나눈 수의 결과는 %.2f\n",30, dividend, result);
        } catch(InputMismatchException e){
            System.out.println("정수를 입력해야만 합니다.");
        } catch(ArithmeticException e){
            System.out.println("정수는 정수 0을 나누면 안 됩니다.");
        } finally {
            System.out.println("프로그램을 종료합니다.");
        }
        s1.close();
    }
}
