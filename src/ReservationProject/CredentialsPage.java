package ReservationProject;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class CredentialsPage extends JFrame {

    //Objects
    ForkFrame ff = new ForkFrame();

    JLabel lblInfo = new JLabel("Please fill up all fields");
    JLabel lblLastName = new JLabel("Last Name:");
    JLabel lblFirstName = new JLabel("First Name:");
    JLabel lblMiddleInitial = new JLabel("Middle Name:");
    JLabel lblContact = new JLabel("Contact number:");
    JLabel lblEmail = new JLabel("Email address:");
    JLabel[] lblArray = {lblLastName, lblFirstName, lblMiddleInitial, lblContact, lblEmail};

    JTextField tfLastName = new JTextField();
    JTextField tfContact = new JTextField();
    JTextField tfEmail = new JTextField();
    JTextField tfFirstName = new JTextField();
    JTextField tfMiddleInitial = new JTextField();
    JTextField[] tfArray = {tfLastName, tfContact, tfEmail, tfFirstName, tfMiddleInitial};

    String[] fields = {"LastName", "FirstName", "MiddleName", "ContactNumber", "EmailAddress"};

    JButton btnSave = new JButton("Confirm");
    JButton btnClear = new JButton("Clear");
    JButton btnBack = new JButton("Back");
    JButton[] buttons = {btnSave, btnClear, btnBack};

    Font serif = new Font("Dialog", Font.PLAIN, 14);
    int arrayCounter = 0;
    int y = 55;
    int x = 10;

    String strDefault = "Enter the required information";

    public CredentialsPage() {
        setLayout(null);

        add(lblInfo);
        lblInfo.setBounds(20, 20, 200, 25);
        lblInfo.setFont(serif);
        while (arrayCounter <= 4) {
            add(lblArray[arrayCounter]);
            lblArray[arrayCounter].setFont(serif);
            lblArray[arrayCounter].setBounds(20, y, 135, 25);
            arrayCounter++;
            y += 35;
        }
        arrayCounter = 0;
        y = 55;
        while (arrayCounter <= 4) {
            add(tfArray[arrayCounter]);
            tfArray[arrayCounter].setBounds(160, y, 170, 25);
            arrayCounter++;
            y += 35;
        }
        arrayCounter = 0;
        while (arrayCounter <= 2) {
            add(buttons[arrayCounter]);
            buttons[arrayCounter].setBounds(x, 245, 100, 25);
            arrayCounter++;
            x += 118;
        }
        btnSave.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
//              DatabaseDriver db = new DatabaseDriver();
//              ReceiptNoGet rng = new ReceiptNoGet();
//              rng.getReceiptNumber();

                arrayCounter = 0;
//              db.insertQuery("INSERT INTO Registration (ReceiptNumber) VALUES (" + rng.receiptNo + ")");
//              while (arrayCounter <= 4) {
//                  db.updateQuery(updateRecord());
//                  arrayCounter++;
//              }
                int option = JOptionPane.showConfirmDialog(null, "Thank you for your reservation!\nWould you like to make a new transaction?", "New transaction",
                    JOptionPane.YES_NO_OPTION);
                if (option == JOptionPane.YES_OPTION) {
                    WelcomeScreen ws = new WelcomeScreen();
                    ws.run();
                    ff.dispose();
                    setVisible(false);
                } else {
                    System.exit(0);
                    setVisible(false);
                }
            }
        });

        btnSave.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                ff.lblChanging.setText("Save credentials to database");
            }

            public void mouseExited(MouseEvent e) {
                ff.lblChanging.setText(strDefault);
            }
        });
        btnClear.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                ff.lblChanging.setText("Clear all fields");
            }

            public void mouseExited(MouseEvent e) {
                ff.lblChanging.setText(strDefault);
            }

            public void mousePressed(MouseEvent e) {
                arrayCounter = 0;
                while (arrayCounter <= 4) {
                    tfArray[arrayCounter].setText("");
                    arrayCounter++;
                }
            }
        });

        btnBack.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                ff.lblChanging.setText("Return to the Reservation Page");
            }

            public void mouseExited(MouseEvent e) {
                ff.lblChanging.setText(strDefault);
            }

            public void mousePressed(MouseEvent e) {
                TablesPage tp = new TablesPage();
                ff.dispose();
                tp.run();
            }
        });
    }

    public static void main(String[] args) {
        CredentialsPage cp = new CredentialsPage();
        cp.run();
    }

    public void run() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Personal information");
        pack();
        setSize(365, 330);
        setLocationRelativeTo(null);
        setVisible(true);
        runFork();
    }

    public void runFork() {
        ff.run();
        ff.setBounds(this.getLocationOnScreen().x - 158, this.getLocationOnScreen().y - 100, 600, 90);
        ff.lblChanging.setText(strDefault);
    }

    public String updateRecord() {
        ReceiptNoGet rng = new ReceiptNoGet();
        rng.getReceiptNumber();
        String query[] = {"UPDATE Registration SET " + fields[arrayCounter] + "= '" + tfArray[arrayCounter].getText() + "'"
            + "WHERE ReceiptNumber = "+ rng.receiptNo,      
            "UPDATE Registration SET " + fields[arrayCounter] + "= '" + tfArray[arrayCounter].getText() + "'"
            + "WHERE ReceiptNumber = "+ rng.receiptNo,
            "UPDATE Registration SET " + fields[arrayCounter] + "= '" + tfArray[arrayCounter].getText() + "'"
            + "WHERE ReceiptNumber = "+ rng.receiptNo,
            "UPDATE Registration SET " + fields[arrayCounter] + "= '" + tfArray[arrayCounter].getText() + "'"
            + "WHERE ReceiptNumber = "+ rng.receiptNo,
            "UPDATE Registration SET " + fields[arrayCounter] + "= '" + tfArray[arrayCounter].getText() + "'"
            + "WHERE ReceiptNumber = "+ rng.receiptNo
        };
        return query[arrayCounter];
    }

}
