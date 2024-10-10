package ch09.ex09_4;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args){
        //ArrayList의 객체 생성, ArrayList 안의 요소 자료형은 '<>'에 써주면 된다
        //'names'라는 참조 변수생성
        ArrayList<String> names = new ArrayList<String>();

        //요소(Element) 추가
        names.add("Kim");
        names.add("Lee");
        names.add("Park");
        names.add("Choi");

        //요소(Element) 변경(설정)
        names.set(0, "Han");

        //요소(Element) 삭제 - remove()는 반환값으로 요소(Element)를 갖는다
        String removed = names.remove(1);
        System.out.println("삭제된 요소: "+removed);

        //요소 반환
        for(int i = 0; i< names.size(); i++){
            System.out.printf("%s ", names.get(i));
        }
    }
}
