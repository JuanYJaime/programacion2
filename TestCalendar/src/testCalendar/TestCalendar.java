package testCalendar;

import java.awt.Font;
import java.awt.MenuItem;
import java.awt.peer.MenuPeer;
import java.util.Calendar;
import java.util.Date;

import utiles.Menu;
/**Crea el programa TestClaseCalendar con estos requisitos:

*Ha de mostrar un menú con los siguientes elementos: Captura el instante, Año, Mes, Día, Día de la semana, Hora, Minutos, Segundos, Salir.
*La primera opción crea una instancia de Calendar con el instante actual
*Calendar.getInstance(); 
*El resto de opciones (excepto Salir) extraen y muestran la información del objeto de tipo Calendar de dos formas distintas:
*Mediante println():
* System.out.println("Año con get: " + ahora.get(Calendar.YEAR)); 
*Mediante format() utilizando todos los formatos posibles:
* System.out.format("Año con format: %tC, %<tY, %<ty %n", ahora); 
*En el caso en que se invoque a cualquiera de las opciones sin haber creado el objeto Calendar capturará la excepción NullPointerException y se mostrará el mensaje "Captura el instante antes de analizarlo." 
**/
public class TestCalendar {
	static Calendar calendar ;
	public static void main(String[] args) {
		Menu menu = new Menu("Calendario", new String[] { "Capturar instante",
				"Año", "mes", "dia","dia de la semana","hora","minutos","segundos","salir" });
		int opcion;
		do {
			opcion = menu.gestionarMenu();
			
			try {
				realizarOpcion(opcion);
			} catch (Exception e) {
				System.err.println("captura el instante antes de analizarlo\n");
			}
		} while (opcion != 9);
	}
/** este metodo realiza las opciones realizadas en el menu instanciado anteriormente 
 * @param int opcion */
	private static void realizarOpcion(int opcion) {
		// TODO Auto-generated method stub
	
	
		switch(opcion){
		case 1:
			calendar = Calendar.getInstance();
			System.out.println("instante capturado");
			break;
		case 2:
		
			System.out.println(calendar.get(Calendar.YEAR));
			break;
		case 3:
			System.out.println(calendar.get(Calendar.MONTH));
			break;
		case 4:
			System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
			break;
		case 5:
			System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
			break;
		case 6:
			System.out.println(calendar.get(Calendar.HOUR));
			break;
		case 7:
			System.out.println(calendar.get(Calendar.MINUTE));
			break;
		case 8:
			System.out.println(calendar.get(Calendar.SECOND));
			break;
		}
	}
}