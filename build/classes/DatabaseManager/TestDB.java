
import java.sql.*;
public class TestDB {
 
    public static void main(String arg[])throws ClassNotFoundException{
   
 try {
        Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
        System.out.println("hello");
        Connection con = DriverManager.getConnection("jdbc:odbc:USINDH_DATABASE");
        Statement stmt = con.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT * FROM faculty");
        while (rs.next()) {
                 System.out.println(rs.getString("FAC_NAME"));
                 System.out.println(rs.getInt("FAC_ID"));
                 System.out.println(rs.getString("REMARKS"));
        }
        con.close();
    }
catch (ClassNotFoundException e) {
    System.out.println(e);
}
catch (SQLException e) {
    System.out.println(e);
}

    
    
    }
    
    
}
