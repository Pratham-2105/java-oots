package Day13;

import javax.swing.*;
import java.awt.*;

public class GuiExample2 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("BorderLayout");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.add(new JButton("Button 1"), BorderLayout.NORTH);
        frame.add(new JButton("Button 3"), BorderLayout.WEST);
        frame.add(new JButton("Button 2"), BorderLayout.CENTER);
        frame.add(new JButton("Button 5"), BorderLayout.EAST);
        frame.add(new JButton("Long-Named Button 4"), BorderLayout.SOUTH);

        frame.setSize(360, 160);
        frame.setVisible(true);
    }
}
