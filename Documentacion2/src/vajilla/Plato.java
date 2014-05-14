package vajilla;


public class Plato {
	
	private static final int CAPACIDAD_MAXIMA = 200;

	
	private int cantidadActual;

	
	public Plato() {
		this.cantidadActual = CAPACIDAD_MAXIMA;
	}

	
	void sorber(int cantidad) {
		if (cantidad <= 0) {
			System.out.println("Cantidad errónea");
			return;
		}

		System.out.println("Sorbiendo");
		setCantidadActual(getCantidadActual() - cantidad);
	}

	
	void llenarse() {
		setCantidadActual(CAPACIDAD_MAXIMA);
	}

	
	void mostrar() {
		System.out.println(getCantidadActual());
	}

	
	int getCantidadActual() {
		return cantidadActual;
	}

	
	private void setCantidadActual(int cantidadActual) {
		if (cantidadActual == CAPACIDAD_MAXIMA)
			System.out.println("Hasta arriba");

		if (cantidadActual <= 0) {
			System.out.println("PISPAS");
			this.cantidadActual = 0;
			return;
		}

		this.cantidadActual = cantidadActual;
	}
}