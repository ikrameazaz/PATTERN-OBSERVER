import obs.Observable;
import obs.ObservableImpl1;
import obs.Observer;

public class Main {
    public static void main(String[] args) {
        ObservableImpl1 observable = new ObservableImpl1();
        Observer observer1 = new obs.ObserverImpl1();
        Observer observer2 = new obs.ObserverImpl2();
        observable.subscribe(observer1);
        observable.subscribe(observer2);
        // Using anonymous class for the third observer
        observable.subscribe(new Observer() {
            @Override
            public void update(Observable o) {
                if (o instanceof ObservableImpl1 obs) {
                System.out.println("-------------obs impl 3-----------");
                System.out.println("res= "+obs.getState()*Math.cos(obs.getState()));
                System.out.println("-------------obs impl 3-----------");
            }
           };
        });

        // Using lambda expression for the third observer
        observable.subscribe((obs) -> {
            if (obs instanceof ObservableImpl1 o) {
                System.out.println("-------------obs impl 3-----------");
                System.out.println("res= "+o.getState()*Math.cos(o.getState()));
                System.out.println("-------------obs impl 3-----------");
            }
        });
        observable.setState(10);
        observable.setState(20);
        observable.unsubscribe(observer1);
        observable.setState(30);
    }
}