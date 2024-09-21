package general;

public class DebugDemo {
    public static void main(String[] args) {
        //printMessage("Hello, World!");
        printMessage("Debugging...", 5);
    }

    public static void printMessage(String message) {
        System.out.println(message);
        printMessage2("print message2!");
    }

    public static void printMessage2(String message){
        System.out.println(message);
    }

    public static void printMessage(String message, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(message+" "+(i));
        }
    }
}
