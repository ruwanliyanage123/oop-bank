package designpatterns.singleton;

public final class DatabaseConnection {
    private static DatabaseConnection instance = new DatabaseConnection();

    private DatabaseConnection() {
        //login to database
        System.out.println("Database connection created...");
    }

    public static DatabaseConnection getInstance() {
        return instance;
    }

    public void executeQuery(String query) {
        System.out.println("Executing query: "+query);
    }
}
