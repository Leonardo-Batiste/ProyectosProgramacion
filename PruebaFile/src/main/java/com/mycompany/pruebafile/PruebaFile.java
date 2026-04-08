package com.mycompany.pruebafile;

import java.io.*;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PruebaFile {

    /*
    Esta funciona: D:/Downloads/klk.txt
    Esta tambien funciona: D:\\Downloads\\klk.txt
    Y esta tambien, aunque se ha escrito a mano: D:\Downloads\klk.txt
    Esta NO funciona, porque al pegar de windows, o algo asi, pone cosas invisibles al princiipio: ‪D:\Downloads\klk.txt
    Esta tampoco: ‪D:/Downloads/klk.txt
    */
    
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
            String cadena = JOptionPane.showInputDialog("Dime el nombre de fichero (puedes indicar su ruta con el separador \\");
            File fichero =  new File(cadena);
            try {
                if (fichero.exists()){
                    JOptionPane.showMessageDialog(null, "Ruta completa = " + fichero.getAbsolutePath());
                    JOptionPane.showMessageDialog(null, "Es fichero? " + fichero.isFile());
                    JOptionPane.showMessageDialog(null, "Es directorio? " + fichero.isDirectory());
                    JOptionPane.showMessageDialog(null, "Se puede leer?" + fichero.canRead());
                    JOptionPane.showMessageDialog(null, "Se puede escribir? " + fichero.canWrite()); 
                }
                else{
                    JOptionPane.showMessageDialog(null, "El fichero o directorio no existe");
                }
            }
            catch (Exception e){
                JOptionPane.showMessageDialog(null, "Error de I/O.");
            }
    }
}
