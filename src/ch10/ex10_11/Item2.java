package ch10.ex10_11;

public class Item2 {
    String name;
    int price;

    Item2(){
        this.name = "기본";
        System.out.println("Item2()의 기본생성자 호출");
    }

    public Item2(String name, int price) {
        this.name = name;
        this.price = price;
    }


}
