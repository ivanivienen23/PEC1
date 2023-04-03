package edu.ucjc.programacion.pec1.Iván_Ruano;

import java.util.Scanner;

public class UtilsColegio {
    
	public static Alumno[] crearAlumnos(int numAlumnos) {
        Alumno[] alumnos = new Alumno[numAlumnos];
        
        for (int i = 0; i < numAlumnos; i++) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce el nombre del alumno " + (i + 1) + ":");
            String nombre = sc.nextLine();
            System.out.println("Introduce el apellido del alumno " + (i + 1) + ":");
            String apellido = sc.nextLine();
            System.out.println("Introduce la dirección del alumno " + (i + 1) + ":");
            String direccion = sc.nextLine();
            
            alumnos[i] = new Alumno(nombre, apellido, direccion);
        }
        
        return alumnos;
    }

}
