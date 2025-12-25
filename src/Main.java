import obs.Observable;
import obs.Observer;

public class Main {
    public static void main(String[] args) {
        ObservaleImpl1 observable = new ObservaleImpl1();
        Observer observer1 = new obs.ObserverImpl1();
        Observer observer2 = new obs.ObserverImpl2();
        observable.subscribe(observer1);
        observable.subscribe(observer2);
        // Using anonymous class for the third observer
        observable.subscribe(new Observer() {
            @Override
            public void update(Observable o) {
                if (o instanceof ObservaleImpl1 obs) {
                System.out.println("-------------obs impl 3-----------");
                System.out.println("res= "+obs.getState()*Math.cos(obs.getState()));
                System.out.println("-------------obs impl 3-----------");
            }
           };
        });

        // Using lambda expression for the third observer
        observable.subscribe((obs) -> {
            if (obs instanceof ObservaleImpl1 o) {
                System.out.println("-------------obs impl 3-----------");
                System.out.println("res= "+o.getState()*Math.cos(o.getState()));
                System.out.println("-------------obs impl 3-----------");
            }
        });
        observable.setState(10);
        observable.setState(20);
        observable.unsubsribe(observer1);
        observable.setState(30);
    }
}