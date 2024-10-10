package ch09;

import java.util.Random;

public class MainRandom {
    public static void main(String[] args){
        //Random 클래스 : 정수, 실수, 논리값, 특정 개수도 설정가능
        Random random = new Random();

        System.out.printf("임의의 정수값 : %d\n", random.nextInt());
        System.out.printf("0에서 9 사이의 임의의 정수값 : %d\n", random.nextInt(10));
        System.out.printf("1에서 10 사이의 임의의 정수값 : %d\n", random.nextInt(10)+1);
        System.out.printf("임의의 실수값 : %f\n", random.nextDouble(100));//0이상 100미만의 실숫값 출력
        System.out.printf("임의의 논리값 : %b\n", random.nextBoolean());
    }
}
