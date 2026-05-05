package actividades10.act1.modelo.dao;

import actividades10.act1.modelo.entity.MyException;
import java.sql.*;


public class Conexion {
    public void crearConexion(String sql) throws MyException {
        String url = "jdbc:mariadb://localhost:3306/acme";
        String usuario = "root";
        String contraseña = "";
        
        try (Connection con = DriverManager.getConnection(url, usuario, contraseña)){
            PreparedStatement stat = con.prepareStatement(sql);
            stat.executeUpdate();
            
        } catch (SQLException e){
            throw new MyException(e.getMessage());
            
        }
    }
    
    public String crearTabla(String nombreTabla, String cod_art, String descripcion, float precio, int stock) throws MyException{
        String sql = "create table " + nombreTabla;
        return sql;
    }
}
