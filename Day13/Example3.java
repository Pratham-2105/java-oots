package Day13;

import javax.swing.*;
import java.awt.*;

public class Example3 extends JPanel {

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        // Set font
        g.setFont(new Font("Arial", Font.BOLD, 30));

        // Draw first string in RED
        g.setColor(Color.RED);
        g.drawString("All The Best", 50, 60);

        // Draw second string in BLUE
        g.setColor(Color.BLUE);
        g.drawString("All The Best", 50, 110);

        // Draw third string in GREEN
        g.setColor(Color.GREEN);
        g.drawString("All The Best", 50, 160);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Colours Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);

        // Add custom panel
        frame.add(new Example3());

        frame.setVisible(true);
    }
}
