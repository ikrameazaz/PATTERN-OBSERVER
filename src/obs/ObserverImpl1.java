package obs;

public class ObserverImpl1 implements Observer {

    //pull model
    @Override
    public void update(Observable o) {
        if (o instanceof ObservableImpl1 obs) {
            System.out.println("**********************");
            System.out.println("ObserverImpl1: State changed to " + obs.getState());
            System.out.println("**********************");
        }
    }
}
