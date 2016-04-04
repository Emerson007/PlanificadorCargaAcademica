/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planificador;

import java.util.ArrayList;

/**
 *
 * @author emerson
 */
public class AsignarMaestros {

    public AsignarMaestros() {
    
    }
    ReadExcel rd = new ReadExcel();
    ArrayList<Clase> clases2 = new ArrayList<Clase>();
    ArrayList<Maestro> maestros2 = new ArrayList<Maestro>();
    String Clase;
    String Maestro;
    public void asignarMaestroClase(){
        clases2 = rd.clases;
        maestros2 = rd.maestros;
        
        for(int i = 0;i < maestros2.size(); i++){
            for(int j = 0; j < clases2.size(); j++){
                if(maestros2.get(i).horaDisponible1 == true){
                    if(clases2.get(j).horaOcupada1 == false && clases2.get(j).hora1 == maestros2.get(i).hora1 ){
                        
                    }
                }
            }
        }
    }
    
    
}
