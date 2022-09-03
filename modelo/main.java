/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Taller020922.modelo;

/**
 *
 * @author USUARIO
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Carrera ingSistemas= new Carrera("115","Ingenieria de Sistemas",100);
        Estudiante e1 = new Estudiante("1152121","Mateo","Herrera Martinez",ingSistemas,2,32);
        Estudiante e2 = new Estudiante("1151905","Jose","Villamizar Rivera",ingSistemas,9,92);
        Docente d1 = new Docente("1150020","Martin","Gomez Lopez","Ingeniero Civil",3200050,1.7f,70.4f);
        Administrativo a1 =new Administrativo("1178967","Fabian","Rubio Blanco",2001);
        
        //Requerimiento 1
        d1.calcularImc();
        //Requerimirnto 2
        e1.puedeMatricularProyecto();
        e2.puedeMatricularProyecto();
        //Requerimiento 3
        a1.calcularAntiguedad();
        //Requerimiento 4
        System.out.println(d1.getNombre()+" "+d1.getApellido()+" "+d1.getSalario());
        Docente.actualizarSalrios(50);
        System.out.println(d1.getNombre()+" "+d1.getApellido()+" "+d1.getSalario());
    }
}
