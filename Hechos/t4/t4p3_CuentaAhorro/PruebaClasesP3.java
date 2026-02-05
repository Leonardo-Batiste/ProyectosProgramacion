public class PruebaClasesP3 {
    public static void main(String[] args) {
        CuentaAhorro ca = new CuentaAhorro("323232", "Pedro Sanchez Llamas", 2.5);
        ca.ingresarDinero(1000);
        ca.aplicaInteres();
        ca.imprimirDatos();
        ca.retirarDinero(2000);
        ca.cambioTitular("Ana Perez Resa");
        ca.imprimirDatos();
    }
}