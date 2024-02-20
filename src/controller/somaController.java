package controller;

public class somaController {

	public somaController() {
		super();
	}
	public double soma(int n, double ressoma) {
		if (n == 0) {
//para evitar uma divisão por zero, é feita a interrupção das chamadas de função
			return ressoma;
		}else {
			ressoma = ressoma + ( 1 / (double) n);
			return soma(n-1, ressoma);
//� subtraido 1 de n à cada chamada de função
		}
		
	}
}
