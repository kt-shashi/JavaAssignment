package Assignment11;// Assignment11
// Question 1
// 2021pgcaca050

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

class Assignment11Question1 {
    public static void main(String args[]) {

        try {

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:dsn1");
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select FNAME,MINIT,LNAME from EMPLOYEE where AGE>40");
            while (rs.next()) {
                System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
