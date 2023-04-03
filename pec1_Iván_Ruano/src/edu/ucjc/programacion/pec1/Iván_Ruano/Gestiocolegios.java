package edu.ucjc.programacion.pec1.Iván_Ruano;

import java.util.Arrays;

public class Gestiocolegios {
	
    Alumno[] alumnos = new Alumno[10];
    static Alumno[] nuevosAlumnos = new Alumno[20];
    
	public static void main(String[] args) {
        String nombre = args[0];
        String direccion = args[1];
        int numAulas = Integer.parseInt(args[2]);
        int numAlumnos = Integer.parseInt(args[3]);
        
        Alumno alumno1 = new Alumno("Ivan","b","54441975D");
        
        Colegio colegio1 = new Colegio(nombre, direccion, numAulas, numAlumnos);
        
        Alumno[] alumnos = UtilsColegio.crearAlumnos(numAlumnos);
        
        for (int i = 0; i < alumnos.length; i++) {
            nuevosAlumnos[i] = alumnos[i];
        }
        alumnos = nuevosAlumnos;

        colegio1.setAlumnosPasados(alumnos);
        System.out.println(alumnos.length);
        
        //System.out.println(Arrays.toString(Aula1));
        colegio1.asignarAula(alumno1);
    }	
}
