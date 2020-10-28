package com.ipartek.interfaces;

public interface ICoche {

	final int VEL_MAX_COCHE = 150;
	final int VEL_MAX_BICI = 50;
	final int VEL_MAX_PATINETE = 80;

	void arrancar();

	void acelerar(int incrementoVel);

	void frenar(int decrementoVel);

	void apagar();
}
