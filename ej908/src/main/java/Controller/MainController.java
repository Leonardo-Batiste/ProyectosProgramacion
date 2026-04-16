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
        
        guardarInventario();
        
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
                inventario.put(dis.readUTF(), dis.readInt());
            }
        }
        catch (IOException e){
            e.getMessage();
        }
        
    }
    
    private void crearListenersListar(){
        mf.getListar().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                for (Map.Entry<String, Integer> listado : inventario.entrySet()){
                    System.out.println(listado);
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
                
                JOptionPane.showMessageDialog(null, "Se ha restado " + stockIntroducido + " del stock total, ahora quedan: " + stockDisponible);
            }
        });
    }
    
    private void actualizarInventarioDat(){
        try{
            File fichero = new File("inventario.dat");
            FileOutputStream fos = new FileOutputStream(fichero);
            DataOutputStream dos = new DataOutputStream(fos);
            for (Map.Entry<String, Integer> listado : inventario.entrySet()){
                dos.writeUTF(listado.getKey());
                dos.writeInt(listado.getValue());
            }
            dos.close();
            System.exit(0);  
        }
        catch (IOException excep){
            JOptionPane.showMessageDialog(null, excep.getMessage());
        }
    }
    
    private void guardarInventario(){
        mf.getMainFrame().addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                actualizarInventarioDat();
            }
        });
    }
    
    private void crearListenersFin(){
        mf.getFin().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                actualizarInventarioDat();
            }
        });
    }
    
    
}
