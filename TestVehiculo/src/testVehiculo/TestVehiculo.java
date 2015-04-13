package testVehiculo;

import utiles.Menu;
import utiles.Teclado;
import vehiculos.Bicicleta;
import vehiculos.Camion;
import vehiculos.Coche;
import vehiculos.Combustible;
import vehiculos.Vehiculo;
import listaVehiculos.ListaVehiculo;
import vehiculos.Modelo;

public class TestVehiculo {

	static ListaVehiculo listaVehiculo = new ListaVehiculo();
	static Menu menu = new Menu("Menu Vehiculos",new String[]{"añadir vehiculo","eliminar Vehiculo","salir"});
	static Menu elegirModelo = new Menu("elige el modelo",Modelo.toArray());
	static Menu elegirCombustible = new Menu("Elige el combustible", Combustible.toArray());
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		realizarOpcion(menu.gestionarMenu());
	}
	private static void realizarOpcion(int opcion) {
		// TODO Auto-generated method stub
		switch(opcion){
		case 1:
			añadirVehiculo();
		}
	}
	private static void añadirVehiculo() {
		Menu elegirtipo = new Menu("elige el tipo de vehiculo", new String[]{"Coche","Camion","Bicicleta"});
		realizaradicion(elegirtipo.gestionarMenu());
		
		
	}
	private static boolean realizaradicion(int opcion) {
		// TODO Auto-generated method stub
		switch(opcion){
		case 1: 

			Coche coche = new Coche(Modelo.getModelo(elegirModelo.gestionarMenu()), (float) Teclado.leerDecimal("deme la velocidad maxima"), Teclado.leerEntero("deme la cilindrada"),elegirCombustible.gestionarMenu() , Teclado.leerEntero("deme el numero de plazas"));
			Vehiculo vehiculo = coche;
			if (listaVehiculo.addCoche(coche)&& listaVehiculo.addVehiculo(vehiculo)) {
				return true;
			}
			break;
		case 2:
			Camion camion = new Camion(Modelo.getModelo(elegirModelo.gestionarMenu()), ((float)Teclado.leerDecimal("deme la velocidad maxima")), Teclado.leerEntero("deme la cilindrada"),elegirCombustible.gestionarMenu(), tieneRemolque('a'));
			Vehiculo vehiculo1 = camion;
			if (listaVehiculo.addCamion(camion)&&listaVehiculo.addVehiculo(vehiculo1)) {
				return true;
			}
		case 3:
			Bicicleta bicicletaaBiciclet
		}
		
	}
	private static boolean tieneRemolque(char c) {
		// TODO Auto-generated method stub
		return false;
	}

}
