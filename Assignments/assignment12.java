package Assignments;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class assignment12 {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            borderLayoutDemo();
            boxLayoutDemo();
            cardLayoutDemo();
        });
    }

    static void borderLayoutDemo() {
        JFrame f = new JFrame("BorderLayout Demo");
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.setLayout(new BorderLayout(8, 8));
        f.add(new JButton("North"), BorderLayout.NORTH);
        f.add(new JButton("South"), BorderLayout.SOUTH);
        f.add(new JButton("East"), BorderLayout.EAST);
        f.add(new JButton("West"), BorderLayout.WEST);
        f.add(new JButton("Center"), BorderLayout.CENTER);
        f.setSize(360, 240);
        f.setLocationByPlatform(true);
        f.setVisible(true);
    }

    static void boxLayoutDemo() {
        JFrame f = new JFrame("BoxLayout Demo");
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        p.setBorder(BorderFactory.createEmptyBorder(12, 12, 12, 12));
        JButton a = new JButton("Button A");
        JButton b = new JButton("Button B");
        JButton c = new JButton("Button C");
        a.setAlignmentX(Component.CENTER_ALIGNMENT);
        b.setAlignmentX(Component.CENTER_ALIGNMENT);
        c.setAlignmentX(Component.CENTER_ALIGNMENT);
        p.add(a);
        p.add(Box.createRigidArea(new Dimension(0, 10)));
        p.add(b);
        p.add(Box.createRigidArea(new Dimension(0, 10)));
        p.add(c);
        f.setContentPane(p);
        f.pack();
        f.setSize(260, 200);
        f.setLocationByPlatform(true);
        f.setVisible(true);
    }

    static void cardLayoutDemo() {
        JFrame f = new JFrame("CardLayout Demo");
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        CardLayout cl = new CardLayout();
        JPanel cards = new JPanel(cl);
        JPanel red = new JPanel();
        red.setBackground(new Color(220, 80, 80));
        red.add(new JLabel("Red Card"));
        JPanel green = new JPanel();
        green.setBackground(new Color(80, 180, 120));
        green.add(new JLabel("Green Card"));
        JPanel blue = new JPanel();
        blue.setBackground(new Color(90, 130, 220));
        blue.add(new JLabel("Blue Card"));
        cards.add(red, "RED");
        cards.add(green, "GREEN");
        cards.add(blue, "BLUE");
        JPanel controls = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JButton prev = new JButton("Previous");
        JButton next = new JButton("Next");
        String[] names = { "RED", "GREEN", "BLUE" };
        JComboBox<String> chooser = new JComboBox<>(names);
        prev.addActionListener((ActionEvent e) -> cl.previous(cards));
        next.addActionListener((ActionEvent e) -> cl.next(cards));
        chooser.addActionListener(e -> cl.show(cards, (String) chooser.getSelectedItem()));
        controls.add(prev);
        controls.add(chooser);
        controls.add(next);
        f.setLayout(new BorderLayout());
        f.add(cards, BorderLayout.CENTER);
        f.add(controls, BorderLayout.SOUTH);
        f.setSize(360, 240);
        f.setLocationByPlatform(true);
        f.setVisible(true);
    }
}
