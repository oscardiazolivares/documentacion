package vajilla;

import utiles.Menu;
import utiles.Teclado;

/**
 * Clase de prueba para comprobar la funcionalidad de las clases Vajilla y Plato.
 * @author d13diolo
 *
 */
class TestVajilla {

	
	public static void main(String[] args) {
		/* Se definen las distintas opciones del menú */
		String[] opciones = { "1 - Llenar un plato concreto",
				"2 - Llenar todos los platos", "3 - Sorber de un plato",
				"4 - Ver el estado de la vajilla" };
		
		/* Creación del menú de opciones */
		Menu menu = new Menu(opciones);

		/* Creación del objeto vajilla */
		Vajilla vajilla = new Vajilla();

		/* Variables locales */
		int numPlato, opcion, cantidad;

		do {
			/* Se muestra el menú y se pide la opción al usuario */
			menu.mostrar();
			opcion = menu.recogerOpcion();

			switch (opcion) {
				/* Case 1: Llenar un plato concreto */
				case 1:
					System.out.println("¿Qué plato quieres llenar?");
					numPlato = Teclado.leerEntero();
					vajilla.llenar(numPlato);
					break;
					
				/* Case 2: Llenar todos los platos */
				case 2:
					vajilla.llenar();
					break;
					
				/* Case 3: Comer de un plato concreto */
				case 3:
					System.out.println("¿Cuánto quieres sorber?");
					cantidad = Teclado.leerEntero();
					System.out.println("¿De qué plato?");
					numPlato = Teclado.leerEntero();
					vajilla.comerDelPlato(numPlato, cantidad);
					break;
					
				/* Case 4: Mostrar el estado de la vajilla */
				case 4:
					vajilla.mostrar();
					break;
					
				/* Case 5: Salir */
				case 5:
					System.out.println("Bye."); //mensaje de salida
					return;
			}
		} while (true);
	}//main
}//TestVajilla