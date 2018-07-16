package observer_swing;

import javax.swing.*;
import java.awt.*;

class MainFrame extends JFrame {
    private FormPanel formPanel;

    MainFrame() {
        super("Demo for observer_basic pattern in swing");
        formPanel = new FormPanel();
        formPanel.setFormListener(e -> {
            System.out.println(e.getName() + " " + e.getGender());
            formPanel.clearData();
        });
        add(formPanel, BorderLayout.CENTER);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(400, 250);
        setVisible(true);
    }
}