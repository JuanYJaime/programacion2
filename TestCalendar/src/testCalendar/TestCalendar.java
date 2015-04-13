package testCalendar;

import java.awt.Font;
import java.awt.MenuItem;
import java.awt.peer.MenuPeer;
import java.util.Calendar;
import java.util.Date;

import utiles.Menu;

public class TestCalendar {
	static Date date  = new Date();
	public static void main(String[] args) {
		Menu menu = new Menu("Calendario", new String[] { "mostrar año",
				"mostrar mes", "mostrar semana", "mostrar dia" });
		realizarOpcion(menu.gestionarMenu());
	}

	private static void realizarOpcion(int opcion) {
		// TODO Auto-generated method stub
	
	Calendar calendar = Calendar.getInstance();
		switch(opcion){
		case 1:
			
			System.out.println(calendar.getInstance());
			System.out.println("adios");
		}
	}
}