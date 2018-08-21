package observer_basic;

import java.util.EventListener;

@FunctionalInterface
interface AnswerListener extends EventListener {

    void eventOccured(AnswerEvent e);
}