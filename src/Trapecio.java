
public class Trapecio {
	// caracteristicas
	double B;
	double b;
	double h;

	// evitar confusiones con las variables porque se incluyen dos veces en la clase
	public Trapecio(double B, double b, double altura) {
		this.B = B;
		this.b = b;
		this.h = altura;
	}

	// area y perímetro
	double calcularArea() {
		double areaTrap;
		areaTrap = ((B + b) / 2.0) * h;
		return areaTrap;
	}

	double calcularPerimetro() {
		double perTrap;
		perTrap = b + B + (2 * Math.sqrt(Math.pow((B - b) / (2.0), 2)) + Math.pow(h, 2));
		return perTrap;
	}

}
