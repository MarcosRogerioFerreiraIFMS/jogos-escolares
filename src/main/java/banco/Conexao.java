package banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Conexao {
    
    private Connection conexao = null;
    
    public Connection getConexao() throws ClassNotFoundException, SQLException{
        if(conexao == null){
            Class.forName("org.postgresql.Driver");
            conexao = DriverManager.getConnection("jdbc:postgresql://localhost:5432/bd_tads_jogos", 
                                                  "marcos", "123456");
        }
        return conexao;
    }
    
    public PreparedStatement getPreparedStatement(String sql) throws SQLException, ClassNotFoundException{
        return getConexao().prepareStatement(sql);
    }
    
    public void fechaConexao() throws SQLException {
        conexao.close();
    }
    
}
