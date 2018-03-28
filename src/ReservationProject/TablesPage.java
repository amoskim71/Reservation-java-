package ReservationProject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TablesPage extends JFrame implements MouseListener {

    //Object
    ForkFrame ff = new ForkFrame();
    
    JPanel table21 = new JPanel();
    JPanel table22 = new JPanel();
    JPanel table23 = new JPanel();
    JPanel table24 = new JPanel();
    JPanel table25 = new JPanel();
    JPanel table41 = new JPanel();
    JPanel table42 = new JPanel();
    JPanel table43 = new JPanel();
    JPanel table44 = new JPanel();
    JPanel table61 = new JPanel();
    JPanel table62 = new JPanel();
    JPanel table63 = new JPanel();
    JPanel table64 = new JPanel();
    JPanel table81 = new JPanel();
    JPanel table82 = new JPanel();
    
    JPanel[] tablesArray
            = {table21, table22, table23, table24, table25, table41, table42, table43, table44,
                table61, table62, table63, table64, table81, table82};
    
    JPanel table1 = new JPanel();
    JPanel table2 = new JPanel();
    JPanel table3 = new JPanel();
    JPanel table4 = new JPanel();
    JPanel table5 = new JPanel();
    JPanel table6 = new JPanel();
    JPanel table7 = new JPanel();
    JPanel table8 = new JPanel();
    JPanel table9 = new JPanel();
    JPanel table10 = new JPanel();
    JPanel table11 = new JPanel();
    JPanel table12 = new JPanel();
    JPanel table13 = new JPanel();
    JPanel table14 = new JPanel();
    JPanel table15 = new JPanel();
    
    JPanel[] tableGray
            = {table1, table2, table3, table4, table5, table6, table7, table8, table9, table10, table11, table12, table13, table14, table15};
    
    JLabel lblTable1 = new JLabel("#1");
    JLabel lblTable2 = new JLabel("#2");
    JLabel lblTable3 = new JLabel("#3");
    JLabel lblTable4 = new JLabel("#4");
    JLabel lblTable5 = new JLabel("#5");
    JLabel lblTable6 = new JLabel("#6");
    JLabel lblTable7 = new JLabel("#7");
    JLabel lblTable8 = new JLabel("#8");
    JLabel lblTable9 = new JLabel("#9");
    JLabel lblTable10 = new JLabel("#10");
    JLabel lblTable11 = new JLabel("#11");
    JLabel lblTable12 = new JLabel("#12");
    JLabel lblTable13 = new JLabel("#13");
    JLabel lblTable14 = new JLabel("#14");
    JLabel lblTable15 = new JLabel("#15");
    JLabel[] lblTables
            = {lblTable1, lblTable2, lblTable3, lblTable4, lblTable5, lblTable6, lblTable7, lblTable8, lblTable9,
                lblTable10, lblTable11, lblTable12, lblTable13, lblTable14, lblTable15};
    
    JPanel pnlBack = new JPanel();
    JLabel lblBack = new JLabel("Go back");
    JPanel clear = new JPanel();
    
    int arrayCounter = 0;
    int x = 35;
    
    int indexPPLSelected;    
    
    String strDefault = "Choose the table number within the available tables";
    
    JTextArea info = new JTextArea("                           Double click the desired table to reserve\n"
            + "                              Right-click the panel for more options");
    Font serif = new Font("Dialog", Font.PLAIN, 14);
    
    public TablesPage() {
        setLayout(null);
        info.setFont(serif);
        info.setLayout(new FlowLayout());
        info.setEditable(false);
        info.setAlignmentX(0);
        info.setBackground(new Color(0, 0, 0, 0));
        add(pnlBack);
        add(info);
        info.setBounds(0, 550, 600, 50);
        pnlBack.setLayout(new BorderLayout());
        pnlBack.add(lblBack, BorderLayout.CENTER);
        lblBack.setHorizontalAlignment(0);
        lblBack.setFont(new Font("Sans Serif", Font.PLAIN, 13));
        pnlBack.setVisible(false);
        pnlBack.setSize(100, 25);
        pnlBack.setBackground(Color.WHITE);
        pnlBack.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        addMouseListener(new MouseAdapter() {
            public void mousePressed(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON3) {
                    pnlBack.setLocation(getMousePosition().x, getMousePosition().y - 20);
                    pnlBack.setVisible(true);
                    
                } else {
                    pnlBack.setVisible(false);
                }
            }
        });
        pnlBack.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                pnlBack.setBackground(new Color(224, 224, 224));
                ff.lblChanging.setText("Go back to the reserve screen");
            }
            
            public void mouseExited(MouseEvent e) {
                pnlBack.setBackground(Color.WHITE);
                ff.lblChanging.setText(strDefault);
            }
            
            public void mousePressed(MouseEvent e) {
                ReservePage rp = new ReservePage();
                ff.dispose();
                rp.run();
                setVisible(false);
            }
        });
        
        while (arrayCounter <= 4) {
            add(tableGray[arrayCounter]);
            add(tablesArray[arrayCounter]);
            tablesArray[arrayCounter].setBounds(x, 35, 45, 45);
            tablesArray[arrayCounter].setBackground(Color.WHITE);
            tablesArray[arrayCounter].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            tableGray[arrayCounter].setBackground(new Color(128, 255, 128, 64));
            tableGray[arrayCounter].setVisible(false);
            tableGray[arrayCounter].setBounds(x, 35, 45, 45);
            x += 93;
            tablesArray[arrayCounter].addMouseListener(this);
            tableGray[arrayCounter].addMouseListener(this);
            arrayCounter++;
        }
        x = 35;
        while (arrayCounter <= 8) {
            add(tableGray[arrayCounter]);
            add(tablesArray[arrayCounter]);
            tablesArray[arrayCounter].setBounds(x, 150, 65, 65);
            tablesArray[arrayCounter].setBackground(Color.WHITE);
            tablesArray[arrayCounter].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            tableGray[arrayCounter].setBackground(new Color(128, 255, 128, 64));
            tableGray[arrayCounter].setVisible(false);
            tableGray[arrayCounter].setBounds(x, 150, 65, 65);
            x += 118;
            tablesArray[arrayCounter].addMouseListener(this);
            tableGray[arrayCounter].addMouseListener(this);
            arrayCounter++;
        }
        x = 35;
        while (arrayCounter <= 12) {
            add(tableGray[arrayCounter]);
            add(tablesArray[arrayCounter]);
            tablesArray[arrayCounter].setBounds(x, 300, 65, 65);
            tablesArray[arrayCounter].setBackground(Color.WHITE);
            tablesArray[arrayCounter].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            tableGray[arrayCounter].setBackground(new Color(128, 255, 128, 64));
            tableGray[arrayCounter].setVisible(false);
            tableGray[arrayCounter].setBounds(x, 300, 65, 65);
            x += 118;
            tablesArray[arrayCounter].addMouseListener(this);
            tableGray[arrayCounter].addMouseListener(this);
            arrayCounter++;
        }
        x = 70;
        while (arrayCounter <= 14) {
            add(tableGray[arrayCounter]);
            add(tablesArray[arrayCounter]);
            tablesArray[arrayCounter].setBounds(x, 450, 120, 80);
            tablesArray[arrayCounter].setBackground(Color.WHITE);
            tablesArray[arrayCounter].setBorder(BorderFactory.createLineBorder(Color.BLACK));
            tableGray[arrayCounter].setBackground(new Color(128, 255, 128, 64));
            tableGray[arrayCounter].setVisible(false);
            tableGray[arrayCounter].setBounds(x, 450, 120, 80);
            x += 220;
            tablesArray[arrayCounter].addMouseListener(this);
            tableGray[arrayCounter].addMouseListener(this);
            arrayCounter++;
        }
        arrayCounter = 0;
        Font fntTable = new Font("Sans Serif", Font.ITALIC, 10);
        while (arrayCounter <= 14) {
            tableGray[arrayCounter].setLayout(new FlowLayout());
            tablesArray[arrayCounter].setLayout(new FlowLayout());
            tableGray[arrayCounter].add(lblTables[arrayCounter]);
            tablesArray[arrayCounter].add(lblTables[arrayCounter]);
            lblTables[arrayCounter].setForeground(Color.BLACK);
            lblTables[arrayCounter].setFont(fntTable);
            arrayCounter++;
        }
    }
    
    public static void main(String[] args) {
        TablesPage tb = new TablesPage();
        tb.run();
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
    }
    
    @Override
    public void mousePressed(MouseEvent e) {
        arrayCounter = 0;
        while (arrayCounter <= 14) {
            if (e.getSource() == tableGray[arrayCounter]) {
                tablesArray[arrayCounter].setBackground(new Color(128, 255, 128));
                arrayCounter++;
                if (arrayCounter == 15) {
                    break;
                }
            }
            tablesArray[arrayCounter].setBackground(Color.WHITE);
            tableGray[arrayCounter].setBackground(new Color(128, 255, 128, 64));
            arrayCounter++;
        }
        disableTables();
        pnlBack.setVisible(false);
        if (e.getClickCount() == 2) {
            arrayCounter = 0;
            while (e.getSource() != tableGray[arrayCounter]) {
                arrayCounter++;
            }
            String tableRes = lblTables[arrayCounter].getText();
            int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to reserve table " + tableRes + "?", "Confirm table",
                    JOptionPane.YES_NO_OPTION);
            if (option == JOptionPane.YES_OPTION) {
//                ReceiptNoGet rng = new ReceiptNoGet();
//                rng.getReceiptNumber();
//                DatabaseDriver db = new DatabaseDriver();                
//                db.updateQuery("UPDATE Reservation SET Table_Number = "+(arrayCounter+1)+" WHERE Receiptnumber = "+ rng.receiptNo);
                CredentialsPage cp = new CredentialsPage();
                ff.dispose();
                cp.run();
                setVisible(false);
            }
        }
    }
    
    @Override
    public void mouseReleased(MouseEvent e) {
    }
    
    @Override
    public void mouseEntered(MouseEvent e) {
        arrayCounter = 0;
        while (arrayCounter <= 14) {
            if (e.getSource() == tablesArray[arrayCounter]) {
                String table = "Reserve table " + lblTables[arrayCounter].getText();
                ff.lblChanging.setText(table);
                tableGray[arrayCounter].setVisible(true);
                arrayCounter++;
            }
            arrayCounter++;
        }
    }
    
    @Override
    public void mouseExited(MouseEvent e) {
        arrayCounter = 0;
        while (arrayCounter <= 14) {
            if (e.getSource() == tableGray[arrayCounter]) {
                ff.lblChanging.setText(strDefault);
                tableGray[arrayCounter].setVisible(false);
                arrayCounter++;
            }
            arrayCounter++;
        }
    }
    
    public void run() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Tables available for reservation");
        pack();
        setSize(500, 630);
        setLocationRelativeTo(null);
        setVisible(true);
        disableTables();
        runFork();
    }
    
    public void runFork() {
        ff.run();
        ff.setBounds(this.getLocationOnScreen().x - 158, this.getLocationOnScreen().y - 80, 600, 90);
        ff.lblChanging.setText(strDefault);
    }
    
    public void disableTables() {
        if (indexPPLSelected == 0 || indexPPLSelected == 1) {
            arrayCounter = 5;
            while (arrayCounter <= 14) {
                tablesArray[arrayCounter].removeMouseListener(this);
                tablesArray[arrayCounter].setBackground(Color.LIGHT_GRAY);
                arrayCounter++;
            }
        } else if (indexPPLSelected == 2 || indexPPLSelected == 3) {
            arrayCounter = 0;
            while (arrayCounter <= 4) {
                tablesArray[arrayCounter].removeMouseListener(this);
                tablesArray[arrayCounter].setBackground(Color.LIGHT_GRAY);
                arrayCounter++;
            }
            arrayCounter = 9;
            while (arrayCounter <= 14) {
                tablesArray[arrayCounter].removeMouseListener(this);
                tablesArray[arrayCounter].setBackground(Color.LIGHT_GRAY);
                arrayCounter++;
            }
        } else if (indexPPLSelected == 4 || indexPPLSelected == 5) {
            arrayCounter = 0;
            while (arrayCounter <= 8) {
                tablesArray[arrayCounter].removeMouseListener(this);
                tablesArray[arrayCounter].setBackground(Color.LIGHT_GRAY);
                arrayCounter++;
            }
            arrayCounter = 13;
            while (arrayCounter <= 14) {
                tablesArray[arrayCounter].removeMouseListener(this);
                tablesArray[arrayCounter].setBackground(Color.LIGHT_GRAY);
                arrayCounter++;
            }
        } else {
            arrayCounter = 0;
            while (arrayCounter <= 12) {
                tablesArray[arrayCounter].removeMouseListener(this);
                tablesArray[arrayCounter].setBackground(Color.LIGHT_GRAY);
                arrayCounter++;
            }
        }
    }
    
}
