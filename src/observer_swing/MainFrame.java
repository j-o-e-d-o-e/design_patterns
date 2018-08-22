package observer_swing;

import javax.swing.*;
import java.awt.*;

class MainFrame extends JFrame {
    MainFrame() {
        super("Demo for observer in swing");
        FormPanel formPanel = new FormPanel();
        formPanel.setFormListener(e -> {
            System.out.println(e.getName() + " " + e.getGender());
            ((FormPanel)e.getSource()).clearData();
        });
        add(formPanel, BorderLayout.CENTER);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 250);
        setVisible(true);
    }
}