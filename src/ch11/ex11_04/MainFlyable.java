package ch11.ex11_04;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainFlyable {
    public static void main(String[] args) {
        Bird bird = new Bird();
        Helicopter blackHawk = new Helicopter();
        Rocket nuri = new Rocket();

        //배열에 각 개체의 참조값을 저장
        Flyable[] flyables = {bird, blackHawk, nuri};
        for (Flyable flyable : flyables){
            flyable.fly();
        }
        System.out.println("======================================================");
        //어레이리스트
        ArrayList<Flyable> flyableArrayList = new ArrayList<Flyable>();
        flyableArrayList.add(blackHawk);
        flyableArrayList.add(nuri);
        flyableArrayList.add(bird);
        for (Flyable flyable : flyableArrayList){
            flyable.fly();
        }
    }
}
