package View;

import java.awt.*;
import javax.swing.*;

public class FrameAltaLibro {
    
    public FrameAltaLibro(){
        
        initComponents();
        
    }
    
    // FIXME Esto en teoria deberia ser un JDialog con modal = true o algo asi.
    JFrame mainFrame;
    JPanel panelPrincipal; 
    
    private void initComponents(){
        
        mainFrame = new JFrame();
        
        panelPrincipal = new JPanel(new BorderLayout());
        
        initNorth();
        
        initCenter();
        
        initSouth();
        
        mainFrame.add(panelPrincipal);
        
        mainFrame.pack();
        
        mainFrame.setLocationRelativeTo(null);
        
        mainFrame.setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        
    }
    
    private JPanel north;
    private JLabel encabezado;
    
    private void initNorth(){
        north = new JPanel(new FlowLayout());
        
        encabezado = new JLabel("Alta Libro");
        
        north.add(encabezado);
        
        panelPrincipal.add(north, BorderLayout.NORTH);
        
    }
    
    private JPanel center;
    private JLabel codigoIntroducidoL;
    private JTextField codigoIntroducido;
    private JLabel tituloIntroducidoL;
    private JTextField tituloIntroducido;
    private JLabel editorialIntroducidaL;
    private JTextField editorialIntroducida;
    private JLabel numeroPaginasIntroducidoL;
    private JTextField numeroPaginasIntroducido;
    
    private void initCenter(){
        center = new JPanel(new GridLayout(4, 2));
        
        codigoIntroducidoL = new JLabel("Codigo");
        
        codigoIntroducido = new JTextField();
        
        tituloIntroducidoL = new JLabel("Titulo");
        
        tituloIntroducido = new JTextField();
        
        editorialIntroducidaL = new JLabel("Editorial");
        
        editorialIntroducida = new JTextField();
        
        numeroPaginasIntroducidoL = new JLabel("Numero Paginas");
        
        numeroPaginasIntroducido = new JTextField();
        
        center.add(codigoIntroducidoL);
        
        center.add(codigoIntroducido);
        
        center.add(tituloIntroducidoL);
        
        center.add(tituloIntroducido);
        
        center.add(editorialIntroducidaL);
        
        center.add(editorialIntroducida);
        
        center.add(numeroPaginasIntroducidoL);
        
        center.add(numeroPaginasIntroducido);
        
        
        
        panelPrincipal.add(center, BorderLayout.CENTER);
        
    }
    
    JPanel south;
    JButton confirmarAltaLibro;
    JButton salirAltaLibro;
    
    private void initSouth(){
        south = new JPanel(new FlowLayout());
        
        confirmarAltaLibro = new JButton("Confirmar alta");
        
        salirAltaLibro = new JButton("Volver");
        
        south.add(confirmarAltaLibro);
        
        south.add(salirAltaLibro);
        
        
        panelPrincipal.add(south, BorderLayout.SOUTH);
        
    }
    
    public void showFrame(){
        mainFrame.setVisible(true);
    }
    
    public void hideFrame(){
        mainFrame.setVisible(false);
    }
    
    public void disposeFrame(){
        mainFrame.dispose();
        
    }
    
    public void limpiarFormulario(){
        codigoIntroducido.setText("");
        tituloIntroducido.setText("");
        editorialIntroducida.setText("");
        numeroPaginasIntroducido.setText("");
        
    }

    public JButton getConfirmarAltaLibro() {
        return confirmarAltaLibro;
    }

    public JButton getSalirAltaLibro() {
        return salirAltaLibro;
    }

    public JTextField getCodigoIntroducido() {
        return codigoIntroducido;
    }

    public JTextField getTituloIntroducido() {
        return tituloIntroducido;
    }

    public JTextField getEditorialIntroducida() {
        return editorialIntroducida;
    }

    public JTextField getNumeroPaginasIntroducido() {
        return numeroPaginasIntroducido;
    }
    
    
    
    
}
