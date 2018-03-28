package ReservationProject;

/*
 Author DreamTeam
 Diez, John Paul
 Viaje, Robelyn D.
 Villarias, Sieg Gabriel V.
 Abelardo, Anton
 Mariano, Reñee M.
 */
//Imports:
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.UIManager.*;
import javax.swing.ImageIcon;

public class WelcomeScreen extends JFrame implements ActionListener {

    //Objects
    ForkFrame ff = new ForkFrame();
    //Menus
    JMenuBar mainBar = new JMenuBar();
    JMenuItem helpAboutItem = new JMenuItem("About");
    static JLabel time;
    //Panels:
    JPanel pnlReserve = new JPanel();
    JPanel pnlMenu = new JPanel();
    JPanel pnlExit = new JPanel();
    JPanel pnlGray1 = new JPanel();
    JPanel pnlGray2 = new JPanel();
    JPanel pnlGray3 = new JPanel();
    JPanel[] arrPanel = {pnlReserve, pnlMenu, pnlExit};
    JPanel[] arrPanelG = {pnlGray1, pnlGray2, pnlGray3};
    //Labels
    JLabel lblReserve = new JLabel("RESERVE A TABLE");
    JLabel lblMenu = new JLabel("SCAN MENU");
    JLabel lblExit = new JLabel("EXIT");
    JLabel[] arrLabel = {lblReserve, lblMenu, lblExit};

    //BG
    JLabel welcomeBG = new JLabel(new ImageIcon(WelcomeScreen.class.getResource("Welcome BG1.jpg")));
    JLabel reserveTableBG = new JLabel(new ImageIcon(WelcomeScreen.class.getResource("Reserve Table.jpg")));
    JLabel scanMenuBG = new JLabel(new ImageIcon(WelcomeScreen.class.getResource("Food Menu.jpeg")));
    JLabel exitBG = new JLabel(new ImageIcon(WelcomeScreen.class.getResource("Exit.jpg")));
    JLabel[] arrBG = {reserveTableBG, scanMenuBG, exitBG};

    //String
    String strDefault = "Welcome to SilvərPlĕte's Table Reservation program";

    //Counter
    int arrCounter = 0;
    int count = 0;
    //Extra components

    public WelcomeScreen() {
        setLayout(null);
        while (arrCounter <= 2) {
            add(arrPanelG[arrCounter]);
            arrCounter++;
        }
        add(pnlGray1);
        add(pnlReserve);
        add(pnlMenu);
        add(pnlExit);
        pnlMenu.setBounds(300, -3, 300, 200);
        pnlExit.setBounds(300, 197, 300, 50);
        pnlReserve.setBounds(0, -3, 300, 250);
        Font lblFonts = new Font(Font.SERIF, 15, 30);
        arrCounter = 0;
        while (arrCounter <= 2) {
            arrPanel[arrCounter].setLayout(new BorderLayout());
            arrPanelG[arrCounter].setLayout(new BorderLayout());

            arrLabel[arrCounter].setFont(lblFonts);

            arrPanel[arrCounter].add(arrBG[arrCounter]);

            arrBG[arrCounter].setHorizontalAlignment(0);
            arrBG[arrCounter].setVerticalAlignment(0);
            arrLabel[arrCounter].setVerticalAlignment(0);
            arrLabel[arrCounter].setHorizontalAlignment(0);

            arrPanelG[arrCounter].add(arrLabel[arrCounter]);
            arrLabel[arrCounter].setForeground(Color.BLACK);
            arrPanelG[arrCounter].setBackground(new Color(128, 128, 128, 80));
            arrCounter++;
        }
        pnlGray1.setBounds(0, -3, 300, 250);
        pnlGray2.setBounds(300, -3, 300, 200);
        pnlGray3.setBounds(300, 197, 300, 50);
        pnlGray1.setVisible(false);
        pnlGray2.setVisible(false);
        pnlGray3.setVisible(false);

        setJMenuBar(mainBar);

        JMenu helpMenu = new JMenu("Help");
        mainBar.add(helpMenu);
        helpMenu.add(helpAboutItem);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String[] args) {
        WelcomeScreen welc = new WelcomeScreen();
        welc.run();
    }

    public void run() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("Welcome");
        setSize(600, 297);
        setLocationRelativeTo(null);
        setVisible(true);
        runFork();
        addListeners();
    }

    public void runFork() {
        ff.run();
        ff.setBounds(this.getLocationOnScreen().x - 158, this.getLocationOnScreen().y - 100, 600, 90);
    }

    public void addListeners() {
        pnlReserve.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
                pnlGray1.setVisible(true);
                ff.lblChanging.setText("Reserve a table within the span of 6 months");
            }
        });
        pnlMenu.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
                pnlGray2.setVisible(true);
                ff.lblChanging.setText("Scan our restaurants delicious foods");
            }
        });
        pnlExit.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
                pnlGray3.setVisible(true);
                ff.lblChanging.setText("Exit our reservation system");
            }
        });
        pnlGray1.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent me) {
                pnlGray1.setVisible(false);
                ff.lblChanging.setText(strDefault);
            }

            public void mousePressed(MouseEvent me) {
                ReservePage res = new ReservePage();
                res.run();
                ff.dispose();
                setVisible(false);
            }
        });
        pnlGray2.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent me) {
                pnlGray2.setVisible(false);
                ff.lblChanging.setText(strDefault);
            }

            public void mousePressed(MouseEvent me) {
                MenuPage men = new MenuPage();
                men.run();
                ff.dispose();
                setVisible(false);
            }
        });
        pnlGray3.addMouseListener(new MouseAdapter() {
            public void mouseExited(MouseEvent me) {
                pnlGray3.setVisible(false);
                ff.lblChanging.setText(strDefault);
            }

            public void mousePressed(MouseEvent me) {
                System.exit(0);
                ff.dispose();
            }
        });
        helpAboutItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                AboutPage about = new AboutPage();
                about.run();
                ff.dispose();
                setVisible(false);
            }
        });
        helpAboutItem.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent me) {
                ff.lblChanging.setText("View the system's other information");
            }

            public void mouseExited(MouseEvent me) {
                ff.lblChanging.setText(strDefault);
            }
        });
    }
}
