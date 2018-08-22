package observer_swing;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.KeyEvent;

class FormPanel extends JPanel {
    private JTextField nameField;
    private ButtonGroup genderBtnGroup;
    private JRadioButton maleBtn;
    private JRadioButton femaleBtn;
    private JButton okBtn;
    private FormListener formListener; // observer

    FormPanel() {
        nameField = new JTextField(10);
        maleBtn = new JRadioButton("male");
        maleBtn.setSelected(true);
        maleBtn.setActionCommand("male");
        maleBtn.setMnemonic(KeyEvent.VK_M);
        femaleBtn = new JRadioButton("female");
        femaleBtn.setMnemonic(KeyEvent.VK_F);
        femaleBtn.setActionCommand("female");
        genderBtnGroup = new ButtonGroup();
        genderBtnGroup.add(maleBtn);
        genderBtnGroup.add(femaleBtn);
        okBtn = new JButton("Ok");
        okBtn.setMnemonic(KeyEvent.VK_O);
        Border innerBorder = BorderFactory.createTitledBorder("Add name and gender");
        Border outerBorder = BorderFactory.createEmptyBorder(5, 5, 5, 5);
        setBorder(BorderFactory.createCompoundBorder(outerBorder, innerBorder));
        addListeners();
        layoutComponents();
    }

    private void addListeners() {
        okBtn.addActionListener(event -> { // registration of buttonListener (also observer)
            String name = nameField.getText();
            String gender = genderBtnGroup.getSelection().getActionCommand();
            formListener.eventOccured(new FormEvent(this, name, gender)); // notification
        });
    }

    void setFormListener(FormListener formListener) { // registration of formListener
        this.formListener = formListener;
    }

    private void layoutComponents() {
        setLayout(new GridBagLayout());
        GridBagConstraints gc = new GridBagConstraints();
        gc.fill = GridBagConstraints.NONE;
        gc.anchor = GridBagConstraints.LINE_END;
        // First row
        gc.gridy = 0;
        gc.gridx = 0;
        gc.weightx = 1;
        gc.weighty = 0.1;
        gc.insets = new Insets(0, 0, 0, 5);
        add(new JLabel("Name: "), gc);
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);
        add(nameField, gc);
        // Next row
        gc.gridy++;
        gc.gridx = 0;
        gc.weightx = 1;
        gc.weighty = 0.1;
        gc.anchor = GridBagConstraints.LINE_END;
        gc.insets = new Insets(0, 0, 0, 5);
        add(new JLabel("Gender: "), gc);
        gc.gridx = 1;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);
        add(maleBtn, gc);
        // Next row
        gc.gridy++;
        gc.gridx = 1;
        gc.weightx = 1;
        gc.weighty = 0.1;
        gc.anchor = GridBagConstraints.LINE_START;
        gc.insets = new Insets(0, 0, 0, 0);
        add(femaleBtn, gc);
        // Next row
        gc.gridy++;
        gc.gridx = 1;
        gc.weightx = 1;
        gc.weighty = 2.0;
        gc.anchor = GridBagConstraints.FIRST_LINE_START;
        add(okBtn, gc);
    }

    void clearData() {
        nameField.setText("");
        nameField.requestFocus();
        maleBtn.setSelected(true);
    }
}