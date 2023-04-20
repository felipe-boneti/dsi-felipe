package dao;

import factory.ConnectionFactory; import modelo.Usuario; import java.sql.*; import java.sql.PreparedStatement;

public class UsuarioDAO {
    Long id;
    String nome;
    String cpf;
    String email;
    String telefone;
    String Cidade;
    String Sexo;
    String DataDeNascimento;
    String EstadoCivil;
    String Profissao;
    
    private final Connection connection;
    
    public UsuarioDAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    public void adiciona(Usuario usuario){
        String sql = "INSERT INTO usuario(nome,cpf,email,telefone,Cidade,Sexo,DataDeNascimento,EstadoCivil,Profissao) VALUES (?,?,?,?,?,?,?,?,?)";
        try{

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, usuario.getNome());
            stmt.setString(2, usuario.getCpf());
            stmt.setString(3, usuario.getEmail());
            stmt.setString(4, usuario.getTelefone());
            stmt.setString(5, usuario.getCidade());
            stmt.setString(6, usuario.getSexo());
            stmt.setString(7, usuario.getDataDeNascimento());
            stmt.setString(8, usuario.getEstadoCivil());
            stmt.setString(9, usuario.getProfissao());
            stmt.execute();
            stmt.close();

        } catch (SQLException u){
            throw new RuntimeException(u);
        }
    }
     
}
