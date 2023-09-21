
package javamapaprog2.dao;

import java.sql.PreparedStatement;
import javamapaprog2.TelaUsuarios;
import java.sql.SQLException;


public class usuariodao {
    String sql = "INSERT INTO USUARIO (idUsario, NomeUsuario, Senhausuario, emailusuario, loginusuario) VALUES (?, ?, ?, ?)";
    
    PreparedStatement ps;
   
    try {
    ps = conexaodao.getConexao.prepareStatement(sql);
    ps.setDouble(1,usuariodao .getId());
    ps.setString(2, usuariodao.getNome());
    ps.setString(3, usuariodao, getEmail());
    ps.setString(4, usuariodao, getSenha());
    
  
    }catch(SQLException e){
    e.printStackTrace();
}
}
