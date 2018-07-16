package observer_basic;

import java.util.EventListener;

interface AnswerListener extends EventListener {

    void eventOccured(AnswerEvent e);
}