package ReservationProject;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class DatabaseDriver {

    Connection con;
    Statement stmt;
    ResultSet rs;

    void loadDriver() {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(),
                    "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    String getURL() {

        String dbUrlPrefix = "jdbc:odbc:Driver={Microsoft Access Driver (*.mdb)}; DBQ=";
        String pathName = System.getProperty("user.dir") + "/src/Database/";
        String dbName = "reservationdb.mdb";
        String dbUrlSuffix = ";DriverID=22;READONLY=false";
        String dbURL = dbUrlPrefix + pathName + dbName + dbUrlSuffix;

        return dbURL;
    }

    void connect() {
        String url = getURL();

        try {
            con = DriverManager.getConnection(url);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Unable to Connect", "Login Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    ResultSet selectQuery(String query) {
        loadDriver();
        connect();
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(query);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        return rs;
    }

    public void insertQuery(String query) {

        loadDriver();
        connect();
        try {
            int option = JOptionPane.showConfirmDialog(null, "Are you sure you want to add new record?",
                    "Insert Record", JOptionPane.YES_NO_OPTION);
            switch (option) {

                case JOptionPane.YES_OPTION:
                    stmt = con.createStatement();
                    stmt.execute(query);
                    JOptionPane.showMessageDialog(null, "Recorded", "Record Message", JOptionPane.PLAIN_MESSAGE);
                    break;
                case JOptionPane.NO_OPTION:
                    break;
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        closeAll();
    }

    public void deleteQuery(String query) {

        loadDriver();
        connect();

        try {
            int option = JOptionPane.showConfirmDialog(null, "Are your sure?", "Error Message", JOptionPane.YES_NO_OPTION);

            switch (option) {
                case JOptionPane.YES_OPTION:
                    stmt = con.createStatement();
                    stmt.executeUpdate(query);
                    JOptionPane.showMessageDialog(null, "Deleted", "Delete Message", JOptionPane.PLAIN_MESSAGE);
                    closeAll();
                    break;
                case JOptionPane.NO_OPTION:
                    break;
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void updateQuery(String query) {

        loadDriver();
        connect();

        try {
            //int option = JOptionPane.showConfirmDialog(null, "Are your sure?", "Confirm Message", JOptionPane.YES_NO_OPTION);

            //switch(option){
            //case JOptionPane.YES_OPTION:
            stmt = con.createStatement();
            stmt.executeUpdate(query);
                    //JOptionPane.showMessageDialog(null, "Updated", "Update Message", JOptionPane.PLAIN_MESSAGE);
            //break;
            //case JOptionPane.NO_OPTION:
            //break;
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        closeAll();
    }

    void closeAll() {
        try {
            stmt.close();
            con.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage(), "Error Message", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        DatabaseDriver dr = new DatabaseDriver();
        dr.loadDriver();
        dr.connect();
    }
}
