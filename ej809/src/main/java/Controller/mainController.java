package Controller;
import Model.*;
import View.*;
import java.awt.event.*;
import javax.swing.JOptionPane;


public class mainController {
    
    public mainController(){
        
        start();
        
    }
    
    VentanaPrincipal ventana;
    
    private void start(){
        
        ventana = new VentanaPrincipal();
        
        ventana.getAltaLibro().addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e){
                
                botonAltaLibro();
                
            }
            
        });
        
        ventana.getAltaMultimedia().addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                
                botonAltaMultimedia();
                
            }
            
        });
        
        ventana.getListarEjemplares().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                listarEjemplares();
            }
        });
        
        ventana.getFin().addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e){
                
                botonFinPrograma();
                
            }
            
        });
        
        crearListenersFrameAltaLibro();
        
        ventana.showFrame();
        
    }
    
    FrameAltaLibro frameAltaLibro = new FrameAltaLibro();
    
    // TODO Falta, que cuando se pulse el boton, o enter, compruebe si es correcto, para que no añade cosas en null
    private void botonAltaLibro(){
        
        ventana.hideFrame();
        
        frameAltaLibro.showFrame();
        
    }
    
    private void crearListenersFrameAltaLibro(){
        frameAltaLibro.getConfirmarAltaLibro().addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                
                String codigoIntroducido = frameAltaLibro.getCodigoIntroducido().getText();
                
                String tituloIntroducido = frameAltaLibro.getTituloIntroducido().getText();
                
                String editorialIntroducida = frameAltaLibro.getEditorialIntroducida().getText();
                
                Integer numeroPaginasIntroducido = Integer.parseInt(frameAltaLibro.getNumeroPaginasIntroducido().getText());
                
                Ejemplar libroAñadir = new Libro(codigoIntroducido, tituloIntroducido, editorialIntroducida, numeroPaginasIntroducido);
                
                frameAltaLibro.limpiarFormulario();
                
            }
        });
        
        frameAltaLibro.getSalirAltaLibro().addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e){
                ventana.showFrame();
                frameAltaLibro.hideFrame();
            }
        });
        
    }
    
    // TODO Lo mismo que crear un libro pero con ejemplares :(
    private void botonAltaMultimedia(){
        JOptionPane.showMessageDialog(null, "No esta disponible esta función.");
    }
    
    private void listarEjemplares(){
        
        if (Ejemplar.getListaEjemplares().isEmpty()){
            JOptionPane.showMessageDialog(null, "No se puede mostrar, ya que no existe ningun ejemplar.");
        }
        else {
            for (Ejemplar ej : Ejemplar.getListaEjemplares()){
                JOptionPane.showMessageDialog(null, ej);
            }  
        }
    }
    
    private void botonFinPrograma(){
        JOptionPane.showMessageDialog(null, "Saliendo del programa");
        System.exit(0);
    }
    
    
    
}
