package designpatterns.singleton;

public class DatabaseConnection {
    public DatabaseConnection() {
        System.out.println("Database connection created...");
    }

    public void executeQuery(String query) {
        System.out.println("Executing query: "+query);
    }
}
