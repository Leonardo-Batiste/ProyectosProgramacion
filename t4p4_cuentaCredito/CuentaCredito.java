public class CuentaCredito extends Cuenta {
    /**
     * Numero real negativo
     */
    private double limiteCredito;

    /**
     * Constructor de la clase
     * @param numC String, es necesario pararlo a int en super()
     * @param titularC String
     * @param lim double
     */
    public CuentaCredito (String numC, String titularC, double lim) {
        super(numC, titularC); // Llamada al constructor del padre
        if (lim >= 0)
            this.limiteCredito = -1000;
        else
            this.limiteCredito = lim;
    }

    public void retirarDinero(double cantidad){
        if (this.saldo-cantidad > this.limiteCredito){
            this.saldo-=cantidad;
        }
        else{
            System.out.println("No puedes retirar dinero, no tienes suficiente saldo.");
        }
    }

}
