class Dog {
    String name;
    int age;

    // Constructor
    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display dog details
    public void displayDetails() {
        System.out.println("Dog Name: " + name);
        System.out.println("Dog Age: " + age);
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating an object of Dog using the constructor
        Dog myDog = new Dog("Buddy", 3);
        myDog.displayDetails();
    }
}