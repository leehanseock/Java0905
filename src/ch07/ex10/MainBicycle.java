package ch07.ex10;

public class MainBicycle {
    public static void main(String[] args) {
        Bicycle mine = new Bicycle();
        // 인스턴스 변수 초기화
        mine.setName("따릉이");
        mine.setPrice(150000);
        mine.setWeight(2.5);

        System.out.printf("내 자전거 이름은 %s이고, 가격은 %d원이야. 무게는 %.2fkg이 나가.",
                mine.getName(),mine.getPrice(),mine.getWeight());

    }
}
