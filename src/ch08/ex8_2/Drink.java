package ch08.ex8_2;

public class Drink {
    private String name;
    private int price;

    public Drink() {
        System.out.println("default constructor 호출");
    }

    Drink(String name, int price) {
        this.name = name;
        this.price = price;
        System.out.println("Drink(String name, int price) constructor 호출");
    }

    @Override
    public String toString() {
        return "Drink{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
