package obs;

public class ObserverImpl1 implements Observer {
    //push model
//    @Override
//    public void update(int newState) {
//        System.out.println("**********************");
//        System.out.println("ObserverImpl1: State changed to " + newState);
//        System.out.println("**********************");
//    }
    //pull model
    @Override
    public void update(Observale o) {
        if (o instanceof ObservaleImpl1 obs) {
            System.out.println("**********************");
            System.out.println("ObserverImpl1: State changed to " + obs.getState());
            System.out.println("**********************");
        }
    }
}
