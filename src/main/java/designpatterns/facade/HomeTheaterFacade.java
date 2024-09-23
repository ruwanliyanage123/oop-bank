package designpatterns.facade;

import jakarta.inject.Inject;

class HomeTheaterFacade {
    @Inject
    private Amplifier amplifier;
    @Inject
    private Projector projector;
    @Inject
    private Screen screen;
    @Inject
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade() {
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        screen.down();
        projector.on();
        projector.setInput("DVD");
        amplifier.on();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the movie theater...");
        dvdPlayer.off();
        amplifier.off();
        projector.off();
        screen.up();
    }
}

