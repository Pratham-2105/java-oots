package Day13;

import java.awt.*;
import java.awt.event.*;

public class AWTExample {
    public static void main(String[] args) {
        Frame f = new Frame("AWT Example");

        Label l = new Label("Enter your name:");
        l.setBounds(50, 50, 150, 30);

        TextField tf = new TextField();
        tf.setBounds(200, 50, 150, 30);

        Button b = new Button("Submit");
        b.setBounds(100, 120, 80, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Hello, " + tf.getText());
            }
        });

        f.add(l); f.add(tf); f.add(b);
        f.setSize(400, 200);
        f.setLayout(null);
        f.setVisible(true);
    }
}

