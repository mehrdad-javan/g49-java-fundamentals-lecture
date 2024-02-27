package se.lexicon;

import java.util.Scanner;

public class LoopsExample {

    // psvm +tab
    public static void main(String[] args) {
        /*boolean isAdult = true;
        while (isAdult){
            Scanner scanner = new Scanner(System.in);
            System.out.println("How old are you?");
            int age = scanner.nextInt();

            if (age >= 18){
                System.out.println("You are an adult.");
            } else {
                System.out.println("You are a child.");
                isAdult = false;
            }
        }
        System.out.println("-----------------");*/

/*
        int count = 1;
        while (count <= 10) {
            System.out.println(count);
            count++;
            if (count == 6) {
                break;
            }
        }
*/

/*
        int num = 1;
        do {
            System.out.println(num);
            num++;
        } while (num <= 5);
*/

        /*
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        for (int i = 9; i >= 0; i--) {
            System.out.println(i);
        }
         */

        //******
        //*****
        //****
        //***
        //**
        //*
        int term = 6;
        for (int i = 1; i <= term; i++) {
            for (int j = 6; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println();

        }
        //******
        //*****
        //****
        //***
        //**
        //*

    }

}
