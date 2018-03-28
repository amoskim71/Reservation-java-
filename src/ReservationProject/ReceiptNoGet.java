package ReservationProject;

//Imports:
import java.sql.*;

public class ReceiptNoGet extends DatabaseDriver {

    int receiptNo;

    public void getReceiptNumber() {
        ResultSet res = selectQuery("SELECT ReceiptNumber FROM Reservation");

        try {
            while (res.next()) {
                receiptNo = res.getInt("ReceiptNumber");
            }
        } catch (SQLException ex) {

        }
        closeAll();
    }

}
