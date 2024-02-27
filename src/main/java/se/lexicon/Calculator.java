package se.lexicon;

public class Calculator {
    public static void main(String [] args){

        Calculator.displayMenu();

        int result1 = Calculator.addition(10,5);
        System.out.println(result1);

        System.out.println(Calculator.addition(2,3));

    }


    private static int addition(int n1, int n2){
          return n1 + n2;
    }

    public static void displayMenu(){
        System.out.println("My Calculator App");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        // ...

    }

}
