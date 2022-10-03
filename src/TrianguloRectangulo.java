
public class TrianguloRectangulo {
	// características
	double b;
	double h;

	public TrianguloRectangulo(double b, double h) {
		// evitar confusiones
		this.b = b;
		this.h = h;
	}

	// área
	double calcularArea() {
		double areaTR;
		areaTR = (b * h) / (2.0);
		return areaTR;
	}

	// ahora el perímetro
	double calcularPerímetro() {
		double perTR;
		perTR = (b + h + calcularH());
		return perTR;
	}

	// para el perímetro, es necesario hallar la hipotenusa
	double calcularH() {
		double H;
		H = Math.pow((b * b) + (h * h), 0.5);
		return H;
	}

	// saber tipo de triángulo con los resultados obtenidos con condicional
	int tipo() {
		int respuesta; // variable
		respuesta = 0; // inicializar
		// si toma el valor de 27, es equilatero
		// si toma el valor de 21, es escaleno
		// si toma el valor de 25, es isósceles
		if ((b == calcularH()) && (b == h) && (h == calcularH())) {
			respuesta = 27;
			return respuesta;
		} else if ((b != h) && (b != calcularH()) && (h != calcularH())) {
			respuesta = 21;
			return respuesta;
		} else {
			respuesta = 25;
			return respuesta;
		}
	}
}

