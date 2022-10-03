
public class Rombo {
	// caracteristicas
	double lado;
	double D;
	double d;

	public Rombo(double lado, double D, double d) {
		// evitar confusiones
		this.lado = lado;
		this.D = D;
		this.d = d;
	}

	// área y perímetro
	double calcularArea() {
		double areaRom;
		areaRom = (D * d) / (2.0);
		return areaRom;
	}

	double calcularPerimetro() {
		double perRom;
		perRom = 4 * lado;
		return perRom;
	}

}
