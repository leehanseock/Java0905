package ch10.protected1;

import ch10.protected1.test.Child;

public class MainChild {
    public static void main(String[] args) {
        Child child = new Child();
        child.testPro();
        System.out.println("Parent Id는 "+child.id);
    }
}
