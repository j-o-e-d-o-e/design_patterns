package observer_basic;

import java.util.Vector;

class Subject {
    private Vector<AnswerListener> listeners = new Vector<>();

    void addAnswerListener(AnswerListener listener) {
        listeners.addElement(listener);
    }

    void fireEvent(AnswerEvent e) {
        for (int i = 0; i < listeners.size(); i++) {
            AnswerListener listener = listeners.elementAt(i);
            switch (e.getID()) {
                case AnswerEvent.YES:
                    listener.yes(e);
                    break;
                case AnswerEvent.NO:
                    listener.no(e);
                    break;
                case AnswerEvent.CANCEL:
                    listener.cancel(e);
                    break;
            }
        }
    }
}
