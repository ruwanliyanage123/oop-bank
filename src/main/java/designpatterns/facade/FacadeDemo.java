package designpatterns.facade;

public class FacadeDemo {
    public static void main(String[] args) {

        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}
