package dev3;

public class Program {
    public static void main(String[] args) {

        Calculable calculable = new Calculable() {
            @Override
            public int calc(int a, int b) {
                return 100*(a+b);
            }
        };

        Calculable calculable2 = (a, b) -> 100*(a+b);
        System.out.println(calculable2.calc(2, 3));



    }
}
// 1 метод - функциональный интерфейс
interface Calculable {
    int calc(int a, int b);
}
