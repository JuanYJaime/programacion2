package vehiculos;

public class Bicicleta extends Vehiculo {
	private  boolean cadena = true;
	private int pinyones;
	public int getPinyones() {
		return pinyones;
	}
	/**
	 * @param marca
	 * @param modelo
	 * @param ruedas
	 * @param vmax
	 * @param pinyones
	 */
	public Bicicleta( Modelo modelo, float vmax,
			int pinyones) {
		super( modelo, 2, vmax);
		setPinyones(pinyones);
	}
	public void setPinyones(int pinyones) {
		this.pinyones = pinyones;
	}
	@Override
	public String toString() {
		return "Bicicleta [cadena=" + cadena + ", piñones=" + pinyones
				+  ", modelo=" + modelo + ", vmax=" + vmax
				+ "]";
	}
	public boolean isCadena() {
		return cadena;
	}

}
