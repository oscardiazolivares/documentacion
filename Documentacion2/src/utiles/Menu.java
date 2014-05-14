package utiles;

/**
 * Clase que gestiona un men� de opciones
 * 
 * @author Dani Cebrero
 * @version 1.0
 */

public class Menu {
	/** Array de cadenas con las opciones del men�*/
	private String[] opciones;

	
	/** Constructor */
	public Menu(String[] opciones){
		this.opciones = opciones;
	}
	
	
	/** Muestra el men� al usuario con las distintas opciones disponibles */
	public void mostrar(){
		
		for(int i = 0; i < opciones.length; i++)
			System.out.println((i + 1) + "." + opciones[i]);
		
		System.out.println(opciones.length + 1 + ".Salir\n");
	}
	
	/**
	 * Recoge la opci�n seleccionada por el usuario y comprueba que sea v�lida
	 * @return Opci�n v�lida seleccionada por el usuario
	 */
	public int recogerOpcion(){
		int opcionSeleccionada;
			
			do{
				opcionSeleccionada = Teclado.leerEntero();
				
				if(opcionSeleccionada < 1 || opcionSeleccionada > opciones.length + 1)
					System.out.println("La opci�n seleccionada no es v�lida. Int�ntelo de nuevo.");
			}while(opcionSeleccionada < 1 || opcionSeleccionada > opciones.length + 1);
		
		return opcionSeleccionada;
	}
		
}
