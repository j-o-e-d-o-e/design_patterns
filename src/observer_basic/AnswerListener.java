package observer_basic;

import java.util.EventListener;

interface AnswerListener extends EventListener {
    void yes(AnswerEvent e);

    void no(AnswerEvent e);

    void cancel(AnswerEvent e);
}
