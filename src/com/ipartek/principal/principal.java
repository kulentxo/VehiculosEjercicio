package com.ipartek.principal;

import com.ipartek.clases.Bici;
import com.ipartek.clases.Coche;
import com.ipartek.clases.Patinete;

/**
 * En un programa principal, se probaran los m�todos con los tres objetos de
 * cada tipo de vehiculo, arranc�ndolos, acelerando varias veces hasta que
 * lleguen a velocidad m�xima, frenando hasta detenerse en varias veces y
 * apag�ndose.<br>
 * El proceso deber� seguir la l�gica del mundo real.<br>
 * No se podr� apagar si ya est� encendido, no podr� acelerar ni frenar si esta
 * apagado�
 * 
 * @author Julen Martin
 *
 */
public class principal {

	public static void main(String[] args) {

		Coche c = new Coche();
		Patinete p = new Patinete();
		Bici b = new Bici();

		c.acelerar(30);
		c.arrancar();
		c.acelerar(160);
		c.frenar(20);
		c.apagar();
		c.frenar(50);
		c.apagar();

		p.acelerar(30);
		p.arrancar();
		p.acelerar(70);
		p.frenar(20);
		p.apagar();
		p.frenar(50);
		p.apagar();

		b.acelerar(30);
		b.arrancar();
		b.acelerar(70);
		b.frenar(20);
		b.apagar();
		b.frenar(50);
		b.apagar();
	}

}
