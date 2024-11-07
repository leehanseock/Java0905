package ch10.ex10_10;

public class Item {
    private String name;
    private int price;
    private int quantity;

//    // 필드명과 지역변수(매개변수)의 이름이 같은 경우 구별용도로 this 키워드를 사용한다
//    public Item(String name, int price) {
//        this.name = name;
//        this.price = price;
//    }

//    public Item() {
//        this("나무막대기", 50);
//        System.out.println("기본 생성자가 호출되었습니다.");
//    }

    public Item(String name){
        this.name = name;
    }

   public Item(String name, int price) {
        this(name);
        this.price = price;
   }

    public Item(String name, int price, int quantity) {
        this(name, price);
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
