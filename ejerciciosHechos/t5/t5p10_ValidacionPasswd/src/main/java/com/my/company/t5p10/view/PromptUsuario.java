/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.my.company.t5p10.view;
import javax.swing.JOptionPane;

/**
 *
 * @author AluDAM
 */
public class PromptUsuario {
    
    public String contraseñaIntroducida(){
        String contraseñaIntroducida = JOptionPane.showInputDialog("Introduce tu contraseña para comprobarla: ");
        return contraseñaIntroducida; 
    }
    
}
