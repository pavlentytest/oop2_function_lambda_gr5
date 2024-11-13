package dev1;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape();

        Circle circle = new Circle();

        Shape shape1 = new Shape() {
            @Override
            void square() {

            }

            @Override
            void perimeter() {

            }
        };
        shape1.square();
        shape1.perimeter();

    }
}
abstract class Shape {
    abstract void square();
    abstract void perimeter();
    public void draw() {
        System.out.println("Drawing dev1.Shape");
    }
    public void doSmth() {
        System.out.println("Doing Smth");
    }
}
class Circle extends Shape {

    @Override
    void square() {
        System.out.println("PI*r*r!");
    }

    @Override
    void perimeter() {

    }
}