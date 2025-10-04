package Day13;

import java.awt.*;
import javax.swing.*;

public class MultiLayoutDemo {

    private static final String B1 = "Button 1";
    private static final String B2 = "2";
    private static final String B3 = "Button 3";
    private static final String B4 = "Long-Named Button 4";
    private static final String B5 = "Button 5";

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            makeBorderLayoutFrame(20, 20);
            makeGridLayoutFrame(470, 20);
            makeFlowLayoutFrame(20, 250);
            makeBoxLayoutFrame(470, 260);
            makeGridBagLayoutFrame(830, 260);
        });
    }

    private static JButton b(String text) {
        return new JButton(text);
    }

    private static void base(JFrame f, String title, int x, int y, int w, int h) {
        f.setTitle(title);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocation(x, y);
        f.setSize(w, h);
        f.setVisible(true);
    }

    // 1) BorderLayout window
    private static void makeBorderLayoutFrame(int x, int y) {
        JFrame f = new JFrame("BorderLayout");
        JPanel p = new JPanel(new BorderLayout(8, 8));
        p.add(b(B1), BorderLayout.NORTH);
        p.add(b(B3), BorderLayout.WEST);
        p.add(b(B2), BorderLayout.CENTER);
        p.add(b(B5), BorderLayout.EAST);
        p.add(b(B4), BorderLayout.SOUTH);
        f.setContentPane(p);
        base(f, f.getTitle(), x, y, 430, 170);
    }

    // 2) GridLayout window (3 rows x 2 cols)
    private static void makeGridLayoutFrame(int x, int y) {
        JFrame f = new JFrame("GridLayout");
        JPanel p = new JPanel(new GridLayout(3, 2, 8, 8));
        p.add(b(B1));
        p.add(b(B2));
        p.add(b(B3));
        p.add(b(B4));
        p.add(b(B5));
        f.setContentPane(p);
        base(f, f.getTitle(), x, y, 470, 190);
    }

    // 3) FlowLayout window
    private static void makeFlowLayoutFrame(int x, int y) {
        JFrame f = new JFrame("FlowLayout");
        JPanel p = new JPanel(new FlowLayout(FlowLayout.LEADING, 16, 12));
        p.add(b(B1));
        p.add(b(B2));
        p.add(b(B3));
        p.add(b(B4));
        p.add(b(B5));
        f.setContentPane(p);
        base(f, f.getTitle(), x, y, 800, 120);
    }

    // 4) BoxLayout window (vertical stack)
    private static void makeBoxLayoutFrame(int x, int y) {
        JFrame f = new JFrame("BoxLayout");
        JPanel p = new JPanel();
        p.setLayout(new BoxLayout(p, BoxLayout.Y_AXIS));
        for (String label : new String[] { B1, B2, B3, B4, B5 }) {
            JButton btn = b(label);
            btn.setAlignmentX(Component.CENTER_ALIGNMENT);
            p.add(btn);
            p.add(Box.createVerticalStrut(8));
        }
        f.setContentPane(new JScrollPane(p));
        base(f, f.getTitle(), x, y, 300, 260);
    }

    // 5) GridBagLayout window
    private static void makeGridBagLayoutFrame(int x, int y) {
        JFrame f = new JFrame("GridBagLayout");
        JPanel p = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(6, 6, 6, 6);
        c.fill = GridBagConstraints.HORIZONTAL;

        // top row: Button 1 | 2 | Button 3
        c.gridy = 0;
        c.weightx = 1;
        c.gridx = 0;
        p.add(b(B1), c);
        c.gridx = 1;
        p.add(b(B2), c);
        c.gridx = 2;
        p.add(b(B3), c);

        // middle row: Long button spanning 3 columns
        c.gridy = 1;
        c.gridx = 0;
        c.gridwidth = 3;
        c.weightx = 1;
        p.add(b(B4), c);
        c.gridwidth = 1;

        // bottom row: place Button 5 on the right, leave space on left
        c.gridy = 2;
        c.gridx = 2;
        c.weightx = 0.5;
        p.add(b(B5), c);

        // give panel some breathing room
        c.gridx = 0;
        c.weightx = 0.5;
        c.gridy = 2;
        c.gridwidth = 2;
        c.fill = GridBagConstraints.BOTH;
        c.weighty = 1;
        p.add(Box.createGlue(), c);

        f.setContentPane(p);
        base(f, f.getTitle(), x, y, 430, 220);
    }
}
