package observer_swing;

import java.util.EventListener;

@FunctionalInterface
public interface FormListener extends EventListener {

    void eventOccured(FormEvent e);
}
