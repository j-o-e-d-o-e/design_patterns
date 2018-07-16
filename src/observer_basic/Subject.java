package observer_basic;

class Subject {
    private AnswerListener listener; // observer
    private static final int YES = 0, NO = 1;

    void fireEvent(AnswerEvent e) { // notification
        if (e.getID() == YES)
            e.setAnswer("The answer is: YES");
        else if (e.getID() == NO)
            e.setAnswer("The answer is: NO");
        listener.eventOccured(e);
    }

    void addAnswerListener(AnswerListener listener) { // registration
        this.listener = listener;
    }
}