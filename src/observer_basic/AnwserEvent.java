package observer_basic;

import java.util.EventObject;

class AnswerEvent extends EventObject {
    private int id;
    static final int YES = 0, NO = 1, CANCEL = 2;

    AnswerEvent(Object source, int id) {
        super(source);
        this.id = id;
    }

    int getID() {
        return id;
    }
}
