package Day13;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class RadioButtons {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            JFrame frame = new JFrame("Radio Button Example");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(400, 200);
            frame.setLayout(new FlowLayout());

            // Create radio buttons
            JRadioButton rb1 = new JRadioButton("Option 1");
            JRadioButton rb2 = new JRadioButton("Option 2");
            JRadioButton rb3 = new JRadioButton("Option 3");

            // Group radio buttons (only one can be selected at a time)
            ButtonGroup bg = new ButtonGroup();
            bg.add(rb1);
            bg.add(rb2);
            bg.add(rb3);

            // Create label to display message
            JLabel message = new JLabel("Select an option...");
            message.setFont(new Font("Arial", Font.BOLD, 14));

            // Add action listeners to radio buttons
            rb1.addActionListener(e -> message.setText("You selected Option 1!"));
            rb2.addActionListener(e -> message.setText("You selected Option 2!"));
            rb3.addActionListener(e -> message.setText("You selected Option 3!"));

            // Add components to frame
            frame.add(rb1);
            frame.add(rb2);
            frame.add(rb3);
            frame.add(message);

            frame.setVisible(true);
        });
    }
}
