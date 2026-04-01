package Controller;
import View.*;
import Model.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;

public class MainController {
    public MainController(){
        start();
    }
    
    MainWindow mainWindow;
    AltaDialog altaDialog;
    BajaDialog bajaDialog;
    
    private void start(){
        mainWindow = new MainWindow();
        
        crearListenersMainWindow();
        
        altaDialog = new AltaDialog();
        
        crearListenersAltaDialog();
        
        bajaDialog = new BajaDialog();
        
        crearListenersBajaDialog();
        
        mainWindow.showFrame();
    }
    
    private void crearListenersMainWindow(){
        mainWindow.getAlta().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                altaPressed();
            }
        });
        
        mainWindow.getBaja().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bajaPressed();
            }
        });
        
        mainWindow.getModificar().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                
            }
        });
        
        mainWindow.getListado().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listadoPressed();
            }
        });
        
        mainWindow.getSalir().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null, "Saliendo del programa.");
                System.exit(0);
            }
        });
    }
    
    private void altaPressed(){
        mainWindow.hideFrame();
        
        altaDialog.showDialog();
    }
    
    private void crearListenersAltaDialog(){
        altaDialog.getConfirmarAlta().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                confirmarAlta();
            }
        });
        
        altaDialog.getLimpiarFormulario().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                limpiarFormulario();
            }
        });
        
        altaDialog.getVolver().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                altaDialog.hideDialog();
                
                mainWindow.showFrame();
            }
        });
    }
    
    private void confirmarAlta(){
        String codigoCliente = altaDialog.getCodigo().getText();
        
        String nombreCliente = altaDialog.getNombre().getText();
        
        Float cuotaCliente = Float.parseFloat(altaDialog.getCuota().getText().trim());
        
        if (!Cliente.booleanComprobadorCliente(codigoCliente, nombreCliente, cuotaCliente)){
            
            JOptionPane.showMessageDialog(null, "No se ha podido crear el Cliente.");
            return;
        }
        Cliente nuevoCliente = new Cliente(codigoCliente, nombreCliente, cuotaCliente);
        JOptionPane.showMessageDialog(null, "Se ha creado el cliente con exito.");
        limpiarFormulario();
    }
    
    public void limpiarFormulario(){
        altaDialog.getCodigo().setText("");
        altaDialog.getNombre().setText("");
        altaDialog.getCuota().setText("");
    }
    
    private void bajaPressed(){
        mainWindow.hideFrame();
        
        bajaDialog.showDialog();
    }
    
    private void crearListenersBajaDialog(){
        
    }
    
    private void listadoPressed(){
        ArrayList<Cliente> listadoClientes = Cliente.getListaClientes();
        
        for (Cliente c : listadoClientes){
            JOptionPane.showMessageDialog(null, c.toString());
        }
    }
    
}
