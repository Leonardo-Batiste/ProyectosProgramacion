package Controller;
import View.*;
import java.awt.event.*;
import java.io.*;
import java.util.*;
import javax.swing.JOptionPane;
public class MainController {
    public MainController(){
        start();
    }
    
    MainFrame mf;
    
    private void start(){
        mf = new MainFrame();
        
        crearMapaInventarioDat();
        
        crearListenersListar();
        
        crearListenersServirMaterial();
        
        crearListenersFin();
        
        mf.showFrame();
    }
    
    Map<String, Integer> inventario;
    
    private void crearMapaInventarioDat(){
        try {
            inventario = new HashMap<>();
            File fichero = new File("inventario.dat");
            FileInputStream fis = new FileInputStream(fichero);
            DataInputStream dis = new DataInputStream(fis);
            
            while (dis.available() > 0){
                inventario.put(dis.readUTF(), dis.readInt()); // FIXME
            }
        }
        catch (IOException e){
            System.out.println("Error crearMapaInventarioDat()");
        }
        
    }
    
    private void crearListenersListar(){
        mf.getListar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                for (Map.Entry<String, Integer> listado : inventario.entrySet()){
                    JOptionPane.showMessageDialog(null, listado);
                }
                
            }
        });
    }
    
    private void crearListenersServirMaterial(){
        mf.getServirMaterial().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                String codigoIntroducido = mf.getCodigo().getText();
                int stockIntroducido = Integer.parseInt(mf.getCantidad().getText());
                
                if (!inventario.containsKey(codigoIntroducido)){
                    JOptionPane.showMessageDialog(null, "No existe ese codigo.");
                    return;
                }
                
                int stockDisponible = inventario.get(codigoIntroducido);
                
                if (stockDisponible < stockIntroducido){
                    JOptionPane.showMessageDialog(null, "No hay suficiente stock.");
                    return;
                }
                
                stockDisponible -= stockIntroducido;
                
                inventario.replace(codigoIntroducido, stockDisponible);
                
            }
        });
    }
    
    private void crearListenersFin(){
        mf.getFin().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
    }
}
