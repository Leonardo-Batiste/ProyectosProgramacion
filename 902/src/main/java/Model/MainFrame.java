package Model;

import java.awt.BorderLayout;
import javax.swing.*;

public class MainFrame {
    public MainFrame(){
        initComponents();
    }
    
    private JFrame mainFrame;
    private JPanel mainPanel;
    
    private void initComponents(){
        mainFrame = new JFrame("FICHEROS");
        
        mainPanel = new JPanel(new BorderLayout());
        
        mainFrame.add(mainPanel);
        
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        mainFrame.setLocationRelativeTo(null);
    }
}
