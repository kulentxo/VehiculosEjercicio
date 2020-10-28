package com.ipartek.clases;

import com.ipartek.interfaces.ICoche;

/**
 * <ul>
 * <li>Arrancar: pondr� el atributo estaArrancado a true. Debe estar apagado
 * para poder arrancarse</li>
 * <li>Acelerar: incrementara la velocidad actual con el valor que se le pasa
 * por par�metro sin sobrepasar el limite m�ximo de velocidad. Solo acelerara si
 * el patinete esta encendido</li>
 * <li>Frenar: decrementara la velocidad actual con el valor que se le pasa por
 * par�metro sin llegar a bajar de 0. Solo frenara si el patinete esta encendido
 * <li>Apagar: pondr� el atributo estaArrancado a false, solo si la
 * velocidadActual es 0</li>
 * <li>toString: mostrara una cadena de texto con el siguiente formato: �Soy un
 * patinete, estoy (encendido/apagado) y mi velocidad es de
 * (velocidadActual)</li> Km/h�
 * </ul>
 * 
 * @author Julen Martin
 *
 */
public class Coche extends Vehiculo implements ICoche {

	public Coche() {
		super();
	}

	public Coche(int velocidadActual, boolean isArrancado) {
		super(velocidadActual, isArrancado);
	}

	@Override
	public String toString() {
		return "Coche [velocidadActual=" + getVelocidadActual() + ", isArrancado=" + isArrancado() + "]";
	}

	@Override
	public void arrancar() {
		if (!isArrancado()) {
			setArrancado(true);
			System.out.println("Coche arrancado");
		} else {
			System.out.println("ya esta arrancado");
		}

	}

	@Override
	public void acelerar(int incrementoVel) {
		if (getVelocidadActual() < VEL_MAX_COCHE && isArrancado()) {
			if ((getVelocidadActual() + incrementoVel) > VEL_MAX_COCHE) {
				setVelocidadActual(VEL_MAX_COCHE);
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
		if (isArrancado()) {
			if ((getVelocidadActual() - decrementoVel) < 0) {
				setVelocidadActual(0);
				System.out.println("Coche quieto");
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
			System.out.println("Coche apagado");
		} else {
			System.out.println("tienes que frenar del todo");
		}

	}

}
