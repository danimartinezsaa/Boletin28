/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin28;

/**
 *
 * @author dani
 */
public class Boletin28{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        Alumno.Direccion direccion1=new Alumno().new Direccion("Vigo",5);
        Alumno alumno1=new Alumno("Dani",6,direccion1);
        
        System.out.println(alumno1.mostrar());
        
        alumno1.cambiarNota(5);
        
        System.out.println(alumno1.mostrar());
    }
    
}