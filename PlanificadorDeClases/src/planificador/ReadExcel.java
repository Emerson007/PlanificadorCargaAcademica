/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package planificador;

import java.io.File;
import java.util.ArrayList;
import jxl.Sheet;
import jxl.Workbook;

/**
 *
 * @author emerson
 */
public class ReadExcel {
    ArrayList<Clase> clases = new ArrayList<Clase>();  
    ArrayList<Maestro> maestros = new ArrayList<Maestro>();
    ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();  
    ArrayList<Aula> aulas = new ArrayList<Aula>();
    public void leerArchivoExcel(String archivoDestino) { 
      
      try { 
        Workbook archivoExcel = Workbook.getWorkbook(new File( 
        archivoDestino)); 
        System.out.println("Número de Hojas\t" 
        + archivoExcel.getNumberOfSheets()); 
        for (int sheetNo = 0; sheetNo < archivoExcel.getNumberOfSheets(); sheetNo++){ /* Recorre cada hoja*/ 
                                                                                               
            Sheet hoja = archivoExcel.getSheet(sheetNo); 
            int numColumnas = hoja.getColumns(); 
            int numFilas = hoja.getRows(); 
            String data; 
            System.out.println("Nombre de la Hoja\t" + archivoExcel.getSheet(sheetNo).getName()); 
            
            switch(sheetNo){
                case 0:
                  String nombreClase = null;
                  String hora1 = null;
                  String hora2 = null;
                  
                  for (int fila = 0; fila < numFilas; fila++) { /* Recorre cada fila de la hoja*/ 

                         for (int columna = 0; columna < numColumnas; columna++) { /* Recorre cada columna de la fila*/                                                                                
                            if(columna == 0){
                                nombreClase = hoja.getCell(columna, fila).getContents();
                            }else if(columna == 1){
                                hora1 = hoja.getCell(columna, fila).getContents();
                            }else{
                                hora2 = hoja.getCell(columna, fila).getContents();
                            }
                             
                           
                           

                         } 
                      clases.add(new Clase(nombreClase,hora1,hora2));
                  }
                  break;
                    
                case 1:    
                  String nombreMaestro = null;
                  String horam1 = null;
                  String horam2 = null;
                  String horam3 = null;
                  String horam4 = null;
                    
                  for (int fila = 0; fila < numFilas; fila++) { /* Recorre cada fila de la hoja*/ 

                         for (int columna = 0; columna < numColumnas; columna++) { /* Recorre cada columna de la fila*/                                                                                
                            if(columna == 0){
                                nombreMaestro = hoja.getCell(columna, fila).getContents();
                            }else if(columna == 1){
                                horam1 = hoja.getCell(columna, fila).getContents();
                            }else if(columna == 2){
                                horam2 = hoja.getCell(columna, fila).getContents();
                            }else if(columna == 3){
                                horam3 = hoja.getCell(columna, fila).getContents();
                            }else{
                                horam4 = hoja.getCell(columna, fila).getContents();
                            }
                             
                           
                           

                         } 
                      maestros.add(new Maestro(nombreMaestro,horam1,horam2,horam3,horam4));
                  }
                  break;
                  
                case 2:    
                  String nombreEstudiante = null;
                  String anio = null;
                  
                  
                  for (int fila = 0; fila < numFilas; fila++) { /* Recorre cada fila de la hoja*/ 

                         for (int columna = 0; columna < numColumnas; columna++) { /* Recorre cada columna de la fila*/                                                                                
                            if(columna == 0){
                                nombreEstudiante = hoja.getCell(columna, fila).getContents();
                            }else{
                                anio = hoja.getCell(columna, fila).getContents();
                            }
                             
                           

                         } 
                    estudiantes.add(new Estudiante(nombreEstudiante,anio));

                  }
                  break; 
                    
                case 3:    
                  String numeroAula = null;
                  
                    
                  for (int fila = 0; fila < numFilas; fila++) { /* Recorre cada fila de la hoja*/ 

                         for (int columna = 0; columna < numColumnas; columna++) { /* Recorre cada columna de la fila*/                                                                                
                          
                             
                           
                           

                         } 
                      aulas.add(new Aula(numeroAula));
                  }
                  break;  
            }
        } 
     } catch (Exception ioe) { 
        ioe.printStackTrace(); 
     } 

} 
    
}
