package se.lexicon.part2;

public class StringExamples {

    public static void main(String[] args) {
        /*
        // Creating Strings
        String str1  = "Hello, World!";
        String str2 = new String("Hello, World!");

        // String concatenation
        String str3 = str1 + " This is a concatenated string.";
        String str4 = str1.concat(" ").concat("This is a concatenated string").concat(".");
         */

        ex4();
    }


    // length(), charAt()
    public static void ex1() {
        String name = "Erik Svensson";
        System.out.println(name.length()); // Output = 13
        int length = name.length();

        for (int i = 0; i < length; i++) {
            System.out.println(name.charAt(i));
        }

    }

    // indexOf()
    public static void ex2(){
        String string = "Hello Strings"; // H[0] e[1] l[2] l[3] 0[4] ...
        System.out.println(string.indexOf("llo")); // 2
    }

    // substring():
    public static void ex3(){
        String greeting = "Welcome";
        System.out.println(greeting.substring(3)); // come
        System.out.println(greeting.substring(1, 5)); // elco
    }

    public static void ex4(){
        String str1 = "nisse";
        String str2 = "Nisse";
        System.out.println(str1.equals(str2)); // false
        System.out.println(str1.equalsIgnoreCase(str2)); // true

        System.out.println(str1.toUpperCase()); // NISSE
        System.out.println(str1.toLowerCase()); // nisse
    }

    // replace()
    // contains()
    //...


}
