/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller020922.modelo;

import java.util.Calendar;

/**
 *
 * @author AUXILIARSC
 */
public class Administrativo {
    private String codigo,nombre,apellido;
    private int anioIngreso;

    public Administrativo() {
    }

    public Administrativo(String codigo, String nombre, String apellido, int anioIngreso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.anioIngreso = anioIngreso;
    }
    
    public void calcularAntiguedad(){
        int anioActual=Calendar.getInstance().get(Calendar.YEAR);
        System.out.print("Antiguedad de "+nombre+" "+apellido+" es "+(anioActual-anioIngreso));
        if((anioActual-anioIngreso)==1){
            System.out.println(" año");
        }else{
            System.out.println(" años");
        }            
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }
    
    
}
