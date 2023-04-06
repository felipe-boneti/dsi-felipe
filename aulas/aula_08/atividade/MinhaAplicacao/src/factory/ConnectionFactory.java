package factory;

import java.sql.Connection; // Conexão SQL Java
import java.sql.DriverManager; // Driver de conexão SQL para JAVA
import java.sql.SQLException; //Classe para tratamento de exceções

public class ConnectionFactory {
    
    public Connection getConnection(){

        try {
            return DriverManager.getConnection("jdbc:mysql://localhost/projetojava?useSSL=false&serverTimezone=UTC","root","");
        } catch(SQLException excecao){
            throw new RuntimeException(excecao);
        }
    }
}