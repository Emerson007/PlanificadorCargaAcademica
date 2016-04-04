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
public class Clase {
    String nombreClase;
    String hora1;
    String hora2;
    boolean horaOcupada1 = false;
    boolean horaOcupada2 = false;
    String maestro;
    public Clase(String nombreClase, String hora1, String hora2){
        this.nombreClase = nombreClase;
        this.hora1 = hora1;
        this.hora2 = hora2;
    }

    
    
}
