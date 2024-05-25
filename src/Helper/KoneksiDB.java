
package Helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiDB {
    
    static Connection c;
   
    public static Connection getConnection() {
         if (c == null){
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                c = DriverManager.getConnection("jdbc:mysql://localhost:3307/db_project","root","");
                System.out.print(c + "bisa");
            } catch (ClassNotFoundException | SQLException ex) {
                System.out.println("error"+ex);
            }
        }
        return c;
    }  
}

