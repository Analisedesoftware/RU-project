/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BandodeDados;

import Interface.*;
import ru.*;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Tomás Abril
 */

public class DAO  {
    private Connection con;
    private Statement stmt1;
    
    public DAO() {
        try {
            con = Conexao.getConnection();

            this.stmt1 = this.con.createStatement();
            
        } catch (Exception e1) {
            System.out.println("Erro DAO: " + e1);
        }
    }
    
    public Cliente findCliente(String ra) {
        try {
            ResultSet rs = this.stmt1.executeQuery("select * from alunos where ra =" + "\"" + ra + "\"");
            if (rs.next()) {
                Cliente res = new Cliente();
                //res.setCodigo(rs.getInt("ra"));
                res.setNome(rs.getString("nome"));
                res.setEmail(rs.getString("email"));
                res.setSenha(rs.getString("senha"));
                res.setSaldo(rs.getDouble("saldo"));
                
                return res;
            } else {
                return null;
            }
        } catch (SQLException sql1) {
            System.out.println("Erro LivroDAO: "+sql1);
            return null;
        }
    }
    
    
    
    public void finalize() {
        try {
            this.con.close();
        } catch (Exception e2) {
            System.out.println("Erro LivroDAO: " + e2);
        }
    }
}
