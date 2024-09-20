package designpatterns.facade;

public class FacadeDemo {
    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        Projector projector = new Projector();
        Screen screen = new Screen();
        DVDPlayer dvdPlayer = new DVDPlayer();

        // Creating the Facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amplifier, projector, screen, dvdPlayer);
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
