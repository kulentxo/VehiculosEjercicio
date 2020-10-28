package com.ipartek.clases;

import com.ipartek.interfaces.ICoche;

public class Bici extends Vehiculo implements ICoche {

	public Bici() {
		super();
	}

	public Bici(int velocidadActual, boolean isArrancado) {
		super(velocidadActual, isArrancado);

	}

	@Override
	public String toString() {
		return "Bici [velocidadActual=" + getVelocidadActual() + ", isArrancado=" + isArrancado() + "]";
	}

	@Override
	public void arrancar() {
		if (isArrancado() == false) {
			setArrancado(true);
			System.out.println("Bici arrancado");
		} else {
			System.out.println("ya esta arrancado");
		}

	}

	@Override
	public void acelerar(int incrementoVel) {
		if (getVelocidadActual() < VEL_MAX_BICI && isArrancado() == true) {
			if ((getVelocidadActual() + incrementoVel) > VEL_MAX_BICI) {
				setVelocidadActual(VEL_MAX_BICI);
				System.out.println("Velocidad maxima");
			} else {
				setVelocidadActual(getVelocidadActual() + incrementoVel);
				System.out.println("Velocidad incrementado");
			}
		} else {
			System.out.println("Tienes que arrancar o sino has llegado al limite");
		}

	}

	@Override
	public void frenar(int decrementoVel) {
		if (isArrancado() == true) {
			if ((getVelocidadActual() - decrementoVel) == 0) {
				setVelocidadActual(0);
				System.out.println("Bici quieto");
			} else {
				setVelocidadActual(getVelocidadActual() - decrementoVel);
				System.out.println("velocidad decrementado");
			}
		}

	}

	@Override
	public void apagar() {
		if (getVelocidadActual() == 0) {
			setArrancado(false);
			System.out.println("Bici apagado");
		} else {
			System.out.println("tienes que frenar del todo");
		}

	}

}
