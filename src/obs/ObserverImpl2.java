package obs;

import java.util.ArrayList;
import java.util.List;

public class ObserverImpl2 implements Observer {
    private List<Integer> history = new ArrayList<>();

    @Override
    public void update(Observable o) {
        if (o instanceof ObservableImpl1 obs) {
            history.add(obs.getState());
            int sum = history.stream().reduce((a, b) -> a + b).orElse(0);
            System.out.println("Moyenne" + sum / history.size());
        }
    }
}
