
package javamapaprog2.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class conexaodao {
    private static final String url = "jdbc:mysql//localhost:3306/mapaprog2";
    private static final String user = "root";
    private static final String password = "root";
    
    public static Connection conn;
    
    private static Connection getConexao(){
        try{  
        if(conn == null){
                conn = DriverManager.getConnection(url, user, password);
                return conn;
            }else{
                return conn;
            }
        }catch(SQLException e){
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "Houve um problema ao conectar com o banco de dados");
                return null;
                }
        
    }

    public static Connection getConn() {
        return conn;
    }

    public static void setConn(Connection conn) {
        conexaodao.conn = conn;
    }
}
