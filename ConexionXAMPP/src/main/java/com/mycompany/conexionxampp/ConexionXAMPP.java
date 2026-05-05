package com.mycompany.conexionxampp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexionXAMPP {

    public static void main(String[] args) {
        try{
            Connection conn = DriverManager.getConnection("jdbc:mariadb://localhost:3306/", "root", "");
            Statement stmt = conn.createStatement(); 
            stmt.executeUpdate("create database BBDD_Alumnos");
            System.out.println("✅ Base de datos 'alumnos' creada/verificada");
        }
        catch (SQLException excep){
            excep.getMessage();
        }
    }
}
