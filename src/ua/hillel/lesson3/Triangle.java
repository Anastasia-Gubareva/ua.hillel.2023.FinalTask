package ua.hillel.lesson3;

public class Triangle {

    public static void main(String[] args) {

        int sideA = 333;
        int sideB = 123;
        int sideC = 33;

        String result = sideA == sideB || sideA == sideC || sideB == sideC ? "Трикутник рівнобедрений" : "Трикутник не рівнобедрений";

        System.out.println(result );

    }
}
