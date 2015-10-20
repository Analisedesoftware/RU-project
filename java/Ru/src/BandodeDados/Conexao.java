/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BandodeDados;

import Interface.*;
import ru.*;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Tomás Abril
 */

public class Conexao {
        public static Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost/bancoru";
            String usuario = "root";
            String senha = "senha123";
            Connection con = DriverManager.getConnection(url, usuario, senha);

            return con;
            
        } catch (Exception e1) {
            System.out.println("nao conectou: " + e1);
            return null;
        }
        
        
    }
}
