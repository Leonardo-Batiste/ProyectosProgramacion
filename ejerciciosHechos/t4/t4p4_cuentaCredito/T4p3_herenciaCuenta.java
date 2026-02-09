/**
 *
 * @author AluDAM
 */
public class T4p3_herenciaCuenta {

    public static void main(String[] args) {
        
        CuentaCredito ca = new CuentaCredito("323232", "Pedro Sanchez Llamas", -3000);
        
        ca.ingresarDinero(1000);
        
        ca.aplicaInteres();
        
        ca.imprimirDatos();
        
        ca.retirarDinero(2000);
        
        ca.cambioTitular("Ana perez Resa");
        
        ca.imprimirDatos();
    }
}
