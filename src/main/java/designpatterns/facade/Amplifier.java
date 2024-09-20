package designpatterns.facade;

class Amplifier {
    public void on() {
        System.out.println("Amplifier is ON.");
    }

    public void off() {
        System.out.println("Amplifier is OFF.");
    }

    public void setVolume(int level) {
        System.out.println("Amplifier volume set to " + level);
    }
}