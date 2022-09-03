/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller020922.modelo;

import java.util.ArrayList;

/**
 *
 * @author AUXILIARSC
 */
public class Docente {
    private String codigo,nombre,apellido,profesion;
    private int salario;
    private float estatura,peso;
    private static ArrayList<Docente> docentes=new ArrayList<Docente>();

    public Docente() {
        docentes.add(this);
    }

    public Docente(String codigo, String nombre, String apellido, String profesion, int salario, float estatura, float peso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.profesion = profesion;
        this.salario = salario;
        this.estatura = estatura;
        this.peso = peso;
        docentes.add(this);
    }
    
    public void calcularImc(){
        float imc=peso/(estatura*estatura);
        System.out.print("Su IMC es "+imc+" y su composicion corporal es ");
        if(imc<18.5){
            System.out.println("Peso inferior al normal");
        } else{
            if(imc<25.0){
                System.out.println("Normal");
            }else{
                if(imc<30.0){
                    System.out.println("Peso superior al normal");
                }else{
                    System.out.println("Obesidad");
                }
            }
        }
    }
    
    public static void actualizarSalrios(int actualizacion){
        for(Docente d: docentes){
            d.setSalario(d.getSalario()+actualizacion);
        }
        System.out.println("Salarios actualizados");
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

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
    
}
