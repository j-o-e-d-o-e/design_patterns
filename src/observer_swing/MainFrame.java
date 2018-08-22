package observer_swing;

import javax.swing.*;
import java.awt.*;

class MainFrame extends JFrame {
    MainFrame() {
        super("Demo for observer in swing");
        FormPanel formPanel = new FormPanel();
        formPanel.setFormListener(event -> {
            System.out.println(event.getName() + " " + event.getGender());
            ((FormPanel)event.getSource()).clearData();
        });
        add(formPanel, BorderLayout.CENTER);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 250);
        setVisible(true);
    }
}