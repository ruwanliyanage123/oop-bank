package designpatterns.singleton;

public final class DatabaseConnection {
    private static DatabaseConnection instance = new DatabaseConnection();

    private DatabaseConnection() {
        //login to database
        System.out.println("Database connection created...");
        login();
    }

    public static DatabaseConnection getInstance() {
        return instance;
    }

    private void login(){

    }

}
