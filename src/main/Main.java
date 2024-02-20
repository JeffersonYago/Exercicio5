package main;

import controller.somaController;

public class Main {

	public static void main(String[] args) {
		somaController sC = new somaController();
		int n = 5;
		double ressoma = 0.0;
		System.out.println(sC.soma(n, ressoma));
	}

}
