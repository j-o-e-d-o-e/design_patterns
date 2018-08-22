package observer_basic;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addAnswerListener(listener -> System.out.println(listener.getAnswer()));
        subject.fireEvent(new AnswerEvent(0));
    }
}