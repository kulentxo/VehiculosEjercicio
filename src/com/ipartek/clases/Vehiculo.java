package com.ipartek.clases;

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
