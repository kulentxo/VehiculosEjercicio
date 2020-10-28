package com.ipartek.clases;

/**
 * realizar las modificaciones pertinentes en el programa para que los atributos
 * arrancado y velocidadActual se hereden de una clase vehiculo, y que no se
 * pueda heredar de las clases patinete bici y coche
 * 
 * @author Julen Martin
 *
 */
public class Vehiculo {

	private int velocidadActual;
	private boolean isArrancado;

	public Vehiculo() {
		super();
		this.isArrancado = false;
		this.velocidadActual = 0;
	}

	public Vehiculo(int velocidadActual, boolean isArrancado) {
		this();
		this.velocidadActual = velocidadActual;
		this.isArrancado = isArrancado;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	public boolean isArrancado() {
		return isArrancado;
	}

	public void setArrancado(boolean isArrancado) {
		this.isArrancado = isArrancado;
	}

}
