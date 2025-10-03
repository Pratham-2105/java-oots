package Day13;

import javax.swing.*;

public class test {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Swing Example");

        JLabel label = new JLabel("Hello, Swing!");
        label.setBounds(50, 50, 200, 30);

        JButton button = new JButton("Click Me");
        button.setBounds(100, 100, 100, 30);

        // Action on button click
        button.addActionListener(e -> JOptionPane.showMessageDialog(frame, "Button Clicked!"));

        frame.add(label);
        frame.add(button);
        frame.setSize(500, 400);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
