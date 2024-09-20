package designpatterns.singleton;
public class SingletonByStaticNestedClass {
    private SingletonByStaticNestedClass() {}

    private static class Holder {
        private static final SingletonByStaticNestedClass INSTANCE = new SingletonByStaticNestedClass();
    }

    public static SingletonByStaticNestedClass getInstance() {
        return Holder.INSTANCE;
    }
}

