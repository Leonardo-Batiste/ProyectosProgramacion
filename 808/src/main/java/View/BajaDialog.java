package View;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BajaDialog {
    public BajaDialog(){
        initComponents();
    }
    
    private JDialog mainAlta;
    private JPanel panelMain;
    
    private void initComponents(){
        mainAlta = new JDialog();
        
        panelMain = new JPanel(new BorderLayout());
        
        initNorth();
        
        initCenter();
        
        initSouth();
        
        mainAlta.add(panelMain);
        
        mainAlta.pack();
        
        mainAlta.setDefaultCloseOperation(0);
        
        mainAlta.setLocationRelativeTo(null);
    }
    
    private JLabel title;
    
    private void initNorth(){
        title = new JLabel("ACME GYM");
        
        //TODO ponerle colorcicos bonitos al titulo
        
        panelMain.add(title, BorderLayout.NORTH);
    }
    
    private JPanel center;
    private JLabel codigoL;
    private JTextField codigo;
    private JLabel nombreL;
    private JTextField nombre;
    private JLabel cuotaL;
    private JTextField cuota;
    
    private void initCenter(){
        center = new JPanel(new GridLayout(3,2));
        
        codigoL = new JLabel("CODIGO");
        
        codigo = new JTextField();
        
        nombreL = new JLabel("NOMBRE");
        
        nombre = new JTextField();
        nombre.setEditable(false);
        
        cuotaL = new JLabel("CUOTA");
        
        cuota = new JTextField();
        cuota.setEditable(false);
        
        center.add(codigoL);
        
        center.add(codigo);
        
        center.add(nombreL);
        
        center.add(nombre);
        
        center.add(cuotaL);
        
        center.add(cuota);
        
        panelMain.add(center, BorderLayout.CENTER);
    }
    
    private JPanel south;
    private JButton confirmarBaja;
    private JButton limpiarFormulario;
    private JButton volver;
    
    private void initSouth(){
        south = new JPanel(new FlowLayout());
        
        confirmarBaja = new JButton("BAJA");
        
        limpiarFormulario = new JButton("LIMPIAR FORMULARIO");
        
        volver = new JButton("VOLVER AL MENU PRINCIPAL");
        
        south.add(confirmarBaja);
        
        south.add(limpiarFormulario);
        
        south.add(volver);
        
        panelMain.add(south, BorderLayout.SOUTH);
    }
    
    public void showDialog(){
        mainAlta.setVisible(true);
    }
    
    public void hideDialog(){
        mainAlta.setVisible(false);
    }

    public JButton getConfirmarBaja() {
        return confirmarBaja;
    }

    public JButton getLimpiarFormulario() {
        return limpiarFormulario;
    }

    public JButton getVolver() {
        return volver;
    }

    public JTextField getCodigo() {
        return codigo;
    }

    public JTextField getNombre() {
        return nombre;
    }

    public JTextField getCuota() {
        return cuota;
    }
}