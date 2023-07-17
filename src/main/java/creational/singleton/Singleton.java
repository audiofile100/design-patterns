package creational.singleton;

// commonly used for connection or thread pools
public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton() { }

    public static Singleton getInstance() {
        return instance;
    }
}
