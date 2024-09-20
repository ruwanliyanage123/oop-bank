package designpatterns.facade;

// HomeTheaterFacade class
class HomeTheaterFacade {
    private Amplifier amplifier;
    private Projector projector;
    private Screen screen;
    private DVDPlayer dvdPlayer;

    public HomeTheaterFacade(Amplifier amplifier, Projector projector, Screen screen, DVDPlayer dvdPlayer) {
        this.amplifier = amplifier;
        this.projector = projector;
        this.screen = screen;
        this.dvdPlayer = dvdPlayer;
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

