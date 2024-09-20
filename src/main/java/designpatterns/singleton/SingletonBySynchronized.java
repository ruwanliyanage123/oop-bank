package designpatterns.singleton;
public class SingletonBySynchronized {
    private static SingletonBySynchronized instance;
    private SingletonBySynchronized() {}
    public static synchronized SingletonBySynchronized getInstance() {
        if (instance == null) {
            instance = new SingletonBySynchronized();
        }
        return instance;
    }
}
