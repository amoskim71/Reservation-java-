package ReservationProject;

import java.awt.*;
import javax.swing.*;

public class ForkFrame extends JFrame {

    JLabel fork = new JLabel(new ImageIcon(ForkFrame.class.getResource("Top.png")));
    JPanel main = new JPanel();
    JLabel lblChanging = new JLabel("Welcome to SilvərPlĕte's Table Reservation program");
    
    public ForkFrame() {
        this.setEnabled(false);        
        add(main);
        main.setBackground(new Color(0, 0, 0, 0));
        main.setBounds(0, 0, 600, 90);
        main.setLayout(new BorderLayout());
        fork.setBounds(0, 0, 600, 90);
        lblChanging.setBounds(10, -2, 600, 90);
        lblChanging.setBackground(new Color(0, 0, 0, 0));
        lblChanging.setForeground(Color.BLACK);
        lblChanging.setFont(new Font("Serif", Font.ITALIC, 18));
        main.add(lblChanging);
        main.add(fork);
    }

    public static void main(String[] args) {
        ForkFrame ff = new ForkFrame();
        ff.run();
    }

    public void run() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        setUndecorated(true);
        setBackground(new Color(0, 0, 0, 0));
        setVisible(true);
    }
}