package vehiculos;

public class Coche extends Automovil {
	private int nplazas;

	/**
	 * @param marca
	 * @param modelo
	 * @param vmax
	 * @param cc
	 * @param i
	 * @param nplazas
	 */
	public Coche( Modelo modelo, float vmax, int cc, int i,
			int nplazas) {
		super( modelo, vmax, cc, i, 4);
		setNplazas(nplazas);
	}

	

	public int getNplazas() {
		return nplazas;
	}

	public void setNplazas(int nplazas) {
		this.nplazas = nplazas;
	}



	@Override
	public String toString() {
		return "Coche [nplazas=" + nplazas + ",  modelo="
				+ modelo + ", vmax=" + vmax + "]";
	}
	
}
