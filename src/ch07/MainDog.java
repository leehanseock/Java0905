package ch07;

public class MainDog {
    public static void main(String[] args) {
        Dog d1 = new Dog();
        Dog d2 = new Dog();

        d1.setName("Mango");
        d1.setBreeds("방패강아지");
        d1.setAge(22);

        d2.setName("Guava");
        d2.setBreeds("칼강아지");
        d2.setAge(23);

        System.out.printf("d1 => (name: %s | breeds: %s | age: %d)\n", d1.getName(), d1.getBreeds(), d1.getAge());
        System.out.printf("d2 => (name: %s | breeds: %s | age: %d)\n", d2.getName(), d2.getBreeds(), d2.getAge());
        d1.wag();
        d2.wag();
        d1.bark(3,"멍크멍크");
        d2.bark(2,"오잉크오잉크");
    }
}