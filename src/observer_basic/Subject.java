package observer_basic;

class Subject {
    private AnswerListener listener;
    static final int YES = 0, NO = 1;

    void fireEvent(AnswerEvent e) {
        if (e.getID() == YES)
            e.setAnswer("The answer is: YES");
        else if (e.getID() == NO)
            e.setAnswer("The answer is: NO");
        listener.eventOccured(e);
    }

    void addAnswerListener(AnswerListener listener) {
        this.listener = listener;
    }
}