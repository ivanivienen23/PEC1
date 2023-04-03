package edu.ucjc.programacion.pec1.Iván_Ruano;

import java.util.Arrays;

public class Colegio {
	private String Nombre;
	private String Direccion;
	private int Aulas;
	private int Alumnos;
	private Alumno[] alumnosPasados = new Alumno[10];
	

	public Colegio(Alumno[] alumnosPasados) {
		super();
		this.alumnosPasados = alumnosPasados;
	}
	
	Alumno[] asientosAula1 = {};
	Alumno[] asientosAula2 = {};
	Alumno[] asientosAula3 = {};
	
	public Colegio(String nombre, String direccion, int aulas, int alumnos) {
		super();
		Nombre = nombre;
		Direccion = direccion;
		Aulas = aulas;
		Alumnos = alumnos;
		alumnosPasados = new Alumno[alumnos];
	}

	public Alumno[] getAlumnosPasados() {
		return alumnosPasados;
	}


	public void setAlumnosPasados(Alumno[] alumnosPasados) {
		this.alumnosPasados = alumnosPasados;
	}
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	
	public String getDireccion() {
		return Direccion;
	}

	public void setDireccion(String direccion) {
		Direccion = direccion;
	}

	public int getAulas() {
		return Aulas;
	}

	public void setAulas(int aulas) {
		Aulas = aulas;
	}

	public int getAlumnos() {
		return Alumnos;
	}

	public void setAlumnos(int alumnos) {
		Alumnos = alumnos;
	}

	
	public void asignarAula(Alumno alumno) {
		
		Alumno[] asientosAula1 = Arrays.copyOfRange(alumnosPasados, 0, 3);
		Alumno[] asientosAula2 = Arrays.copyOfRange(alumnosPasados, 3, 6);
		Alumno[] asientosAula3 = Arrays.copyOfRange(alumnosPasados, 6, 9);
		
		System.out.println(alumno.getNombre());
		int aulas = 0;
		int asiento = 1;
		int cambiarAula = 0;
		
		if (cambiarAula == 0) {
		for (int i = 0; i < asientosAula1.length; i++) {
		    if (asientosAula1[i] == null) {
		    	asientosAula1[i] = alumno;
		    	aulas = 1;
		    	cambiarAula = 1;
		    	break;
		    } else {
		    	asiento = asiento + 1;
		    }
		}
		}
		

		if (cambiarAula == 0) {
			asiento = 1;
		for (int i = 0; i < asientosAula2.length; i++) {
		    if (asientosAula2[i] == null) {
		    	asientosAula2[i] = alumno;
		    	aulas = 2;
		    	cambiarAula = 1;
		    	break;
		    } else {
		    	asiento = asiento + 1;
		    }
		}
		}
		
		if (cambiarAula == 0) {
			asiento = 1;
		for (int i = 0; i < asientosAula3.length; i++) {
		    if (asientosAula3[i] == null) {
		    	asientosAula3[i] = alumno;
		    	aulas = 3;
		    	cambiarAula = 1;
		    	break;
		    } else {
		    	asiento = asiento + 1;
		    }
		}
		}
		if (aulas == 0) {
			System.out.println("Todas las clases están llenas");
		}else {
		System.out.println("Aula1");
		System.out.println(asientosAula1[0]);
		System.out.println(asientosAula1[1]);
		System.out.println(asientosAula1[2]);
		
		System.out.println("Aula2");
		System.out.println(asientosAula2[0]);
		System.out.println(asientosAula2[1]);
		System.out.println(asientosAula2[2]);
		
		System.out.println("Aula3");
		System.out.println(asientosAula3[0]);
		System.out.println(asientosAula3[1]);
		System.out.println(asientosAula3[2]);
		
		System.out.println("El alumno está en el aula " + aulas);
		System.out.println("Estará en el asiento " + asiento);
		System.out.println("Su DNI es " + alumno.getDni());
		}
	}
}