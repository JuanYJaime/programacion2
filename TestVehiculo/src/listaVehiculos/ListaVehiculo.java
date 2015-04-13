package listaVehiculos;

import java.util.ArrayList;

import vehiculos.Bicicleta;
import vehiculos.Camion;
import vehiculos.Coche;
import vehiculos.Vehiculo;

public class ListaVehiculo {

	private ArrayList<Vehiculo> listaVehiculo = new ArrayList();
	private ArrayList<Coche> listaCoche = new ArrayList();
	private ArrayList<Bicicleta> listaBicicleta = new ArrayList();
	private ArrayList<Camion> listaCamion = new ArrayList<Camion>();
	public String[] arrayVehiculos(){
		return  (String[]) listaVehiculo.toArray();
	}
	public boolean Bicicleta(Bicicleta bicicleta){
		if (bicicleta == null) {
			return false;
		}
		listaBicicleta.add(bicicleta);
		return true;
	}
	public boolean addCoche(Coche coche){
		if (coche == null) {
			return false;
		}
		listaCoche.add(coche);
		return true;
		
	}
	public boolean addCamion(Camion camion){
		if (camion == null) {
			return false;
		}
		listaCamion.add(camion);
		return true;
	}
	public boolean addVehiculo(Vehiculo vehiculo){
		if(vehiculo == null){
			return false;
		}
		listaVehiculo.add(vehiculo);
		return true;
	}
	public boolean eliminarCoche(int i){
		return listaCoche.remove(listaCoche.get(i));
	}
	public boolean eliminarCamion(int i){
		return listaCamion.remove(listaCamion.get(i));
	}
	public boolean eliminarBicicleta(int i){
		return listaBicicleta.remove(listaBicicleta.get(i));
	}
	public boolean eliminarVehiculo(int index){
		if (listaVehiculo.remove(listaVehiculo.get(index))) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		return "ListaVehiculo [listaVehiculo=" + listaVehiculo + "]";
	}

	
}
