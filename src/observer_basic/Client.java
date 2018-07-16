package observer_basic;

public class Client {
    public static void main(String[] args) {
        Subject subject = new Subject();
        subject.addAnswerListener(new AnswerListener() {
            @Override
            public void yes(AnswerEvent e) {
                System.out.println("Yes");
            }

            @Override
            public void no(AnswerEvent e) {
                System.out.println("No");
            }

            @Override
            public void cancel(AnswerEvent e) {
                System.out.println("Cancel");
            }
        });
        subject.fireEvent(new AnswerEvent(new Object(), 0));
    }
}