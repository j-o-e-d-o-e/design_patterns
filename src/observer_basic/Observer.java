package observer_basic;

public class Observer {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addAnswerListener(e -> System.out.println(e.getAnswer()));
        subject.fireEvent(new AnswerEvent(1));
    }
}