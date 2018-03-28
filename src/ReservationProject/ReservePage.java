package ReservationProject;

//Imports:
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.sql.*;

public class ReservePage extends JFrame implements ActionListener {

    //Objects
    ForkFrame ff = new ForkFrame();
    //Button

    //The main panel:    
    JPanel panel = new JPanel();
    //The calendar:
    JPanel monthsPanel = new JPanel();
    JPanel janPanel = new JPanel();
    JPanel febPanel = new JPanel();
    JPanel marPanel = new JPanel();
    JPanel aprPanel = new JPanel();
    JPanel mayPanel = new JPanel();
    JPanel junPanel = new JPanel();
    JPanel julPanel = new JPanel();
    JPanel augPanel = new JPanel();
    JPanel sepPanel = new JPanel();
    JPanel octPanel = new JPanel();
    JPanel novPanel = new JPanel();
    JPanel decPanel = new JPanel();
    JPanel[] monthsPanels
            = {janPanel, febPanel, marPanel, aprPanel, mayPanel, junPanel, julPanel, augPanel, sepPanel, octPanel, novPanel, decPanel};

    JLabel lblJAN = new JLabel("JAN");
    JLabel lblFEB = new JLabel("FEB");
    JLabel lblMAR = new JLabel("MAR");
    JLabel lblAPR = new JLabel("APR");
    JLabel lblMAY = new JLabel("MAY");
    JLabel lblJUN = new JLabel("JUN");
    JLabel lblJUL = new JLabel("JUL");
    JLabel lblAUG = new JLabel("AUG");
    JLabel lblSEP = new JLabel("SEP");
    JLabel lblOCT = new JLabel("OCT");
    JLabel lblNOV = new JLabel("NOV");
    JLabel lblDEC = new JLabel("DEC");
    JLabel[] monthsLabels = {lblJAN, lblFEB, lblMAR, lblAPR, lblMAY, lblJUN, lblJUL, lblAUG, lblSEP, lblOCT, lblNOV, lblDEC};
    int panelArrayCounter = 0;

    JPanel daysPanel = new JPanel();
    String[] days = {"Day:", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10",
        "11", "12", "13", "14", "15", "16", "17", "18", "19", "20",
        "21", "22", "23", "24", "25", "26", "27", "28", "29", "30",
        "31"};
    JLabel day1 = new JLabel(days[1]);
    JLabel day2 = new JLabel(days[2]);
    JLabel day3 = new JLabel(days[3]);
    JLabel day4 = new JLabel(days[4]);
    JLabel day5 = new JLabel(days[5]);
    JLabel day6 = new JLabel(days[6]);
    JLabel day7 = new JLabel(days[7]);
    JLabel day8 = new JLabel(days[8]);
    JLabel day9 = new JLabel(days[9]);
    JLabel day10 = new JLabel(days[10]);
    JLabel day11 = new JLabel(days[11]);
    JLabel day12 = new JLabel(days[12]);
    JLabel day13 = new JLabel(days[13]);
    JLabel day14 = new JLabel(days[14]);
    JLabel day15 = new JLabel(days[15]);
    JLabel day16 = new JLabel(days[16]);
    JLabel day17 = new JLabel(days[17]);
    JLabel day18 = new JLabel(days[18]);
    JLabel day19 = new JLabel(days[19]);
    JLabel day20 = new JLabel(days[20]);
    JLabel day21 = new JLabel(days[21]);
    JLabel day22 = new JLabel(days[22]);
    JLabel day23 = new JLabel(days[23]);
    JLabel day24 = new JLabel(days[24]);
    JLabel day25 = new JLabel(days[25]);
    JLabel day26 = new JLabel(days[26]);
    JLabel day27 = new JLabel(days[27]);
    JLabel day28 = new JLabel(days[28]);
    JLabel day29 = new JLabel(days[29]);
    JLabel day30 = new JLabel(days[30]);
    JLabel day31 = new JLabel(days[31]);
    JLabel empty = new JLabel("");
    JLabel empty1 = new JLabel("");
    JLabel empty2 = new JLabel("");
    JLabel empty3 = new JLabel("");
    JLabel[] daysLabels = {day1, day2, day3, day4, day5, day6, day7, day8,
        day9, day10, day11, day12, day13, day14, day15, day16, day17, day18, day19,
        day20, day21, day22, day23, day24, day25, day26, day27, day28, day29, day30,
        day31, empty, empty1, empty2, empty3,};

