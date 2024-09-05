package ch07.ex12;

public class MainCube {
    public static void main(String[] args) {
        Cube mine = new Cube();
        mine.setLength(5);
        int l = mine.getLength();

        System.out.printf("한 변의 길이가 %d인\n", l);
        System.out.printf("\t정육면체의 부피: %.2f\n", mine.getVolume(l));
        System.out.printf("\t정육면체의 겉넓이: %.2f\n", mine.getSurface(l));
    }
}
