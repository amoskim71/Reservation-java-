package ReservationProject;

//Imports:
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class AboutPage extends JFrame implements ActionListener {

    //Objects
    ForkFrame ff = new ForkFrame();
    //Labels
    JTextArea taAbout = new JTextArea("The silvərplĕte was founded by the Dream Team in 2013.\n"
            + "Since then the company has been the talk of the town.\n"
            + "The silvərplĕte doesn’t take itself too seriously.\n"
            + "Guests often remark that while the interiors could be\n"
            + "called grand they are also whimsical and wonderfully comfortable.\n"
            + "Our Goal is to create a wonderful experience for our guests\n"
            + "through providing delicious food and beverages and warm hospitality.\n"
            + "Whatever you’re seeking rest assured that our staff\n"
            + "will welcome the challenge of living up to\n all of your impossible expectations.\n"
            + "We consider our business to make dreams come true.\n\n\n"
    
            +"Silverplete is a premium online restaurant reservation, table management system and a tool that helps\n"
            + " drive more revenue for restaurants and allows them to operate more efficiently. \n"
            + "It was developed by the Dream Team for restaurant owners to provide an affordable \n"
            + "and robust solution to fulfill their online reservation and guest management needs\n"
            + " and for the customers to be able to have a more efficient and easy to use reservation system.\n"
            + "Our goal is to provide a cost effective,\n"
            + "internet-based reservation solution for our restaurant \n"
            + "while offering a convenient system for customers to easily\n "
            + "book a restaurant reservation from any web-enabled device.\n "
            + "Also our system has features where\n "
            + "in it is designed for restaurant owners an easy and affordable way\n "
            + "to handle reservations in real-time, manage seating inventory,\n "
            + "and provide customers with a fast,\n "
            + "friendly way to search and reserve tables from anywhere, at anytime.\n"
            + "This reservation system was created using the Java Programming Language.\n"
            + "That also has a database management system with the use of MS Access\n"
            + "and SQL Commands");
    //Buttons
    JButton btnBack = new JButton("Back");

    public AboutPage() {
        taAbout.setLayout(new FlowLayout());
        taAbout.setBackground(null);
        taAbout.setForeground(Color.BLACK);
        taAbout.setEditable(false);
        taAbout.setBounds(15, 30, 305, 350);
        btnBack.setBounds(100, 400, 140, 30);
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                WelcomeScreen welcome = new WelcomeScreen();
                welcome.run();
                ff.dispose();
                setVisible(false);
            }
        });
        add(taAbout);
        add(btnBack);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String[] args) {
        AboutPage ab = new AboutPage();
        ab.run();
    }

    public void runFork() {
        ff.run();
        ff.setBounds(this.getLocationOnScreen().x - 158, this.getLocationOnScreen().y - 100, 600, 90);
        ff.lblChanging.setText("These are the helpful inormation about the system");
    }

    public void run() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setTitle("About");
        pack();
        setSize(350, 500);
        setLocationRelativeTo(null);
        setVisible(true);
        runFork();
    }
}