    //Table choices:
    JPanel tablesPanel = new JPanel();
    JPanel table21 = new JPanel();
    JPanel table22 = new JPanel();
    JPanel table23 = new JPanel();
    JPanel table24 = new JPanel();
    JPanel table41 = new JPanel();
    JPanel table42 = new JPanel();
    JPanel table43 = new JPanel();
    JPanel table44 = new JPanel();
    JPanel table61 = new JPanel();
    JPanel table62 = new JPanel();
    JPanel table63 = new JPanel();
    JPanel table64 = new JPanel();
    JPanel[] tables = {table21, table22, table23, table24, table41, table42, table43,
        table44, table61, table62, table63, table64};

    //For time choices:
    JLabel lblTime = new JLabel("Time(hh/mm):");
    JLabel lblSlash = new JLabel("/");
    String[] Hours = {"10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22"};
    String[] minutes = {"00", "30"};
    JComboBox combHours = new JComboBox(Hours);
    JComboBox combMinutes = new JComboBox(minutes);

    //For date choices:
    JLabel lblDate = new JLabel("Date:");

    String[] months = {"Month:", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug",
        "Sep", "Oct", "Nov", "Dec"};
    int arrayCounter = 0;
    JComboBox combDays = new JComboBox(days);
    JComboBox combMonths = new JComboBox(months);

    //For table for how many people choices:
    JLabel lblPeople = new JLabel("Table for:");
    String[] tablefor = {"1", "2", "3", "4", "5", "6", "7", "8"};
    JComboBox combPeople = new JComboBox(tablefor);
    JLabel lblNull = new JLabel("");

    //BG
//    JLabel background = new JLabel(new ImageIcon(ReservePage.class.getResource("Reserve screen BG1.png")));

    //Realtime management:
    Calendar calendar = Calendar.getInstance();
    int month = (calendar.get(Calendar.MONTH));

    //For frame management
    JButton btnBack = new JButton("Back");
    JButton btnConfirm = new JButton("Confirm");

    //For information
    JLabel lblFillUp = new JLabel("Please fill up all fields to continue");

    String select;
    String strDefault = "Set the date of your reservation";

    String[] fields = {"ReceiptNumber", "Date_of_reservation", "Time_of_reservation", "Number_of_seats", "Table_Number"};

