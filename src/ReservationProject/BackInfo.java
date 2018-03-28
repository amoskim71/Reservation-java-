package ReservationProject;

//Imports:
import java.awt.*;
import javax.swing.*;

public class BackInfo extends JFrame {

    JPanel pBack = new JPanel();
    JLabel lBack = new JLabel("Note that all reserved tables and entered information will be voided");
    
    Font serif = new Font("Dialog", Font.PLAIN, 14);
    public BackInfo() {
        setSize(300, 300);
        add(pBack);
        pBack.setLayout(new FlowLayout());
        pBack.add(lBack);
        pBack.setSize(300, 300);
        lBack.setHorizontalAlignment(0);
        setUndecorated(true);
    }
    
    public static void main(String[] args){
        BackInfo bi = new BackInfo();
        bi.setVisible(true);
    }
    
}
