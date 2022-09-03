/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller020922.modelo;

/**
 *
 * @author AUXILIARSC
 */
public class Carrera {
    private String codigo,nombre;
    private int totalCreditos;

    public Carrera() {
    }

    public Carrera(String codigo, String nombre, int totalCreditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.totalCreditos = totalCreditos;
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

    public int getTotalCreditos() {
        return totalCreditos;
    }

    public void setTotalCreditos(int totalCreditos) {
        this.totalCreditos = totalCreditos;
    }
    
    
}
