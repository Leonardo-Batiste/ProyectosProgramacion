/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trafico;

/**
 *
 * @author AluDAM
 */
public class PruebaClases {
    public static void main(String[] args) {
        Coche c =new Coche("001", 50, 7.5, 250);
    
        Persona p =new Persona("JoseLuis", "Apellidos yo que se", "12345678A");
    
        p.usaCoche(10,180);
        
        p.compraCoche(c);
        
        c.repostar(70);
        
        p.usaCoche(100, 300);
    }
    
}
