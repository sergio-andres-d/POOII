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
public class Estudiante {
    private String codigo,nombre,apellido;
    private Carrera carrera;
    private int semestre,creditos;

    public Estudiante() {
    }

    public Estudiante(String codigo, String nombre, String apellido, Carrera carrera, int semestre, int creditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.semestre = semestre;
        this.creditos = creditos;
    }
    
    public void puedeMatricularProyecto(){
        System.out.println("¿Puedo Matricular proyecto de grado?");
        if(creditos>(carrera.getTotalCreditos()*0.9)){
            System.out.println("Estudiante "+nombre+" "+apellido+" ya puedes matricular proyeto de grado");
        }
        else System.out.println("Estudiante "+nombre+" "+apellido+" aun no puede matricular proyeto de grado");
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

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    
    
}
