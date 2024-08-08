
package h;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class H {

    public static void main(String[] args) {
        
        System.out.println("jjjjj");
         try {
            // TODO code application logic here

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","shreya100");
            System.out.println(con);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(H.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(H.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }
    
}
