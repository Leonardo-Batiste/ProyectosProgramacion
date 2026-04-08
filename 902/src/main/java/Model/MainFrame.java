package Model;

import java.awt.BorderLayout;
import java.awt.GridLayout;
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
        
        initNorth();
        
        mainFrame.add(mainPanel);
        
        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        mainFrame.setLocationRelativeTo(null);
    }
    
    private JLabel header;
    private JPanel north;
    
    private void initNorth(){
        north = new JPanel(new GridLayout(1,1));
        
        header = new JLabel("FICHEROS");
        
        north.add(header);
        
        mainPanel.add(north, BorderLayout.NORTH);
    }
}
