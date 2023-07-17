package creational.singleton;

public class RequestTimeSingleton {

    private static RequestTimeSingleton instance;

    private RequestTimeSingleton() { }

    public RequestTimeSingleton getInstance() {
        if (instance == null) {
            synchronized (RequestTimeSingleton.class) {
                if (instance == null) {
                    instance = new RequestTimeSingleton();
                }
            }
        }
        return instance;
    }
}
