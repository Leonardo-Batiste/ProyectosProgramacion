package Model;

import Controller.*;
import java.util.*;
import javax.swing.JOptionPane;
import View.*;

public class Cliente {
    protected String codigo;
    
    protected String nombre;
    
    protected Float cuota;
    
    protected static ArrayList<String> listaCodigos = new ArrayList<>();
    
    public Cliente(String codigoIntroducido, String nombreIntroducido, Float cuotaIntroducida){
        codigo = codigoIntroducido;
        AñadirCodigo(codigoIntroducido);
        nombre = nombreIntroducido;
        cuota = cuotaIntroducida;
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

    public void AñadirCodigo(String codigoIntroducido) {
        listaCodigos.add(codigoIntroducido);
    }
    
}
