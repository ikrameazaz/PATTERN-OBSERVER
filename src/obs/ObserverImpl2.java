package obs;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
    private List<Integer> history = new ArrayList<>();
    //push model
//    @Override
//    public void update(int newState) {
//        history.add(newState);
//        int sum = history.stream().reduce((a, b) -> a + b).orElse(0);
//        System.out.println("Moyenne" + sum / history.size());
//    }
    //pull model
    @Override
    public void update(Observale o) {
        if (o instanceof ObservaleImpl1 obs) {
            history.add(obs.getState());
            int sum = history.stream().reduce((a, b) -> a + b).orElse(0);
            System.out.println("Moyenne" + sum / history.size());
        }
    }
}
