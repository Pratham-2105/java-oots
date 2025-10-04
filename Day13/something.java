import javax.swing.*;
import java.awt.*;

public class Gridlayout {
    public static void main(String[] args) {
        // Create a new frame
        JFrame frame = new JFrame("GridLayout Example");

        // Set GridLayout: 2 rows, 3 columns, with 10px horizontal & vertical gaps
        frame.setLayout(new GridLayout(2, 3, 10, 10));

        // Add 6 buttons
        for (int i = 1; i <= 6; i++) {
            frame.add(new JButton("Button " + i));
        }

        // Frame settings
        frame.setSize(400, 200);  // width, height
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // center of screen
        frame.setVisible(true);
    }
}
