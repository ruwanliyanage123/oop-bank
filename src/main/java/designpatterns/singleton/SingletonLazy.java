package designpatterns.singleton;

public final class SingletonLazy {
    private static SingletonLazy instance;
    private SingletonLazy() {
        //logic
    }
    public synchronized static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }
}