package observer_basic;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addAnswerListener(event -> System.out.println(event.getAnswer()));
        subject.fireEvent(new AnswerEvent(0));
    }
}