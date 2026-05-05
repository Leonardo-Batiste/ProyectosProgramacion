
package actividades10.act1.app;

import actividades10.act1.modelo.dao.Conexion;
import actividades10.act1.modelo.entity.MyException;


public class Main {
    public static void main(String[] args) {
        try {
            Conexion conex = new Conexion();
            conex.crearTabla();
            
        } catch (MyException e){
            System.out.println(e.getMessage());
            
        }
        
    }
    
}
