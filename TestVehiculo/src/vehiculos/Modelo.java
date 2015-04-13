package vehiculos;

public enum Modelo {
	TOLEDO(Marca.SEAT), SERIE1(Marca.BMW);
	private Marca marca;

	Modelo(Marca marca) {
		this.marca = marca;
	}

	public static Modelo getModelo(int i) {
		for (Modelo modelo : Modelo.values()) {
			if (modelo.ordinal() == i) {
				return modelo;
			}
		}
		return null;
	}

	public static String[] toArray() {
		String[] string = new String[Modelo.values().length];
		int i = 0;
		for (Modelo modelo : Modelo.values()) {
			string[i] = modelo.toString();
			i++;
		}
		return string;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name() + marca.name();
	}
}
