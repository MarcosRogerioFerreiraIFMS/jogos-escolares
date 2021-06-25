package formulario;

import dao.EscolaDAO;
import entidade.Escola;
import java.sql.SQLException;

public class TesteEscola {
    public static void main(String[] args) throws SQLException, ClassNotFoundException{
        Escola e = new Escola();
        e.setRazaoSocial("IFMS");
        e.setCNPJ("112346464");
        e.setTelefone("679999999");
        e.setDiretor("Matheus");
        e.setEmail("ifms@ifms.edu.br");
        e.setEndereco("Rua Hilda, 250");
        
        EscolaDAO dao = new EscolaDAO();
        dao.salvar(e);                
    }
}
