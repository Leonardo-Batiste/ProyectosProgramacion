package Model;

import Controller.*;
import java.util.*;
import javax.swing.JOptionPane;
import View.*;

public class Cliente {
    protected static ArrayList<Cliente> listaClientes = new ArrayList<>();
    
    protected String codigo;
    
    protected String nombre;
    
    protected Float cuota;
    
    protected static ArrayList<String> listaCodigos = new ArrayList<>();
    
    public Cliente(String codigoIntroducido, String nombreIntroducido, Float cuotaIntroducida){
        if (comprobadorCliente(codigoIntroducido, nombreIntroducido, cuotaIntroducida)){
            codigo = codigoIntroducido;
            AñadirCodigo(codigoIntroducido);
            nombre = nombreIntroducido;
            cuota = cuotaIntroducida;
            listaClientes.add(this);
        }
        else{
            //TODO Excepcion? 
        }
        
    }
    
    public void AñadirCodigo(String codigoIntroducido) {
        listaCodigos.add(codigoIntroducido);
    }
    
    public static boolean booleanComprobadorCliente(String codigoIntroducido, String nombreIntroducido, Float cuotaIntroducida){
        if (comprobadorCliente(codigoIntroducido, nombreIntroducido, cuotaIntroducida)){
            return true;
        }
        else{
            return false;
        }
    }
    
    private static boolean comprobadorCliente(String codigoIntroducido, String nombreIntroducido, Float cuotaIntroducida){
        return comprobadorCodigo(codigoIntroducido)
                && comprobadorNombre(nombreIntroducido)
                && comprobadorCuota(cuotaIntroducida);
    }
    
    private static boolean comprobadorCodigo(String codigoIntroducido){
        String patron = "^[a-zA-Z]{6}$";
        
        return codigoIntroducido != null && codigoIntroducido.matches(patron) && !Cliente.getListaCodigos().contains(codigoIntroducido);
    }
    
    private static boolean comprobadorNombre(String nombreIntroducido){
        String patron = "^[a-zA-Z]{1,30}$";
        
        return nombreIntroducido != null && nombreIntroducido.matches(patron);
    }
    
    private static boolean comprobadorCuota(Float cuotaIntroducida){
        return cuotaIntroducida != null && cuotaIntroducida >= 35;
    }
    
    @Override
    public String toString(){
        return "Codigo: " + this.codigo + "\n"
                + "Nombre: " + this.nombre + "\n"
                + "Cuota: " + this.cuota;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Float getCuota() {
        return cuota;
    }

    public void setCuota(Float cuota) {
        this.cuota = cuota;
    }

    public static ArrayList<String> getListaCodigos() {
        return listaCodigos;
    }

    public static ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }
    
    
}
