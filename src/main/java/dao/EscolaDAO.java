package dao;

import banco.Conexao;
import entidade.Escola;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class EscolaDAO extends Conexao {
    
    private PreparedStatement ps;
    
    public void salvar(Escola e) throws SQLException, ClassNotFoundException{
        String sql = "INSERT INTO escola ("
                + "razao_social, cnpj, telefone, diretor, email, endereco) "
                + "VALUES (?, ?, ?, ?, ?, ?)";        
        ps = getPreparedStatement(sql);
        ps.setString(1, e.getRazaoSocial());
        ps.setString(2, e.getCNPJ());
        ps.setString(3, e.getTelefone());
        ps.setString(4, e.getDiretor());
        ps.setString(5, e.getEmail());
        ps.setString(6, e.getEndereco());
        ps.execute();
        ps.close();
    }
}
