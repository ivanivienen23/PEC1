package edu.ucjc.programacion.pec1.Iván_Ruano;

public class Main {

	public static void main(String[] args) {
		Alumno alumno1 = new Alumno("A","b","c");
		Alumno alumno2 = new Alumno("A","b","c");
		Alumno alumno3 = new Alumno("A","b","c");
		
		Alumno[] asientosAula1 = {null,null,null};
		Alumno[] asientosAula2 = {null,null,null};
		Alumno[] asientosAula3 = {null,null,null};
		
		Aula aula1 = new Aula(1,1,asientosAula1);
		Aula aula2 = new Aula(2,1,asientosAula2);
		Aula aula3 = new Aula(3,1,asientosAula3);
		
		}
}
