
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;



public class Koneksi {
     private static Connection conn;
      public static Connection getKoneksi( ){
               String host       = "jdbc:mysql://localhost/karyawan",
                          user       = "root",
                          pass       = "root";
               try{
                      conn = (Connection) DriverManager.getConnection(host, user, pass);
               }catch (SQLException err){
                       JOptionPane.showMessageDialog(null, err.getMessage( ) );
               }
               return conn;
      }
}
