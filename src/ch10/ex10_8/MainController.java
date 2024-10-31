package ch10.ex10_8;

import javax.sound.midi.Track;

public class MainController {

    public static void main(String[] args) {
        Truck truck = new Truck("범블비", 2.1);

        truck.move();
        truck.load();
    }
}
