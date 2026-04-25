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
                subastarContenido();
            }
        });
    }

    private void subastarContenido(){
        File[] listaFicheros = mf.getFiles();
        Map<String, Integer> contenidoFichero;
        
        for (File fichero : listaFicheros){
            try{
                contenidoFichero = new LinkedHashMap<>();
                FileInputStream fis = new FileInputStream(fichero);
                DataInputStream dis = new DataInputStream(fis);
                
                try {
                    while (true){
                        contenidoFichero.put(dis.readUTF(), dis.readInt());
                    }
                } catch (EOFException eofExcep){

                }
                
                Iterator<Map.Entry<String, Integer>> iterador = contenidoFichero.entrySet().iterator();
                while (iterador.hasNext()){
                    Map.Entry<String, Integer> entrada = iterador.next();
                    String key = entrada.getKey();
                    Integer value = entrada.getValue();
                    
                    if (value < 10){
                        iterador.remove();
                    }
                    else{
                        contenidoFichero.replace(key, value, (value - 10) );
                    }
                }
                
                FileOutputStream fos = new FileOutputStream(fichero);
                DataOutputStream dos = new DataOutputStream(fos);
                for (Map.Entry<String, Integer> indice : contenidoFichero.entrySet()){
                    dos.writeUTF(indice.getKey());
                    dos.writeInt(indice.getValue());
                }

                dis.close();
                dos.close();

            } catch (IOException ioExcep){
                JOptionPane.showMessageDialog(null, "Error con " + fichero.getName());
                continue;
            }
        }
        JOptionPane.showMessageDialog(null, "Se ha completado con exito la subasta.");
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
