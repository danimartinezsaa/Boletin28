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

    public Alumno(String nombre, int nota, Direccion direccion){
        this.nombre=nombre;
        this.nota=nota;
        this.direccion=direccion;
    }

    @Override
    public String toString(){
        return "Alumno{"+"nombre="+nombre+", nota="+nota+", direccion="+direccion+'}';
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public int getNota(){
        return nota;
    }

    public void setNota(int nota){
        this.nota=nota;
    }

    public Direccion getDireccion(){
        return direccion;
    }

    public void setDireccion(Direccion direccion){
        this.direccion=direccion;
    }
    
    public void cambiarNota(int nota){
        this.nota=nota;
    }
    
    public String mostrar(){
        return toString()+direccion.toString();
    }
    
    public class Direccion{
        String calle;
        int numero;

        public Direccion(String calle, int numero){
            this.calle=calle;
            this.numero=numero;
        }

        @Override
        public String toString(){
            return "Direccion{"+"calle="+calle+", numero="+numero+'}';
        }

        public String getCalle(){
            return calle;
        }

        public void setCalle(String calle){
            this.calle=calle;
        }

        public int getNumero(){
            return numero;
        }

        public void setNumero(int numero){
            this.numero=numero;
        }

    }
}
