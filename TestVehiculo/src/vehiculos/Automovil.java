package vehiculos;

public class Automovil extends Vehiculo {
	private int cc;
	private Combustible combustible;
	private int pdeposito = 100;

	public void setCc(int cc) {
		this.cc = cc;
	}

	public void setCombustible(int i) {
		this.combustible = Combustible.getCombustible(i);
	}

	/**
	 * @param cc
	 * @param combustible
	 */
	public Automovil( Modelo modelo, float vmax, int cc, int combustible,int ruedas) {
		super( modelo, ruedas, vmax);
		setCc(cc);
		setCombustible(cc);
	}
	public boolean consumir(){
		
		if (pdeposito >0) {
			pdeposito = pdeposito - 5;
			return true;
		}
		return false;
		
	}
	public void repostar(){
		pdeposito = 100;
	}

	@Override
	public String toString() {
		return "Automovil [cc=" + cc + ", combustible=" + combustible
				+ ", pdeposito=" + pdeposito + ", modelo="
				+ modelo + ", vmax=" + vmax + "]";
	}
	

}
