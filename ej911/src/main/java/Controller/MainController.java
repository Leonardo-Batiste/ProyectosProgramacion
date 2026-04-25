package Controller;
import View.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;

import javax.swing.*;
public class MainController {
    public MainController(){
        start();
    }

    MainFrame mf;
    private void start(){
        mf = new MainFrame();
        crearListenersSubasta();
        crearListenersVerContenido();
        crearListenersSalir();
        mf.showFrame();
    }
    
    private void crearListenersSubasta(){
        mf.getSubasta().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                
            }
        });
    }
    
    private void crearListenersVerContenido(){
        mf.getVerContenido().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarContenidoFichero();
            }
        });
    }
    
    private void mostrarContenidoFichero(){
        int cantidadFilasSeleccionadas = mf.getTabla().getSelectedRowCount();
        if (cantidadFilasSeleccionadas != 1){
            JOptionPane.showMessageDialog(null, "Tienes que seleccionar 1 unica fila.");
        }
        else{
            try {
                int filaSeleccionada = mf.getTabla().getSelectedRow();
                int columnaSeleccionada = mf.getTabla().getSelectedColumn();
                
                File fichero = new File(mf.getDm().getValueAt(filaSeleccionada, columnaSeleccionada) + "");
                FileInputStream fis = new FileInputStream(fichero);
                DataInputStream dis = new DataInputStream(fis);

                HashMap<String, String> listaPescados = new LinkedHashMap<>();
                try{
                    while (true){
                        listaPescados.put(dis.readUTF(), (dis.readInt() + "kg") );
                    }
                }
                catch (IOException excep){
                    
                }
                
                String imprimirPescados = "";
                for (Map.Entry<String, String> indice : listaPescados.entrySet()){
                    imprimirPescados = imprimirPescados + indice + "\n";
                }

                JOptionPane.showMessageDialog(null, imprimirPescados);
                dis.close();
            }
            catch (IOException excep) {

            }
            finally {
                //Aqui iria cerrar el datainputstream, pero si pongo dis.close(); no va, tengo que poner otro try catch?
            }
        }
    }
    
    private void crearListenersSalir(){
        mf.getSalir().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null , "Saliendo...");
                System.exit(0);
            }
        });
    }
}
