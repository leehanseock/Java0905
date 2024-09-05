package ch07;
import java.util.Scanner;

public class Dog {
    private String name;
    private String breeds;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBreeds() {
        return breeds;
    }

    public void setBreeds(String breeds) {
        this.breeds = breeds;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void wag(){
        System.out.printf(name+"가 살랑살랑 꼬리를 친다\n");
    }

    public void bark(){
        System.out.printf(name+"는 왈왈 짖었다\n");
    }


    public void bark(int times, String sound){
        System.out.printf("%s가 %d번 %s 짖었다\n", name, times, sound);
    }

}