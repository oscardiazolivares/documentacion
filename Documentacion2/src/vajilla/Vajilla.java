package vajilla;

import utiles.Teclado;

public class Vajilla {
	
	private Plato[] platos;

	
	public Vajilla() {
		this.platos = new Plato[pedirNumPlatos()];

		for (int i = 0; i < this.platos.length; i++) {
			this.platos[i] = new Plato();
		}
	}

	
	
	void comerDelPlato(int numPlato, int cantidad) {
		if (!comprobarPlato(numPlato))
			return;
		platos[numPlato - 1].sorber(cantidad);
	}

	
	void llenar(int numPlato) {
		if (!comprobarPlato(numPlato))
			return;
		platos[numPlato - 1].llenarse();
	}

	
	void llenar() {
		for (int i = 0; i < platos.length; i++) {
			platos[i].llenarse();
		}
	}

	
	void mostrar() {
		for (int i = 0; i < platos.length; i++) {
			System.out.print("Plato " + (i + 1) + ": ");
			platos[i].mostrar();
		}
	}

	
	private int pedirNumPlatos() {
		int numPlatos;

		do {
			System.out.println("Indica el número de platos de la vajilla. (Min 2)");
			numPlatos = Teclado.leerEntero();
		} while (numPlatos <= 1);

		return numPlatos;

	}

	
	private boolean comprobarPlato(int numPlato) {
		if (numPlato < 1 || numPlato > platos.length) {
			System.out.println("Plato erróneo");
			return false;
		}

		return true;
	}
}//vajilla