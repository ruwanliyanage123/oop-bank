package general;

/**
* Example for static 
**/    

public class StaticExample {
    public int instanceVariable = 10;
    public static int staticVariable = 20;
    public static final int CONSTANT = 30;

    public void nonStaticMethod(){
        int localVariable = 40;
        System.out.println("this is a non-static method");
    }

    public void staticMethod(){
        System.out.println("this is a static method");
    }

    public static void incrementStaticVariable(){
        staticVariable++;
        System.out.println("Static variable value: "+staticVariable);
    }

    public void incrementNonStaticVariable(){
        instanceVariable++;
        System.out.println("Instance variable value: "+instanceVariable);
    }
}
