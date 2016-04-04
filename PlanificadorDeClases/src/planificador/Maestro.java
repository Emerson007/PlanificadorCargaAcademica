/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planificador;

/**
 *
 * @author emerson
 */
public class Maestro {
    String nombreMaestro;
    String hora1;
    String hora2;
    String hora3;
    String hora4;
    boolean horaDisponible1 = true;
    boolean horaDisponible2 =  true;
    boolean horaDisponible3 = true;
    boolean horaDisponible4 = true;
    public Maestro(String nombreMaestro, String hora1,String hora2,String hora3,String hora4) {
        this.nombreMaestro = nombreMaestro;
        this.hora1 = hora1;
        this.hora2 = hora2;
        this.hora3 = hora3;
        this.hora4 = hora4;
    }

   
    
    
    
}
