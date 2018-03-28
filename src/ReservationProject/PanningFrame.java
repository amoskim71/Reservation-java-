package ReservationProject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PanningFrame extends JFrame {

    public PanningFrame() {
        WelcomeScreen ws = new WelcomeScreen();
        setLayout(null);
        setUndecorated(true);
        setEnabled(true);
        setBackground(new Color(0, 0, 0, 65));
        setLocation(383, 250);
        setSize(500, 30);
        addMouseListener(new MouseAdapter() {
            public void MousePressed(MouseEvent me) {
                dispose();
            }
        });
    }

    public static void main(String[] args) {
        PanningFrame pf = new PanningFrame();
        ForkFrame ffr = new ForkFrame();
        ffr.run();
        pf.setVisible(true);
    }

}
