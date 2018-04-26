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
public class Alumno{
    String nombre;
    int nota;
    Direccion direccion;

    public Alumno(){
    }

    public Alumno(String nombre, int nota, String calle, int numero){
        this.nombre=nombre;
        this.nota=nota;
        direccion=new Direccion(calle,numero);
    }

    @Override
    public String toString(){
        return "Alumno{"+"nombre="+nombre+", nota="+nota+", direccion="+direccion+'}';
    }

    public void cambiarNota(int nota){
        this.nota=nota;
    }
    
    public void cambiarNumero(int numero){
        direccion.setNumero(numero);
    }
    
    public String mostrar(){
        return toString()+direccion.toString();
    }
    
    private class Direccion{
        String calle;
        int numero;

        public Direccion(String calle, int numero){
            this.calle=calle;
            this.numero=numero;
        }

        public void setNumero(int numero){
            this.numero=numero;
        }
        
        @Override
        public String toString(){
            return "Direccion{"+"calle="+calle+", numero="+numero+'}';
        }

    }
}
