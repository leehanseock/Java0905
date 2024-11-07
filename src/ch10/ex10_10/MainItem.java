package ch10.ex10_10;

public class MainItem {
    public static void main(String[] args) {
        Item potion = new Item("포션",1000);

        System.out.println("아이템명: "+potion.getName()+" / 아이템 가격: "+potion.getPrice());
        System.out.println();

//        Item stick = new Item();
//        System.out.println("아이템명: "+stick.getName()+" / 아이템 가격: "+stick.getPrice());

        Item wand = new Item("지팡이", 3000, 2);
        System.out.println("아이템명: "+wand.getName()+" / 아이템 가격: "+wand.getPrice()+
                " / 아이템 수: "+wand.getQuantity());
        System.out.println();
    }
}
