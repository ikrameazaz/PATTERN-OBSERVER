package obs;

public interface Observable {
    void subscribe(Observer o);
    void unsubsribe(Observer o);
    void notifyObservers();
}
