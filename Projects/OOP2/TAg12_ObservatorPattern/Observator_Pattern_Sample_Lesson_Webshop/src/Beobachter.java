public interface Beobachter {

    // Diese Methode wird vom Observed Subject / Publisher aufgerufen,
    // um die Observer / Subscriber
    // über den neuen Zustand zu informieren.
    void update(String newsletter);
}


