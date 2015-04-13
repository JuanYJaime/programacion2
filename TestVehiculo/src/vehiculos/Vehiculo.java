package vehiculos;

public class Vehiculo {
	
	protected Modelo modelo;
	protected static int ruedas;
	protected float vmax;
	protected float vactual = 0;
	
	public Modelo getModelo() {
		return modelo;
	}
	public int getRuedas() {
		return ruedas;
	}
	public float getVmax() {
		return vmax;
	}
	
	private void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}
	private static boolean setRuedas(int ruedas1) {
	
		if (ruedas1 < 7) {
			ruedas = ruedas1;
			return true;
		}
		return false;
	}
	private void setVmax(float vmax) {
		this.vmax = vmax;
	}
	/**
	 * @param marca
	 * @param modelo
	 * @param ruedas
	 * @param vmax
	 */
	protected Vehiculo( Modelo modelo, int ruedas, float vmax) {
		super();
		
		setModelo(modelo);
		setRuedas(ruedas);
		setVmax(vmax);
	}

	public boolean acelerar(){

			if (vactual<vmax) {
				vactual++;
				return true;
			}
			return false;
	}
	
	public void parar(){
		vactual = 0;
	}
	public float getVactual() {
		return vactual;
	}
	@Override
	public String toString() {
		return "Vehiculo [ " +  " modelo=" + modelo + ", ruedas="
				+ ruedas + ", vmax=" + vmax + "]";
	}
	
	
}
