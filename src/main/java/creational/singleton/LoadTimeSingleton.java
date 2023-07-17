package creational.singleton;

public class LoadTimeSingleton {

    private static final LoadTimeSingleton instance = new LoadTimeSingleton();

    private LoadTimeSingleton() { }

    public static LoadTimeSingleton getInstance() {
        return instance;
    }
}
