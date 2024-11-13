package dev2;

public class Program {
    public static void main(String[] args) {
        Switchable switchable = new Switchable();

        Switchable switchable1 = new Switchable() {
            @Override
            public void turnOff() {

            }

            @Override
            public void turnOn() {

            }
        };
        switchable1.turnOn();
        switchable1.turnOff();
    }
}
interface Switchable {
    void turnOff();
    void turnOn();
    default void doSmth() {

    }
}
interface Movable extends Switchable {
    void doMove();
}
class Test {

}

class Tv extends Test implements Movable {

    @Override
    public void turnOff() {

    }

    @Override
    public void turnOn() {

    }

    @Override
    public void doMove() {

    }
}
