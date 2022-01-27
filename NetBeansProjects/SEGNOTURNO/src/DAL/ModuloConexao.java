/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAL;

import java.sql.*;

/**
 *
 * @author Carlos
 */
public class ModuloConexao {

    public static Connection conector() {
        java.sql.Connection conexao = null;

// Variáveis de informações referente ao DB
        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/segnoturno";
        String user = "root";
        String passoword = "";

//Estabelecer uma conexão com o nosso DB (segnoturno)
// para aparecer as opções do try, apertar Ctrl+espaço
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, passoword);
            return conexao;

        } catch (Exception e) {
            return null;
        }

    }

}
