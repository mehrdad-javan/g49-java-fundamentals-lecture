package se.lexicon;

// re-format code: ctrl + alt - L

import java.sql.SQLOutput;

public class App {

    // single line comment

    /*
        This is a multi-line comment
        It can be multiple lines
    */

    public static void main(String[] args) {
        // sout + tab
        System.out.println("Hello World!");


        short age = 25;
        short employeeExperience = 10;

        int productPrice = 5000;

        long balance = 500000000000000L;
        long totalPopulation = 7000000000L;

        char grade = 'A';
        // char grade = 'B';

        boolean isStudent = true;
        boolean isActive = false;

        double amount = 50000000.45454545;
        float radius = 5.5f;
        double area = 5.9;

        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;

        System.out.println(fullName);

        int a = 10, b = 8, c = 10;

        int number1 = 5;
        int number2 = 10;
        number1 = number2; // number2 = 10
        number2 = 1;
        System.out.println(number1); // 10
        System.out.println(number2); // 1

        int sum = number1 + number2;
        System.out.println(sum);

        int num1 = 5;
        int num2 = 2;
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1 / num2);
        System.out.println(num1 % num2);

        int quotient = 10 / 5;
        int remainder = 10 % 5;

        System.out.println("quotient is: " + quotient);
        System.out.println("remainder is: " + remainder);

        int n1 = 10, n2 = 9;
        boolean isEqual = n1 == n2; // false
        boolean isGreater = n1 > n2; // true
        boolean isNotEqual = n1 != n2; // true
        boolean isLessOrEqual = n2 <= n1; // true


        System.out.println(isEqual);


        int count = 5;
        System.out.println(++count);

        int age2 = 20;
        if (age2 >= 18) {
            System.out.println("You can have a beer. :)");
        } else if (age2 < 18 && age2 >= 15) {
            System.out.println("You can drive a moped but not drink beer.");
        } else {
            System.out.println("You are too young to drink beer.");
        }

        int number3 = 11;
        if (number3 % 2 == 0) {
            System.out.println("Even Number");
        } else {
            System.out.println("Odd Number");
        }

        int dayOfWeek = 6;
        switch (dayOfWeek) {
            case 1:
                System.out.println("It is Monday!");
                break;
            case 2:
                System.out.println("It is Tuesday!");
                break;
            case 3:
                System.out.println("It is Wednesday!");
                break;
            case 4:
                System.out.println("It is Thursday!");
                break;
            case 5:
                System.out.println("It is Friday!");
                break;
            default:
                System.out.println("It is Weekend!");
        }

        int operationNumber = 2;
        switch (operationNumber){
            case 1:
                System.out.println("Execute Login...");
                break;
            case 2:
                System.out.println("Execute Registration Operation...");
                break;
            default:
                System.out.println("Operation Number is not Valid!");
        }


        Person simon = new Person(); // object
        simon.firstName = "Simon";
        simon.lastName = "Elbrink";
        simon.age = 30;

        Person marcus = new Person();
        marcus.firstName = "Marcus";
        // ...

        Person person3 = new Person();
        person3.firstName="Test";

        System.out.println(simon.firstName);
        System.out.println(simon.lastName);
        System.out.println(marcus.lastName); // null
        System.out.println(marcus.age); // 0


        Calculator.displayMenu();
    }
}
