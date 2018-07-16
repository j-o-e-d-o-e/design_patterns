package observer_basic;

import java.util.EventObject;

class AnswerEvent extends EventObject {
    private int id;
    private String answer;

    AnswerEvent(int id) {
        super(new Object());
        this.id = id;
    }

    int getID() {
        return id;
    }

    void setAnswer(String answer) {
        this.answer = answer;
    }

    String getAnswer() {
        return answer;
    }
}