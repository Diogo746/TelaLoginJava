import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sistema_de_login", 
                "root", 
                "sua_senha" 
            );
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
