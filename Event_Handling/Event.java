package Event_Handling;

import java.awt.*;
import java.awt.event.*;

public class Event extends Frame implements ActionListener {
    Button button;

    public Event() {
        button = new Button("Click Me");
        button.setBounds(50, 100, 80, 30);
        button.addActionListener(this); // Registering the listener
        add(button);
        setSize(200, 200);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        button.setLabel("Bhavesh!"); // Event handling
    }

    public static void main(String[] args) {
        new Event();
    }
}

