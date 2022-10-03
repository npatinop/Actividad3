
public class Cuadrado {
	double lado; // caracteristica

	public Cuadrado(double lado) {
		this.lado = lado; // evitar confusion
	}

	// area y perímetro
	double calcularArea() {
		double areaCuad;
		areaCuad = lado * lado;
		return areaCuad;
	}

	double calcularPerímetro() {
		double perCuad;
		perCuad = 4 * lado;
		return perCuad;
	}

}
