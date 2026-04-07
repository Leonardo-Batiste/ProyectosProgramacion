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
                //TODO Falta crear el modificar un cliente existente
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
                limpiarFormulario(altaDialog);
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
        limpiarFormulario(altaDialog);
    }
    
    public void limpiarFormulario(Object dialog){
        if (dialog instanceof AltaDialog){
            altaDialog.getCodigo().setText("");
            altaDialog.getNombre().setText("");
            altaDialog.getCuota().setText("");
        }
        else if (dialog instanceof BajaDialog){
        bajaDialog.getCodigo().setText("");
        bajaDialog.getNombre().setText("");
        bajaDialog.getCuota().setText(""); 
        }
    }
    
    private void bajaPressed(){
        mainWindow.hideFrame();
        
        bajaDialog.showDialog();
    }
    
    private void crearListenersBajaDialog(){
        bajaDialog.getConfirmarBaja().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                confirmarBaja();
            }
        });
        
        bajaDialog.getLimpiarFormulario().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                limpiarFormulario(bajaDialog);
            }
        });
        
        bajaDialog.getVolver().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                bajaDialog.hideDialog();
                
                mainWindow.showFrame();
            }
        });
    }
    
    //FIXME Funciona, pero hace todo muy rapido, y no da tiempo a mirar los datos del cliente introducido por ejemplo.
    private void confirmarBaja(){
        String codigoBajaIntroducido = bajaDialog.getCodigo().getText();

        String nombreCliente = "";
        
        Float cuotaCliente = 0.0f;
        
        boolean existeCliente = false;
        
        ArrayList<Cliente> listaClientes = Cliente.getListaClientes();
        
        if (codigoBajaIntroducido.length() <= 0){
            JOptionPane.showMessageDialog(null, "Tienes que introducir un codigo para buscarlo.");
            limpiarFormulario(bajaDialog);
            bajaDialog.getCodigo().setEditable(true);
            return;
        }
        
        bajaDialog.getCodigo().setEditable(false);
        
        for (Cliente c : listaClientes){
            if (c.getCodigo().equals(codigoBajaIntroducido)){
                nombreCliente = c.getNombre();
                cuotaCliente = c.getCuota();
                existeCliente = true;
                break;
            }
        }
        
        if (!existeCliente){
            JOptionPane.showMessageDialog(null, "No se ha encontrado ese codigo de cliente.");
            limpiarFormulario(bajaDialog);
            bajaDialog.getCodigo().setEditable(true);
            return;
        }
        
        bajaDialog.getNombre().setText(nombreCliente);
        
        bajaDialog.getCuota().setText(cuotaCliente + "");
        
        for (Cliente c : listaClientes){
            if (c.getCodigo().equals(codigoBajaIntroducido)){
                listaClientes.remove(c);
                break;
            }
        }
        
        JOptionPane.showMessageDialog(null, "Se ha borrado el cliente con exito.");
        
        limpiarFormulario(bajaDialog);
        bajaDialog.getCodigo().setEditable(true);
    }
    
    private void listadoPressed(){
        ArrayList<Cliente> listadoClientes = Cliente.getListaClientes();
        
        if (listadoClientes.isEmpty()){
            JOptionPane.showMessageDialog(null, "No existen clientes actualmente.");
        }
        
        for (Cliente c : listadoClientes){
            JOptionPane.showMessageDialog(null, c.toString());
        }
    }
    
}
