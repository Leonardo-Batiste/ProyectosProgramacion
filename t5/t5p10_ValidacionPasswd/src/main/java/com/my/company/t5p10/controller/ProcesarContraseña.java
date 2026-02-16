/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.my.company.t5p10.controller;
import com.my.company.t5p10.model.ValidarContrasena;
import com.my.company.t5p10.model.ContrasenaInvalidaException;
import com.my.company.t5p10.view.PromptUsuario;

/**
 *
 * @author AluDAM
 */
public class ProcesarContraseña {
    public void ejecutarValidacion(){
        PromptUsuario vista = new PromptUsuario();
        ValidarContrasena model = new ValidarContrasena();
        
        try{
            model.validarContrasena(vista.contraseñaIntroducida());
        }
        catch(ContrasenaInvalidaException e){
            e.getMessage();
        }
    }
}
