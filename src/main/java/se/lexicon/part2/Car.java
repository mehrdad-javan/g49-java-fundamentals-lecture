package se.lexicon.part2;

// Static vs Instance Fields & Methods
public class Car {

    /*
    Instance fields are variables that belong to an instance of the class(object) -> each object created from the class has its own set of these variables and data
    Belong to instances(objects) of the class.
    Accessed using an object of the class.
     */
    // Fields
    String id;
    String brand;
    int year;

    /*
    Static fields are declared with static keyword
    Belong to the class rather than to instance of the class.
    Are used to share data amon all instances(objects) of the class.
    Accessed using the class name.
     */
    static int count = 0;

    // Constructors

    // Methods
    public String getCarInfo(){
        // We can access instance and static methods and fields
        // Car.incrementCounter();
        // this.getBrand();
        return "ID: " + this.id + ", Brand: " + brand + ", Year: " + year;
    }

    public String getBrand(){
        return brand;
    }

    public static void incrementCounter(){
        // cannot directly access instance fields and methods.
        // getBrand();
        // this.id = 10;'
        // int test = 10; // it is a local variable
        count++;
    }

}
