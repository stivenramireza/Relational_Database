package laligasantander;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Stiven Ramirez Arango
 * @version 1
 */

public class LaLigaSantander {

    Connection conectar = null;

    Connection conexion() {
        try{
         Class.forName("org.gjt.mm.mysql.Driver");
         conectar = DriverManager.getConnection("jdbc:mysql://localhost/laliga","root","");
     }catch(SQLException ex){
         JOptionPane.showMessageDialog(null, "Error de conexion en la base de datos.");
     }catch(ClassNotFoundException ex){
         return conectar;
     }
        return conectar;
      }
}

