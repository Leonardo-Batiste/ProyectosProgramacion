package View;

import java.awt.BorderLayout;
import java.awt.event.WindowStateListener;
import javax.swing.*;

public class MainFrame {
    public MainFrame (){
        initComponents();
    }
    
    private JFrame mainFrame;
    private JPanel mainPanel;
    
    private void initComponents(){
        mainFrame = new JFrame("Copia archivos");
        
        mainPanel = new JPanel(new BorderLayout());
        
        mainFrame.add(mainPanel);
        
        mainFrame.pack();
        
        mainFrame.setLocationRelativeTo(null);
        
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    
    public void showFrame(){
        mainFrame.setVisible(true);
    }
    
    public void hideFrame(){
        mainFrame.setVisible(false);
    }
}
