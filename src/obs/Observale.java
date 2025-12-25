package obs;

public interface Observale {
    void subscribe(Observer o);
    void unsubsribe(Observer o);
    void notifyObservers();
}
