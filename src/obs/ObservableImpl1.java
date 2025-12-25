package obs;

import java.util.ArrayList;
import java.util.List;

public class ObservableImpl1 implements Observable {
    private List<Observer> observers=new ArrayList<>();

    private int state;
    @Override
    public void subscribe(Observer o) {
        observers.add(o);
    }

    @Override
    public void unsubsribe(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o:observers){
            o.update(this);
        }
    }


    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyObservers();
    }
}
