package Singleton_Design_Pattern;

public class Singleton {
    private static Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        return instance == null ? instance = new Singleton() : instance;
    }


}
