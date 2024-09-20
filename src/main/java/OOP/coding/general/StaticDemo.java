package OOP.coding.general;

public class StaticDemo {
    // Static variable
    static int staticVariable = initializeStaticVariable();
    // Static block
    static {
        System.out.println("Static block is executed.");
    }
    // Static method to initialize the static variable
    static int initializeStaticVariable() {
        System.out.println("Static method to initialize variable is executed.");
        return 10;
    }
    // Instance variable
    int instanceVariable;

    // Constructor
    public StaticDemo() {
        System.out.println("Constructor is executed.");
        instanceVariable = 20; // Initialize instance variable
    }

    public static void main(String[] args) {
        System.out.println("Main method starts.");
        // Create an object of StaticDemo
        StaticDemo demo = new StaticDemo();
        // Accessing the static variable and method
        System.out.println("Static variable value: " + staticVariable);
        // Calling static method
        staticMethod();
        // Accessing instance variable
        System.out.println("Instance variable value: " + demo.instanceVariable);
        System.out.println("Main method ends.");
    }

    // Static method
    static void staticMethod() {
        System.out.println("Static method is executed.");
    }
}
