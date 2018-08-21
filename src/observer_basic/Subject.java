package observer_basic;

class Subject {
    private AnswerListener listener; // observer
    private static final int YES = 0, NO = 1;

    void fireEvent(AnswerEvent e) {
        if (e.getID() == YES)
            e.setAnswer("The answer is: YES");
        else if (e.getID() == NO)
            e.setAnswer("The answer is: NO");
        else
            e.setAnswer("The answer is: UNDEFINED");
        listener.eventOccured(e); // notification
    }

    void addAnswerListener(AnswerListener listener) {
        this.listener = listener; // registration
    }
}