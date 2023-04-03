package edu.ucjc.programacion.pec1.Iván_Ruano;

public class Aula {
	private int Numero;
	private int Planta;
	private Alumno[] Asientos = {};
	
	public Aula(int numero, int planta, Alumno[] asientos) {
		super();
		Numero = numero;
		Planta = planta;
		Asientos = asientos;
	}
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public int getPlanta() {
		return Planta;
	}
	public void setPlanta(int planta) {
		Planta = planta;
	}
	public Alumno[] getAsientos() {
		return Asientos;
	}
	public void setAsientos(Alumno[] asientos) {
		Asientos = asientos;
	}
	
	
	
}