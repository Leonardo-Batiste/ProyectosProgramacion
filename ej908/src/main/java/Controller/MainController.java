package Controller;
import View.*;
import java.awt.event.*;
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
    
    private void crearListenersServirMaterial(){
        mf.getServirMaterial().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                
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
