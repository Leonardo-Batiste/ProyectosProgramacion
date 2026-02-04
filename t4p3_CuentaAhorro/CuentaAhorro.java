public class CuentaAhorro extends Cuenta {
    private double interes;

    public CuentaAhorro (String numC, String titular, double interes) {
        super (Integer.parseInt(numC), titular); // Llamada al constructor del padre
        if (interes >= 0 || interes <= 100)
            this.interes = interes;
        else
            this.interes = 0;
    }

    public void aplicaInteres(){
        this.saldo += this.saldo * (interes / 100);
    }

    /**
     * Se permite si la cuenta no esta bloqueada
     * @param porc double
     */
    public void setInteres(double porc){
        if (this.bloqueada){
            System.out.println("Error. No puedes cambiar el interes, porque la"
                    + "cuenta esta bloqueada.");
        }
        else{
            if(porc <=0 || porc >= 100){
                System.out.println("Error. No puedes cambiar el interes, porque"
                    + "debe ser entre 0 y 100.");
            }
            else{
                this.interes = porc;
            }
        }
        
    }

    public double getInteres(){
        return this.interes;
    }
}