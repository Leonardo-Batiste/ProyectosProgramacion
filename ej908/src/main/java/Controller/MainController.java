package Controller;
import View.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.JOptionPane;
public class MainController {
    public MainController(){
        start();
    }
    
    MainFrame mf;
    
    private void start(){
        mf = new MainFrame();
        
        crearListenersServirMaterial();
        
        crearListenersFin();
        
        mf.showFrame();
    }
    
    Map<String, Integer> inventario = new HashMap<>();
    
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
