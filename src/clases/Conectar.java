/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;


/**
 *
 * @author catfish
 */
public class Conectar  {
    
    private static Connection conx;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "Carolina2729@";
    private static final String url = "jdbc:mysql://localhost:3306/academia";

    public Conectar() {
        conx = null;
        try {
            Class.forName(driver);
            conx = DriverManager.getConnection(url, user, password);
            if(conx != null) {
                System.out.println("Conexion establecida!!!!!");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar!!!!  " + e);
        }
        
    }
    
    //CON ESTE METODO NOS RETORNA LA CONEXION
    public Connection getConnection() {
        return conx;
    }
    
    //CON ESTE METODO NOS DESCONECTAMOS DE LA  BASE DE DATOS
    public void desconectar() {
        conx = null;
        if(conx == null) {
            System.out.println("Conexion terminada!!!!");
        }
    }

   
    
    
    
}
