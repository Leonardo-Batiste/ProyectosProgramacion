/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package trafico;

/**
 *
 * @author AluDAM
 */
public class T4p2_asociacionN {

    public static void main(String[] args) {
        Coche opelVectra = new Coche("001",50,7.5,200);
        Persona p = new Persona("Jose", "Apellidos", "12345678A");
        
        p.compraCoche(opelVectra);

        p.eligeCocheEnUso(0);
        
        opelVectra.arrancarMotor();

        p.usaCoche(10, 60);

        opelVectra.repostar(50);

        p.usaCoche(10, 60);
    }
}
