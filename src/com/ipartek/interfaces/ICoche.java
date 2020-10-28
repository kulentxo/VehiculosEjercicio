package com.ipartek.interfaces;

/**
 * Una vez creada esta jerarqu�a, se proceder� a crear una interfaz llamada
 * Vehiculo. Dicha interfaz tendr� las siguientes constantes:
 * <ul>
 * <li>VEL_MAX_COCHE=150</li>
 * <li>VEL_MAX_BICI=50</li>
 * <li>VEL_MAX_PATINETE=80.</li>
 * </ul>
 * Asimismo tambi�n contendr� la definici�n de los siguientes m�todos
 * <ul>
 * <li>Arrancar()</li>
 * <li>Acelerar(int incrementoVel)</li>
 * <li>Frenar(int decrementoVel)</li>
 * <li>Apagar()</li>
 * </ul>
 * 
 * @author Julen Martin
 *
 */
public interface ICoche {

	final int VEL_MAX_COCHE = 150;
	final int VEL_MAX_BICI = 50;
	final int VEL_MAX_PATINETE = 80;

	void arrancar();

	void acelerar(int incrementoVel);

	void frenar(int decrementoVel);

	void apagar();
}