    public ReservePage() {
        //Panel settings
        add(panel);
        panel.setBorder(BorderFactory.createLineBorder(Color.black));
        panel.setLayout(null);
        panel.add(lblTime);
        panel.add(combMinutes);
        panel.add(combDays);
        panel.add(combMonths);
        panel.add(lblSlash);
        panel.add(lblDate);
        panel.add(lblPeople);
        panel.add(combPeople);
        panel.add(lblNull);
        panel.add(combHours);
        panel.add(monthsPanel);
        panel.add(daysPanel);
        panel.add(btnBack);
        panel.add(btnConfirm);
        panel.add(lblFillUp);

        //Calendar:
        monthsPanel.setBackground(Color.WHITE);
        monthsPanel.setBounds(60, 180, 450, 350);
        monthsPanel.setLayout(new GridLayout(3, 4));
        Font monthsFont = new Font("SansSerif", Font.BOLD, 30);
        while (panelArrayCounter <= 11) {
            monthsPanel.add(monthsPanels[panelArrayCounter]);
            monthsPanels[panelArrayCounter].setBorder(BorderFactory.createLineBorder(Color.black));
            monthsPanels[panelArrayCounter].add(monthsLabels[panelArrayCounter]);
            monthsLabels[panelArrayCounter].setFont(monthsFont);
            monthsPanels[panelArrayCounter].setBackground(Color.WHITE);
            monthsLabels[panelArrayCounter].setForeground(Color.BLACK);
            panelArrayCounter++;
        }
        int labelArrayCounter = 0;
        daysPanel.setBackground(Color.WHITE);
        daysPanel.setBounds(60, 180, 450, 350);
        daysPanel.setLayout(new GridLayout(5, 7));
        Font daysFont = new Font("Serif", Font.BOLD, 25);
        while (labelArrayCounter <= 34) {
            daysPanel.add(daysLabels[labelArrayCounter]);
            daysLabels[labelArrayCounter].setBorder(BorderFactory.createLineBorder(Color.black));
            daysLabels[labelArrayCounter].setForeground(Color.BLACK);
            daysLabels[labelArrayCounter].setHorizontalAlignment(0);
            daysLabels[labelArrayCounter].setFont(daysFont);
            labelArrayCounter++;
        }

        //Day choices
        lblDate.setBounds(80, 70, 150, 25);
        combMonths.setBounds(180, 70, 70, 25);
        combDays.setBounds(260, 70, 55, 25);
        combDays.setEnabled(false);

        //Removing of months that has passed in the combo box and calendar 
        while (month >= 1) {
            combMonths.removeItemAt(month);
            month--;
            monthsPanels[month].setBackground(new Color(224, 224, 224));
            monthsLabels[month].setForeground(Color.LIGHT_GRAY);
        }
        //Removing of months that is beyond six months from today in the
        //combo box
        int monthCount = combMonths.getItemCount() - 1;
        while (monthCount > 6) {
            combMonths.removeItemAt(monthCount);
            monthCount--;
        };
        //Removing of months that is beyond six months from today in the
        //calendar
        monthCount = (calendar.get(Calendar.MONTH)) + 6;
        while (monthCount < 12) {
            monthsPanels[monthCount].setBackground(new Color(224, 224, 224));
            monthsLabels[monthCount].setForeground(Color.LIGHT_GRAY);
            monthCount++;
        }
        //Adding months that has been removed and is inside six months from 
        //today in the combo box and calendar
        int adder = 1;
        monthCount = combMonths.getItemCount() - 1;
        while (monthCount < 6) {
            monthCount = combMonths.getItemCount();
            combMonths.addItem(months[adder]);
            monthsPanels[adder - 1].setBackground(Color.WHITE);
            monthsLabels[adder - 1].setForeground(Color.BLACK);
            adder++;
        }

        //Time choices
        lblTime.setBounds(80, 100, 80, 25);
        lblSlash.setBounds(230, 100, 10, 25);
        combHours.setBounds(180, 100, 40, 25);
        combMinutes.setBounds(230, 100, 40, 25);
        combHours.setEnabled(false);
        combMinutes.setEnabled(false);

        //Table for how many
        lblPeople.setBounds(80, 130, 150, 25);
        combPeople.setBounds(180, 130, 40, 25);
        lblNull.setBounds(230, 130, 70, 25);
        lblNull.setText("person");
        combPeople.setEnabled(false);

        //Back button        
        btnBack.setBounds(420, 40, 90, 25);
        //Confirm button
        btnConfirm.setBounds(420, 80, 90, 25);
        //Information Label
        lblFillUp.setBounds(80, 40, 200, 25);

        //Action listeners:
        combMonths.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (combMonths.getSelectedIndex() != 0) {
                    monthsPanel.setVisible(false);
                    daysPanel.setVisible(true);
                } else {
                    monthsPanel.setVisible(true);
                    daysPanel.setVisible(false);
                }
                if (combMonths.getSelectedIndex() == 0) {
                    combDays.setEnabled(false);
                    combHours.setEnabled(false);
                    combMinutes.setEnabled(false);
                    combPeople.setEnabled(false);
                } else {
                    combDays.setEnabled(true);
                }
                if (combMonths.getSelectedItem().equals("Feb")) {
                    combDays.removeAllItems();
                    arrayCounter = 0;
                    while (arrayCounter < 29) {
                        combDays.addItem(days[arrayCounter]);
                        arrayCounter++;
                    }
                    daysLabels[28].setForeground(Color.LIGHT_GRAY);
                    daysLabels[29].setForeground(Color.LIGHT_GRAY);
                    daysLabels[30].setForeground(Color.LIGHT_GRAY);

                } else if (combMonths.getSelectedItem().equals("Apr")
                        || combMonths.getSelectedItem().equals("Jun")
                        || combMonths.getSelectedItem().equals("Sep")
                        || combMonths.getSelectedItem().equals("Nov")) {
                    combDays.removeAllItems();
                    arrayCounter = 0;
                    while (arrayCounter < 31) {
                        combDays.addItem(days[arrayCounter]);
                        daysLabels[arrayCounter].setForeground(Color.BLACK);
                        arrayCounter++;
                    }
                    daysLabels[30].setForeground(Color.LIGHT_GRAY);

                } else if (combMonths.getSelectedItem().equals("Jan")
                        || combMonths.getSelectedItem().equals("Mar")
                        || combMonths.getSelectedItem().equals("May")
                        || combMonths.getSelectedItem().equals("Jul")
                        || combMonths.getSelectedItem().equals("Aug")
                        || combMonths.getSelectedItem().equals("Oct")
                        || combMonths.getSelectedItem().equals("Dec")) {
                    combDays.removeAllItems();
                    arrayCounter = 0;
                    while (arrayCounter < 32) {
                        combDays.addItem(days[arrayCounter]);
                        daysLabels[arrayCounter].setForeground(Color.BLACK);
                        arrayCounter++;
                    }
                }
                if (combMonths.getSelectedIndex() == 1) {
                    int day = (calendar.get(Calendar.DAY_OF_MONTH)) - 1;
                    while (day >= 1) {
                        combDays.removeItemAt(day);
                        daysLabels[day - 1].setForeground(Color.LIGHT_GRAY);
                        day--;
                    }
                }
            }
        });
        combDays.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (combDays.getSelectedIndex() == 0 && calendar.get(Calendar.DAY_OF_MONTH) != 2) {
                    int allBlack = 0;
                    while (allBlack < combDays.getItemCount() - 1) {
                        daysLabels[allBlack].setForeground(Color.BLACK);
                        allBlack++;
                    }
                }
                if (combDays.getSelectedIndex() == 0) {
                    combHours.setEnabled(false);
                    combMinutes.setEnabled(false);
                    combPeople.setEnabled(false);
                }
                if ((combDays.getItemCount() == 32 || combDays.getItemCount() == 31
                        || combDays.getItemCount() == 29) && (((calendar.get(Calendar.DAY_OF_MONTH) == 4 && combDays.getItemCount()
                        == 29) == false) && ((calendar.get(Calendar.DAY_OF_MONTH) == 4 && combDays.getItemCount()
                        == 28) == false)) && (((calendar.get(Calendar.DAY_OF_MONTH) == 3 && combDays.getItemCount()
                        == 29) == false) && ((calendar.get(Calendar.DAY_OF_MONTH) == 3 && combDays.getItemCount()
                        == 28) == false))) {
                    arrayCounter = 0;
                    while (arrayCounter < combDays.getItemCount() - 1) {
                        daysLabels[arrayCounter].setForeground(Color.BLACK);
                        arrayCounter++;
                    }
                    if (calendar.get(Calendar.DAY_OF_MONTH) == 2 && combDays.getSelectedIndex() == 0 && combMonths.getSelectedIndex() == 1) {
                        daysLabels[0].setForeground(Color.LIGHT_GRAY);
                    }
                    if (calendar.get(Calendar.DAY_OF_MONTH) == 2 && combMonths.getSelectedIndex() == 1) {
                        daysLabels[combDays.getSelectedIndex()].setForeground(Color.GREEN);
                        daysLabels[0].setForeground(Color.LIGHT_GRAY);
                    } else if (combDays.getSelectedIndex() != 0) {
                        daysLabels[combDays.getSelectedIndex() - 1].setForeground(Color.GREEN);
                        daysLabels[combDays.getItemCount() - 1].setForeground(Color.LIGHT_GRAY);
                    }
                    if (combDays.getSelectedIndex() != 0) {
                        combHours.setEnabled(true);
                        combMinutes.setEnabled(true);
                        combPeople.setEnabled(true);
                    }
                } else {
                    if (combDays.getSelectedIndex() != 0) {
                        combHours.setEnabled(true);
                        combMinutes.setEnabled(true);
                        combPeople.setEnabled(true);
                    }
                    int day = ((calendar.get(Calendar.DAY_OF_MONTH)) - 1);
                    if ((day == 1) && (combDays.getSelectedIndex() == 1)) {
                        daysLabels[1].setForeground(Color.GREEN);
                    }
                    while (day < ((calendar.get(Calendar.DAY_OF_MONTH)) - 1) + (combDays.getItemCount() - 1)) {
                        daysLabels[day].setForeground(Color.BLACK);
                        day++;
                    }
                    day = ((calendar.get(Calendar.DAY_OF_MONTH)) - 1);
                    if (day > 1) {
                        daysLabels[(calendar.get(Calendar.DAY_OF_MONTH) - 1) + (combDays.getSelectedIndex() - 1)].setForeground(Color.GREEN);
                    }
                    while (day >= 1) {
                        daysLabels[day - 1].setForeground(Color.LIGHT_GRAY);
                        day--;
                    }
                }
            }
        }
        );
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                WelcomeScreen wscr = new WelcomeScreen();
                wscr.run();
                ff.dispose();
                dispose();
            }
        });
        btnBack.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                ff.lblChanging.setText("Return to the Welcome Screen");
            }

            public void mouseExited(MouseEvent e) {
                ff.lblChanging.setText(strDefault);
            }
        });
        combMonths.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                ff.lblChanging.setText("Select the month of your reservation");
            }

            public void mouseExited(MouseEvent e) {
                ff.lblChanging.setText(strDefault);
            }
        });
        combDays.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                ff.lblChanging.setText("Select the day of your reservation");
            }

            public void mouseExited(MouseEvent e) {
                ff.lblChanging.setText(strDefault);
            }
        });
        combHours.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                ff.lblChanging.setText("Select the hour of your reservation");
            }

            public void mouseExited(MouseEvent e) {
                ff.lblChanging.setText(strDefault);
            }
        });
        combPeople.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                ff.lblChanging.setText("Select the desired number of seats");
            }

            public void mouseExited(MouseEvent e) {
                ff.lblChanging.setText(strDefault);
            }
        });
        btnConfirm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if ((combMonths.getSelectedIndex()) == 0 || combDays.getSelectedIndex() == 0) {
                    JOptionPane.showMessageDialog(null, "Please complete all required information", "", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    String reserveDate = combDays.getSelectedItem().toString() + "-" + combMonths.getSelectedItem().toString() + "-14";
                    String reserveTime = combHours.getSelectedItem().toString() + ":" + combMinutes.getSelectedItem().toString();

                    TablesPage tp = new TablesPage();
//                    DatabaseDriver db = new DatabaseDriver();
//                    ReceiptNoGet rng = new ReceiptNoGet();                    
//                    rng.getReceiptNumber();                
                    
                    tp.indexPPLSelected = combPeople.getSelectedIndex();
//                    db.insertQuery("INSERT INTO Reservation (ReceiptNumber, Date_of_reservation, Time_of_reservation, Number_of_seats)"
//                            + "VALUES (" + (rng.receiptNo+1)
//                            + ", '" + reserveDate + "', '" + reserveTime + "', '" + (combPeople.getSelectedIndex() + 1) + "')");
                    ff.dispose();
                    tp.run();
                    setVisible(false);
                }
            }
        });
        btnConfirm.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                ff.lblChanging.setText("Confirm your reservation");
            }

            public void mouseExited(MouseEvent e) {
                ff.lblChanging.setText(strDefault);
            }
        });
        combPeople.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                if (combPeople.getSelectedItem().equals("1")) {
                    lblNull.setText("person");
                } else {
                    lblNull.setText("people");
                }
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
    }

    public static void main(String[] args) {
        ReservePage rp = new ReservePage();
        rp.run();
    }

    public void run() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new CardLayout());
        setResizable(false);
        pack();
        setSize(575, 600);
        setLocationRelativeTo(null);
        setTitle("Reservation Page");
        setVisible(true);
        runFork();
    }

    public void runFork() {
        ff.run();
        ff.setBounds(this.getLocationOnScreen().x - 158, this.getLocationOnScreen().y - 80, 600, 90);
        ff.lblChanging.setText(strDefault);
    }

}
