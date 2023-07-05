package db;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conectar {
    private static final String usuario = "root";
    private static final String senha = "1234567";
    private static final String url = "jdbc:mysql://localhost/cadastro";
    
    public static Connection getConectar() {
        Connection con = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, usuario, senha);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Erro ao conectar ao banco de dados" + ex.getMessage());
        }
        return con;
    }
}
