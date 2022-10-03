
public class Rectangulo {
	// características
	double b;
	double h;

	public Rectangulo(double b, double h) {
		// evitar confusiones
		this.b = b;
		this.h = h;
	}

	// área y perímetro
	double calcularArea() {
		double areaRect;
		areaRect = b * h;
		return areaRect;
	}

	double calcularPerímetro() {
		double perRect;
		perRect = (2 * b) + (2 * h); // suma de los lados
		return perRect;
	}
}
