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
import jxl.*; 
import java.io.*; 

public class Main {
     

public static void main(String arg[]) { 
   ReadExcel excel = new ReadExcel(); 
   excel.leerArchivoExcel("entrada.xls"); 
} 
} 
