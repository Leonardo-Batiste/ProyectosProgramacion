package model;
import java.util.*;
import exceptions.*;

public class AsignaturaEmpresa extends Asignatura{
    protected String nombreDeEmpresa;

    /**
     * Rango(0-10.0)
     */
    protected float notaFinal;

    public AsignaturaEmpresa(String id, String nombre, String nombreDeEmpresa, float notaFinal)
        throws IdInvalidoException, NombreInvalidoException, nombreEmpresaException, notaFinalException
    {
        super(id, nombre);

        if (!nombreDeEmpresaValido(nombreDeEmpresa)){
            throw new nombreEmpresaException("el nombre de la empresa es invalido (vacio o null).");
        }
        this.nombreDeEmpresa=nombreDeEmpresa;

        if (!rangoNotaFinalCorrecto(notaFinal)){
            throw new notaFinalException("la nota tiene que estar en un rango de 1-10");
        }
        this.notaFinal=notaFinal;

    }

    /**
     * Criterio de aprobado: Nota >= 5
     * @return true, si la nota >=5
     */
    public boolean haAprobado(){
        return this.notaFinal>=5;
    }

    /**
     *
     * @param nombreEmpresa String
     * @return true, si no esta vacio, y tiene un caracter como minimo
     */
    public boolean nombreDeEmpresaValido(String nombreEmpresa){
        if (nombreEmpresa == null) return false;

        String patronNombreEmpresa = "^.+$";

        return nombreEmpresa.matches(patronNombreEmpresa);
    }

    public boolean rangoNotaFinalCorrecto(float nota){
        return nota>=0 && nota<=10;
    }



}
