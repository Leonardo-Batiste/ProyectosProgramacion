package Controller;
import View.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
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
        
    }
    
    private void crearListenersFin(){
        
    }
}
