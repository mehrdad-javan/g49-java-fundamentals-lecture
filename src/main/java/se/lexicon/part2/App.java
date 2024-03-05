package se.lexicon.part2;

public class App {
    public static void main(String[] args) {
        // How to call a static method?
        // ClassName.MethodName
        /*
        int number1 = 10;
        int number2 = 2;
        double num1 = 2.5;
        double num2 = 2.5;

        System.out.println(MathOperations.multiply(number1, number2));
        System.out.println(MathOperations.multiply(num1, num2));

         */

        /*String id1 = "123a";
        String brand1 = "Volvo";

        String id2 = "123b";
        String brand2 = "VW";

        String id3 = "123c";
        String brand3 = "BMW";*/

        Car volvo = new Car();
        volvo.id = "123a";
        volvo.brand = "Volvo";
        System.out.println(volvo.getCarInfo()); // Output ?
        // Id: 123a, Beand: Volvo, Year: ?
        Car.incrementCounter();
        System.out.println(Car.count); // 1


        Car vw = new Car();
        vw.id = "123b";
        vw.brand = "VW";
        vw.year = 2024;
        System.out.println(vw.getCarInfo());
        Car.incrementCounter();
        System.out.println(Car.count); // 2


    }

}
