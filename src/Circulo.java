
public class Circulo {
	double radio; // caracteristica

	public Circulo(double radio) {
		this.radio = radio; // evitar confusiones
	}

	// area y perimetro
	double calcularArea() {
		double areaCir;
		areaCir = Math.PI * Math.pow(radio, 2);
		return areaCir;
	}

	double calcularPerimetro() {
		double perCirc;
		perCirc = 2 * Math.PI * radio;
		return perCirc;
	}
}
