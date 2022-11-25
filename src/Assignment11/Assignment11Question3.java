package Assignment11;// Assignment11
// Question 3
// 2021pgcaca050

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

class Assignment11Question3 {
    public static void main(String args[]) {

        try {

            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            Connection con = DriverManager.getConnection("jdbc:odbc:dsn1");
            Statement st = con.createStatement();

            st.addBatch("insert into EMPLOYEE values(1,'Shashi','s','Kant',20,1000,10)");
            st.addBatch("insert into EMPLOYEE values(2,'Alex','a','Hunter',20,10000,10)");
            st.addBatch("insert into EMPLOYEE values(3,'Ajax','x','Ace',20,10000,10)");
            st.addBatch("insert into EMPLOYEE values(4,'Devta','d','God',20,1000,10)");
            st.addBatch("insert into EMPLOYEE values(5,'Alan','w','Walker',20,10000,10)");
            st.addBatch("insert into EMPLOYEE values(6,'Jake','j','Waston',20,10000,10)");

            int[] count = st.executeBatch();
            for (int i = 0; i < count.length; i++) {
                System.out.println(count[i]);
            }

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

