
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author aparracorbacho
 */
public class MySqlC {
    static String bd = null;
    static String login = null;
    static String password = null;
    static String url = null;
    Connection conn = null;
    Statement stmt = null;
    
 /**
 * Con el metodo conn definimos la conexion a la base de datos
 *  @param user El usuario para la conexion
 *  @param pass El password para la conexion
 *  @param base El nombre de la base de datos
 *  @param url La direccion de la base de datos
 */
    
    public void conn(String user, String pass, String base, String url){
        this.bd = base;
        this.login = user;
        this.password = pass;
        this.url = url;
        try {
            conn = (Connection) DriverManager.getConnection(url, login, password);
        } catch (SQLException ex) {
            Logger.getLogger(MySqlC.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
