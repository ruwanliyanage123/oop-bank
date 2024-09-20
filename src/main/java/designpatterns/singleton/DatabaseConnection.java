package designpatterns.singleton;

public class DatabaseConnection {
    private static final DatabaseConnection instance = new DatabaseConnection();
    private DatabaseConnection() {
        System.out.println("Database connection created...");
    }

    public static DatabaseConnection getInstance() {
        return instance;
    }

    public void executeQuery(String query) {
        System.out.println("Executing query: "+query);
    }
}
