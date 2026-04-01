package Controller;
import View.*;
import Model.*;
import java.awt.event.*;
import javax.swing.*;

public class MainController {
    public MainController(){
        start();
    }
    
    MainWindow mainWindow;
    AltaDialog altaDialog;
    
    private void start(){
        mainWindow = new MainWindow();
        
        crearListenersMainWindow();
        
        altaDialog = new AltaDialog();
        
        crearListenersAltaDialog();
        
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
        
        Float cuotaCliente = Float.parseFloat(altaDialog.getCuota().getText());
        
        if (comprobadorCliente(codigoCliente, nombreCliente, cuotaCliente)){
            Cliente nuevoCliente = new Cliente(codigoCliente, nombreCliente, cuotaCliente);
            JOptionPane.showMessageDialog(null, "Se ha creado el cliente correctamente");
            limpiarFormulario();
        }
        else{
            JOptionPane.showMessageDialog(null, "No se ha podido crear el cliente correctamente.");
        }
        
        
    }
    
    private boolean comprobadorCliente(String codigoIntroducido, String nombreIntroducido, Float cuotaIntroducida){
        return comprobadorCodigo(codigoIntroducido)
                && comprobadorNombre(nombreIntroducido)
                && comprobadorCuota(cuotaIntroducida);
    }
    
    private boolean comprobadorCodigo(String codigoIntroducido){
        String patron = "^[a-zA-Z]{6}$";
        
        return codigoIntroducido != null && codigoIntroducido.matches(patron) && !Cliente.getListaCodigos().contains(codigoIntroducido);
    }
    
    private boolean comprobadorNombre(String nombreIntroducido){
        String patron = "^[a-zA-Z]{1,30}$";
        
        return nombreIntroducido != null && nombreIntroducido.matches(patron);
    }
    
    private boolean comprobadorCuota(Float cuotaIntroducida){
        return cuotaIntroducida != null && cuotaIntroducida >= 35;
    }
    
    public void limpiarFormulario(){
        altaDialog.getCodigo().setText("");
        altaDialog.getNombre().setText("");
        altaDialog.getCuota().setText("");
    }
    
}
