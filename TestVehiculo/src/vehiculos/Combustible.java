/**
 * 
 */
package vehiculos;

/**
 * @author juan
 *
 */
public enum Combustible {
	GASOLINA,GASOLEO,BATERIA;
	
	public static String[] toArray(){
		String[] array = new String[Combustible.values().length];
		int i = 0;
		for (Combustible combustible : Combustible.values()) {
			array[i] = combustible.toString();
			i++;
		}
		return array;
	}
	public static Combustible getCombustible(int i){
		for (Combustible combustible : Combustible.values()) {
			if (combustible.ordinal() == i) {
				return combustible;
			}
		}
		return null;
	}
}
