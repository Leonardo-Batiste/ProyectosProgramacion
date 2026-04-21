package Controller;
import View.*;
import java.awt.event.*;
import java.io.*;
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
                FileReader fr = new FileReader(fichero);
                BufferedReader br = new BufferedReader(fr);
                
                String linea = "";
                while ((linea = br.readLine()) != null){
                    JOptionPane.showMessageDialog(null, linea);
                }
            }
            catch (IOException excep) {
                excep.getMessage();
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
