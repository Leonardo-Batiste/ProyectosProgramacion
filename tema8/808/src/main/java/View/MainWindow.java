package View;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import javax.swing.*;

public class MainWindow {
    public MainWindow(){
        initComponents();
        
    }
    
    private JFrame mainFrame;
    private JPanel panelMain;
    
    private void initComponents(){
        mainFrame = new JFrame();
        
        panelMain = new JPanel(new BorderLayout());
        
        initNorth();
        
        initCenter();
        
        mainFrame.add(panelMain);
        
        mainFrame.pack();
        
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        mainFrame.setLocationRelativeTo(null);
    }
    
    private JLabel title;
    
    private void initNorth(){
        title = new JLabel("ACME GYM");
        
        //TODO ponerle colorcicos bonitos al titulo
        
        panelMain.add(title, BorderLayout.NORTH);
    }
    
    private JPanel center;
    private JButton alta;
    private JButton baja;
    private JButton modificar;
    private JButton listado;
    private JButton salir;
    
    private void initCenter(){
        center = new JPanel(new GridLayout(5,1));
        
        alta = new JButton("ALTA");
        
        baja = new JButton("BAJA");
        
        modificar = new JButton("MODIFICAR");
        
        listado = new JButton("LISTADO");
        
        salir = new JButton("SALIR");
        
        center.add(alta);
        
        center.add(baja);
        
        center.add(modificar);
        
        center.add(listado);
        
        center.add(salir);
        
        panelMain.add(center, BorderLayout.CENTER);
    }
    
    public void showFrame(){
        mainFrame.setVisible(true);
    }
    
    public void hideFrame(){
        mainFrame.setVisible(false);
    }

    public JButton getAlta() {
        return alta;
    }

    public JButton getBaja() {
        return baja;
    }

    public JButton getModificar() {
        return modificar;
    }

    public JButton getListado() {
        return listado;
    }

    public JButton getSalir() {
        return salir;
    }
    
    
    
}
