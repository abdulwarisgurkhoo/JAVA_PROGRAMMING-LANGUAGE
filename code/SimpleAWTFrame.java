import java.awt.*;
import java.awt.event.*;

public class SimpleAWTFrame {
    public static void main(String[] args) {
        Frame frame = new Frame("AWT Example");
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        Button btn1 = new Button("Button 1");
        Button btn2 = new Button("Button 2");
        Button btn3 = new Button("Button 3");
        Button btn4 = new Button("Button 4");

        frame.add(btn1);
        frame.add(btn2);
        frame.add(btn3);
        frame.add(btn4);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                frame.dispose();
            }
        });

        frame.setVisible(true);
    }
}