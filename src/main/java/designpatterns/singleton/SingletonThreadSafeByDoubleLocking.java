package designpatterns.singleton;

public final class SingletonThreadSafeByDoubleLocking {
    private static volatile SingletonThreadSafeByDoubleLocking instance;

    private SingletonThreadSafeByDoubleLocking() {
    }

    public static SingletonThreadSafeByDoubleLocking getInstance() {
        if (instance == null) {
            synchronized (SingletonThreadSafeByDoubleLocking.class) {
                if (instance == null) {
                    instance = new SingletonThreadSafeByDoubleLocking();
                }
            }
        }
        return instance;
    }
}
