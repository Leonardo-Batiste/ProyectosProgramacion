package View;

import java.awt.FlowLayout;
import javax.swing.*;

public class Salida {
    public Salida(){
        initComponents();
    }
    
    private JDialog mainDialog;
    private JPanel mainPanel;
    
    private void initComponents(){
        mainDialog = new JDialog();
        
        mainPanel = new JPanel(new FlowLayout());
        
        mainDialog.add(mainPanel);
    }
}
