package vehiculos;

public class Camion extends Automovil {
	boolean remolque;
	/**
	 * @param marca
	 * @param modelo
	 * @param vmax
	 * @param cc
	 * @param i
	 * @param remolque
	 */
	public Camion( Modelo modelo, float vmax, int cc, int i,
			boolean remolque) {
		super( modelo, vmax, cc, i,6);
		setRemolque(remolque);
	}
	
	

	public boolean isRemolque() {
		return remolque;
	}

	public void setRemolque(boolean remolque) {
		this.remolque = remolque;
	}
}
