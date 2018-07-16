package observer_swing;

import java.util.EventObject;

public class FormEvent extends EventObject {
    private String name;
    private String gender;

    FormEvent(Object source, String name, String gender) {
        super(source);
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    String getGender() {
        return gender;
    }
}